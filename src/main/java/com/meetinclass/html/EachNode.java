package com.meetinclass.html;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

class EachNode extends Node {

    private final List<Node> nodes;

    EachNode(Stream<Node> nodes) {
        this.nodes = nodes
                .filter(Objects::nonNull)
                .toList();
    }

    @Override
    void render(StringBuilder sb, int indentLevel) {
        boolean textmode = nodes.stream().anyMatch(node -> node instanceof TextNode) || nodes.isEmpty();
        for (Node node : nodes) {
            node.render(sb, indentLevel);
            if (!textmode)
                sb.append("\n");
        }
    }
}
