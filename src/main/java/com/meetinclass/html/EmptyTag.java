package com.meetinclass.html;

import org.apache.commons.text.StringEscapeUtils;

class EmptyTag extends Node {

    private final String tagName;
    private final Attributes attr;

    EmptyTag(String tagName, Attributes attributes) {
        this.tagName = tagName;
        this.attr = attributes;
    }

    EmptyTag(String tagName) {
        this(tagName, Attributes.of());
    }

    EmptyTag(String tagName, String className) {
        this(tagName, Attributes.of().withClassName(className));
    }

    EmptyTag(String tagName, String className, Attributes attributes) {
        this(tagName, attributes.withClassName(className));
    }

    @Override
    void render(StringBuilder sb, int indentLevel) {
        sb.append(" ".repeat(indentLevel * INDENTATION_WIDTH)).append('<').append(tagName);
        for (Attribute attribute : attr.attributes) {
            sb.append(" ").append(attribute.name());
            if (attribute.value() != null)
                sb.append("=\"").append(StringEscapeUtils.escapeHtml4(attribute.value())).append('\"');
        }
        sb.append(">");
    }
}
