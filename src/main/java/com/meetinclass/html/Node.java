package com.meetinclass.html;

public abstract class Node {

    static int INDENTATION_WIDTH = 4;

    public String render() {
        var sb = new StringBuilder();
        render(sb, 0);
        return sb.toString();
    }

    abstract void render(StringBuilder sb, int indentLevel);
}
