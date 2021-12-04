package com.meetinclass.html;

class RawHtmlNode extends Node {

    private final String html;

    RawHtmlNode(String html) {
        this.html = html;
    }

    @Override
    void render(StringBuilder sb, int indentLevel) {
        sb.append(html.indent(indentLevel * INDENTATION_WIDTH));
    }
}
