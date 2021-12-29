package com.meetinclass.html;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import org.apache.commons.text.StringEscapeUtils;

class ContainerTag extends Node {

    private final String tagName;
    private final Attributes attributes;
    private final List<Node> children;

    ContainerTag(String tagName, Attributes attributes, Stream<Node> nodes) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.children = nodes.filter(Objects::nonNull).toList();
    }

    ContainerTag(String tagName) {
        this(tagName, Attributes.of(), Stream.of());
    }

    ContainerTag(String tagName, String text) {
        this(tagName, Attributes.of(), Stream.of(new TextNode(text)));
    }

    ContainerTag(String tagName, Node[] nodes) {
        this(tagName, Attributes.of(), Stream.of(nodes));
    }

    ContainerTag(String tagName, Stream<Node> nodes) {
        this(tagName, Attributes.of(), nodes);
    }

    ContainerTag(String tagName, Attributes attributes) {
        this(tagName, attributes, Stream.of());
    }

    ContainerTag(String tagName, Attributes attributes, String text) {
        this(tagName, attributes, Stream.of(new TextNode(text)));
    }

    ContainerTag(String tagName, Attributes attributes, Node[] nodes) {
        this(tagName, attributes, Stream.of(nodes));
    }
    
    ContainerTag(String tagName, String className, String text) {
        this(tagName, Attributes.of().withClassName(className), Stream.of(new TextNode(text)));
    }

    ContainerTag(String tagName, String className, Node[] nodes) {
        this(tagName, Attributes.of().withClassName(className), Stream.of(nodes));
    }

    ContainerTag(String tagName, String className, Stream<Node> nodes) {
        this(tagName, Attributes.of().withClassName(className), nodes);
    }

    ContainerTag(String tagName, String className, Attributes attributes) {
        this(tagName, attributes.withClassName(className), Stream.of());
    }

    ContainerTag(String tagName, String className, Attributes attributes, String text) {
        this(tagName, attributes.withClassName(className), Stream.of(new TextNode(text)));
    }

    ContainerTag(String tagName, String className, Attributes attributes, Node[] nodes) {
        this(tagName, attributes.withClassName(className), Stream.of(nodes));
    }

    ContainerTag(String tagName, String className, Attributes attributes, Stream<Node> nodes) {
        this(tagName, attributes.withClassName(className), nodes);
    }

    @Override
    void render(StringBuilder sb, int indentLevel) {
        sb.append(" ".repeat(indentLevel * INDENTATION_WIDTH)).append('<').append(tagName);
        for (Attribute attribute : attributes.attributes) {
            sb.append(" ").append(attribute.name());
            if (attribute.value() != null)
                sb.append("=\"").append(StringEscapeUtils.escapeHtml4(attribute.value())).append('\"');
        }
        sb.append(">");
        boolean textmode = children.stream().anyMatch(node -> node instanceof TextNode) || children.isEmpty();
        for (Node node : children) {
            if (!textmode)
                sb.append("\n");
            node.render(sb, textmode ? 0 : (indentLevel + 1));
        }
        if (!textmode) {
            sb.append("\n");
            sb.append(" ".repeat(indentLevel * INDENTATION_WIDTH));
        }
        sb.append("</").append(tagName).append(">");
    }
}
