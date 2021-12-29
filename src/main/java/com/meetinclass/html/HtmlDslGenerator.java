package com.meetinclass.html;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.lang.model.element.Modifier;

import com.squareup.javapoet.*;
import org.apache.commons.text.CaseUtils;

import com.meetinclass.html.color.NamedColor;

public class HtmlDslGenerator {

    enum Parameter {
        TEXT("text", String.class, false),
        NODES_VARARGS("nodes", Node[].class, true),
        NODES_STREAM("nodes", ParameterizedTypeName.get(Stream.class, Node.class), false),
        ATTRIBUTES("attributes", Attributes.class, false),
        CLASSNAME("className", String.class, false),
        ;
        private final String name;
        private final TypeName type;
        private final boolean varargs;

        Parameter(String name, TypeName type, boolean varargs) {
            this.name = name;
            this.type = type;
            this.varargs = varargs;
        }

        Parameter(String name, Type type, boolean varargs) {
            this(name, TypeName.get(type), varargs);
        }
    }

    public static void main(String[] args) throws IOException, NoSuchMethodException {
        if (args.length != 1)
            throw new RuntimeException("Unexpected destination path for the class to be generated: " + Arrays.asList(args));
        var targetPath = Path.of(args[0]);
        TypeSpec.Builder htmlFactory = TypeSpec.interfaceBuilder("HtmlFactory")
                .addModifiers(Modifier.PUBLIC);
        htmlFactory.addMethod(MethodSpec.methodBuilder("text")
                .addAnnotation(AnnotationSpec.builder(NamedColor.class).addMember("value", "$S", "html-dsl-tag").build())
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(Node.class)
                .addParameter(String.class, "text")
                .addStatement("return new $T(text)", TextNode.class)
                .build());
        htmlFactory.addMethod(MethodSpec.methodBuilder("rawHtml")
                .addAnnotation(AnnotationSpec.builder(NamedColor.class).addMember("value", "$S", "html-dsl-tag").build())
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(Node.class)
                .addParameter(String.class, "html")
                .addStatement("return new $T(html)", RawHtmlNode.class)
                .build());
        htmlFactory.addMethod(MethodSpec.methodBuilder("each")
                .addAnnotation(AnnotationSpec.builder(NamedColor.class).addMember("value", "$S", "html-dsl-tag").build())
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(Node.class)
                .addParameter(Node[].class, "nodes")
                .varargs(true)
                .addStatement("return new $T($T.of(nodes))", EachNode.class, Stream.class)
                .build());
        htmlFactory.addMethod(MethodSpec.methodBuilder("each")
                .addAnnotation(AnnotationSpec.builder(NamedColor.class).addMember("value", "$S", "html-dsl-tag").build())
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(Node.class)
                .addParameter(ParameterizedTypeName.get(Stream.class, Node.class), "nodes")
                .addStatement("return new $T(nodes)", EachNode.class)
                .build());
        htmlFactory.addMethods(TagsAndAttributes.CONTAINER_TAGS.stream()
                .flatMap(containerTag -> Stream.of(
                        buildMethod(containerTag, ContainerTag.class),
                        buildMethod(containerTag, ContainerTag.class, Parameter.TEXT),
                        buildMethod(containerTag, ContainerTag.class, Parameter.NODES_VARARGS),
                        buildMethod(containerTag, ContainerTag.class, Parameter.NODES_STREAM),
                        buildMethod(containerTag, ContainerTag.class, Parameter.ATTRIBUTES),
                        buildMethod(containerTag, ContainerTag.class, Parameter.ATTRIBUTES, Parameter.TEXT),
                        buildMethod(containerTag, ContainerTag.class, Parameter.ATTRIBUTES, Parameter.NODES_VARARGS),
                        buildMethod(containerTag, ContainerTag.class, Parameter.ATTRIBUTES, Parameter.NODES_STREAM),
                        buildMethod(containerTag, ContainerTag.class, Parameter.CLASSNAME, Parameter.TEXT),
                        buildMethod(containerTag, ContainerTag.class, Parameter.CLASSNAME, Parameter.NODES_VARARGS),
                        buildMethod(containerTag, ContainerTag.class, Parameter.CLASSNAME, Parameter.NODES_STREAM),
                        buildMethod(containerTag, ContainerTag.class, Parameter.CLASSNAME, Parameter.ATTRIBUTES),
                        buildMethod(containerTag, ContainerTag.class, Parameter.CLASSNAME, Parameter.ATTRIBUTES, Parameter.TEXT),
                        buildMethod(containerTag, ContainerTag.class, Parameter.CLASSNAME, Parameter.ATTRIBUTES, Parameter.NODES_VARARGS),
                        buildMethod(containerTag, ContainerTag.class, Parameter.CLASSNAME, Parameter.ATTRIBUTES, Parameter.NODES_STREAM)
                ))
                .toList());
        htmlFactory.addMethods(TagsAndAttributes.EMPTY_TAGS.stream()
                .flatMap(emptyTag -> Stream.of(
                        buildMethod(emptyTag, EmptyTag.class),
                        buildMethod(emptyTag, EmptyTag.class, Parameter.ATTRIBUTES),
                        buildMethod(emptyTag, EmptyTag.class, Parameter.CLASSNAME),
                        buildMethod(emptyTag, EmptyTag.class, Parameter.CLASSNAME, Parameter.ATTRIBUTES)
                ))
                .toList());
        JavaFile.builder("com.meetinclass.html", htmlFactory.build())
                .indent("    ")
                .build()
                .writeTo(targetPath);

        TypeSpec.Builder attributeFactory = TypeSpec.interfaceBuilder("AttributeFactory")
                .addModifiers(Modifier.PUBLIC);
        attributeFactory.addMethod(MethodSpec.methodBuilder("attr")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(Attributes.class)
                .addParameter(Attribute[].class, "attributes")
                .varargs(true)
                .addStatement("return $T.of(attributes)", Attributes.class)
                .build());
        attributeFactory.addMethod(MethodSpec.methodBuilder("_attr")
                .addAnnotation(AnnotationSpec.builder(NamedColor.class).addMember("value", "$S", "html-dsl-attribute").build())
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(Attribute.class)
                .addParameter(String.class, "name")
                .addParameter(String.class, "value")
                .beginControlFlow("if ($T.ATTRIBUTES.contains(name))", TagsAndAttributes.class)
                .addStatement("throw new $T(\"Illegal use of _attr(\\\"%s\\\"). Use _%s() instead\".formatted(name, name))", IllegalArgumentException.class)
                .endControlFlow()
                .addStatement("return new $T(name, value)", Attribute.class)
                .build());
        attributeFactory.addMethods(TagsAndAttributes.ATTRIBUTES.stream()
                .flatMap(attribute -> {
                    // The _ prefix fixes 2 problems:
                    // * attribute names contains keywords (like 'for') which doesn't compile.
                    // * some attribute names collide with tag names (like 'style' or 'label'), which makes star imports ambiguous and force us to specify the class HtmlFactory.style... this is painful
                    var methodName = "_" + CaseUtils.toCamelCase(attribute, false, '-');
                    return Stream.of(
                            MethodSpec.methodBuilder(methodName)
                                    .addAnnotation(AnnotationSpec.builder(NamedColor.class).addMember("value", "$S", "html-dsl-attribute").build())
                                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                                    .returns(Attribute.class)
                                    .addParameter(ParameterSpec.builder(String.class, "value").addAnnotation(AnnotationSpec.builder(NamedColor.class).addMember("value", "$S", "html-dsl-attribute").build()).build())
                                    .addStatement("return new $T($S, value)", Attribute.class, attribute)
                                    .build(),
                            MethodSpec.methodBuilder(methodName)
                                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                                    .returns(Attribute.class)
                                    .addStatement("return new $T($S, null)", Attribute.class, attribute)
                                    .build()
                    );
                })
                .toList());
        JavaFile.builder("com.meetinclass.html", attributeFactory.build())
                .indent("    ")
                .build()
                .writeTo(targetPath);
    }

    private static MethodSpec buildMethod(String tag, Type nodeType, Parameter... paramCombination) {
        return MethodSpec.methodBuilder(tag)
                .addAnnotation(AnnotationSpec.builder(NamedColor.class).addMember("value", "$S", "html-dsl-tag").build())
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(Node.class)
                .addParameters(Stream.of(paramCombination)
                        .map(param -> ParameterSpec.builder(param.type, param.name).build())
                        .toList())
                .varargs(Arrays.stream(paramCombination).anyMatch(param -> param.varargs))
                .addStatement("return new $T($L)", nodeType, Stream.concat(Stream.of('"' + tag + '"'), Stream.of(paramCombination).map(param -> param.name)).collect(Collectors.joining(", ")))
                .build();
    }
}
