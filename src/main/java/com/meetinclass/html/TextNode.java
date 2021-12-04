package com.meetinclass.html;

import org.apache.commons.text.StringEscapeUtils;

class TextNode extends Node {

    private final String text;

    TextNode(String text) {
        this.text = text;
    }

    @Override
    void render(StringBuilder sb, int indentLevel) {
        sb.append(StringEscapeUtils.escapeHtml4(text));
    }
}
