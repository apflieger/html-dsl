package com.meetinclass.html;

import java.lang.String;
import java.util.stream.Stream;

public interface HtmlFactory {
    static Node text(String text) {
        return new TextNode(text);
    }

    static Node rawHtml(String html) {
        return new RawHtmlNode(html);
    }

    static Node each(Node... nodes) {
        return new EachNode(Stream.of(nodes));
    }

    static Node each(Stream<Node> nodes) {
        return new EachNode(nodes);
    }

    static Node a() {
        return new ContainerTag("a");
    }

    static Node a(String text) {
        return new ContainerTag("a", text);
    }

    static Node a(Node... nodes) {
        return new ContainerTag("a", nodes);
    }

    static Node a(Stream<Node> nodes) {
        return new ContainerTag("a", nodes);
    }

    static Node a(Attributes attributes) {
        return new ContainerTag("a", attributes);
    }

    static Node a(Attributes attributes, String text) {
        return new ContainerTag("a", attributes, text);
    }

    static Node a(Attributes attributes, Node... nodes) {
        return new ContainerTag("a", attributes, nodes);
    }

    static Node a(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("a", attributes, nodes);
    }

    static Node a(String className, String text) {
        return new ContainerTag("a", className, text);
    }

    static Node a(String className, Node... nodes) {
        return new ContainerTag("a", className, nodes);
    }

    static Node a(String className, Stream<Node> nodes) {
        return new ContainerTag("a", className, nodes);
    }

    static Node a(String className, Attributes attributes) {
        return new ContainerTag("a", className, attributes);
    }

    static Node a(String className, Attributes attributes, String text) {
        return new ContainerTag("a", className, attributes, text);
    }

    static Node a(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("a", className, attributes, nodes);
    }

    static Node a(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("a", className, attributes, nodes);
    }

    static Node abbr() {
        return new ContainerTag("abbr");
    }

    static Node abbr(String text) {
        return new ContainerTag("abbr", text);
    }

    static Node abbr(Node... nodes) {
        return new ContainerTag("abbr", nodes);
    }

    static Node abbr(Stream<Node> nodes) {
        return new ContainerTag("abbr", nodes);
    }

    static Node abbr(Attributes attributes) {
        return new ContainerTag("abbr", attributes);
    }

    static Node abbr(Attributes attributes, String text) {
        return new ContainerTag("abbr", attributes, text);
    }

    static Node abbr(Attributes attributes, Node... nodes) {
        return new ContainerTag("abbr", attributes, nodes);
    }

    static Node abbr(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("abbr", attributes, nodes);
    }

    static Node abbr(String className, String text) {
        return new ContainerTag("abbr", className, text);
    }

    static Node abbr(String className, Node... nodes) {
        return new ContainerTag("abbr", className, nodes);
    }

    static Node abbr(String className, Stream<Node> nodes) {
        return new ContainerTag("abbr", className, nodes);
    }

    static Node abbr(String className, Attributes attributes) {
        return new ContainerTag("abbr", className, attributes);
    }

    static Node abbr(String className, Attributes attributes, String text) {
        return new ContainerTag("abbr", className, attributes, text);
    }

    static Node abbr(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("abbr", className, attributes, nodes);
    }

    static Node abbr(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("abbr", className, attributes, nodes);
    }

    static Node address() {
        return new ContainerTag("address");
    }

    static Node address(String text) {
        return new ContainerTag("address", text);
    }

    static Node address(Node... nodes) {
        return new ContainerTag("address", nodes);
    }

    static Node address(Stream<Node> nodes) {
        return new ContainerTag("address", nodes);
    }

    static Node address(Attributes attributes) {
        return new ContainerTag("address", attributes);
    }

    static Node address(Attributes attributes, String text) {
        return new ContainerTag("address", attributes, text);
    }

    static Node address(Attributes attributes, Node... nodes) {
        return new ContainerTag("address", attributes, nodes);
    }

    static Node address(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("address", attributes, nodes);
    }

    static Node address(String className, String text) {
        return new ContainerTag("address", className, text);
    }

    static Node address(String className, Node... nodes) {
        return new ContainerTag("address", className, nodes);
    }

    static Node address(String className, Stream<Node> nodes) {
        return new ContainerTag("address", className, nodes);
    }

    static Node address(String className, Attributes attributes) {
        return new ContainerTag("address", className, attributes);
    }

    static Node address(String className, Attributes attributes, String text) {
        return new ContainerTag("address", className, attributes, text);
    }

    static Node address(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("address", className, attributes, nodes);
    }

    static Node address(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("address", className, attributes, nodes);
    }

    static Node article() {
        return new ContainerTag("article");
    }

    static Node article(String text) {
        return new ContainerTag("article", text);
    }

    static Node article(Node... nodes) {
        return new ContainerTag("article", nodes);
    }

    static Node article(Stream<Node> nodes) {
        return new ContainerTag("article", nodes);
    }

    static Node article(Attributes attributes) {
        return new ContainerTag("article", attributes);
    }

    static Node article(Attributes attributes, String text) {
        return new ContainerTag("article", attributes, text);
    }

    static Node article(Attributes attributes, Node... nodes) {
        return new ContainerTag("article", attributes, nodes);
    }

    static Node article(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("article", attributes, nodes);
    }

    static Node article(String className, String text) {
        return new ContainerTag("article", className, text);
    }

    static Node article(String className, Node... nodes) {
        return new ContainerTag("article", className, nodes);
    }

    static Node article(String className, Stream<Node> nodes) {
        return new ContainerTag("article", className, nodes);
    }

    static Node article(String className, Attributes attributes) {
        return new ContainerTag("article", className, attributes);
    }

    static Node article(String className, Attributes attributes, String text) {
        return new ContainerTag("article", className, attributes, text);
    }

    static Node article(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("article", className, attributes, nodes);
    }

    static Node article(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("article", className, attributes, nodes);
    }

    static Node aside() {
        return new ContainerTag("aside");
    }

    static Node aside(String text) {
        return new ContainerTag("aside", text);
    }

    static Node aside(Node... nodes) {
        return new ContainerTag("aside", nodes);
    }

    static Node aside(Stream<Node> nodes) {
        return new ContainerTag("aside", nodes);
    }

    static Node aside(Attributes attributes) {
        return new ContainerTag("aside", attributes);
    }

    static Node aside(Attributes attributes, String text) {
        return new ContainerTag("aside", attributes, text);
    }

    static Node aside(Attributes attributes, Node... nodes) {
        return new ContainerTag("aside", attributes, nodes);
    }

    static Node aside(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("aside", attributes, nodes);
    }

    static Node aside(String className, String text) {
        return new ContainerTag("aside", className, text);
    }

    static Node aside(String className, Node... nodes) {
        return new ContainerTag("aside", className, nodes);
    }

    static Node aside(String className, Stream<Node> nodes) {
        return new ContainerTag("aside", className, nodes);
    }

    static Node aside(String className, Attributes attributes) {
        return new ContainerTag("aside", className, attributes);
    }

    static Node aside(String className, Attributes attributes, String text) {
        return new ContainerTag("aside", className, attributes, text);
    }

    static Node aside(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("aside", className, attributes, nodes);
    }

    static Node aside(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("aside", className, attributes, nodes);
    }

    static Node audio() {
        return new ContainerTag("audio");
    }

    static Node audio(String text) {
        return new ContainerTag("audio", text);
    }

    static Node audio(Node... nodes) {
        return new ContainerTag("audio", nodes);
    }

    static Node audio(Stream<Node> nodes) {
        return new ContainerTag("audio", nodes);
    }

    static Node audio(Attributes attributes) {
        return new ContainerTag("audio", attributes);
    }

    static Node audio(Attributes attributes, String text) {
        return new ContainerTag("audio", attributes, text);
    }

    static Node audio(Attributes attributes, Node... nodes) {
        return new ContainerTag("audio", attributes, nodes);
    }

    static Node audio(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("audio", attributes, nodes);
    }

    static Node audio(String className, String text) {
        return new ContainerTag("audio", className, text);
    }

    static Node audio(String className, Node... nodes) {
        return new ContainerTag("audio", className, nodes);
    }

    static Node audio(String className, Stream<Node> nodes) {
        return new ContainerTag("audio", className, nodes);
    }

    static Node audio(String className, Attributes attributes) {
        return new ContainerTag("audio", className, attributes);
    }

    static Node audio(String className, Attributes attributes, String text) {
        return new ContainerTag("audio", className, attributes, text);
    }

    static Node audio(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("audio", className, attributes, nodes);
    }

    static Node audio(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("audio", className, attributes, nodes);
    }

    static Node b() {
        return new ContainerTag("b");
    }

    static Node b(String text) {
        return new ContainerTag("b", text);
    }

    static Node b(Node... nodes) {
        return new ContainerTag("b", nodes);
    }

    static Node b(Stream<Node> nodes) {
        return new ContainerTag("b", nodes);
    }

    static Node b(Attributes attributes) {
        return new ContainerTag("b", attributes);
    }

    static Node b(Attributes attributes, String text) {
        return new ContainerTag("b", attributes, text);
    }

    static Node b(Attributes attributes, Node... nodes) {
        return new ContainerTag("b", attributes, nodes);
    }

    static Node b(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("b", attributes, nodes);
    }

    static Node b(String className, String text) {
        return new ContainerTag("b", className, text);
    }

    static Node b(String className, Node... nodes) {
        return new ContainerTag("b", className, nodes);
    }

    static Node b(String className, Stream<Node> nodes) {
        return new ContainerTag("b", className, nodes);
    }

    static Node b(String className, Attributes attributes) {
        return new ContainerTag("b", className, attributes);
    }

    static Node b(String className, Attributes attributes, String text) {
        return new ContainerTag("b", className, attributes, text);
    }

    static Node b(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("b", className, attributes, nodes);
    }

    static Node b(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("b", className, attributes, nodes);
    }

    static Node bdi() {
        return new ContainerTag("bdi");
    }

    static Node bdi(String text) {
        return new ContainerTag("bdi", text);
    }

    static Node bdi(Node... nodes) {
        return new ContainerTag("bdi", nodes);
    }

    static Node bdi(Stream<Node> nodes) {
        return new ContainerTag("bdi", nodes);
    }

    static Node bdi(Attributes attributes) {
        return new ContainerTag("bdi", attributes);
    }

    static Node bdi(Attributes attributes, String text) {
        return new ContainerTag("bdi", attributes, text);
    }

    static Node bdi(Attributes attributes, Node... nodes) {
        return new ContainerTag("bdi", attributes, nodes);
    }

    static Node bdi(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("bdi", attributes, nodes);
    }

    static Node bdi(String className, String text) {
        return new ContainerTag("bdi", className, text);
    }

    static Node bdi(String className, Node... nodes) {
        return new ContainerTag("bdi", className, nodes);
    }

    static Node bdi(String className, Stream<Node> nodes) {
        return new ContainerTag("bdi", className, nodes);
    }

    static Node bdi(String className, Attributes attributes) {
        return new ContainerTag("bdi", className, attributes);
    }

    static Node bdi(String className, Attributes attributes, String text) {
        return new ContainerTag("bdi", className, attributes, text);
    }

    static Node bdi(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("bdi", className, attributes, nodes);
    }

    static Node bdi(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("bdi", className, attributes, nodes);
    }

    static Node bdo() {
        return new ContainerTag("bdo");
    }

    static Node bdo(String text) {
        return new ContainerTag("bdo", text);
    }

    static Node bdo(Node... nodes) {
        return new ContainerTag("bdo", nodes);
    }

    static Node bdo(Stream<Node> nodes) {
        return new ContainerTag("bdo", nodes);
    }

    static Node bdo(Attributes attributes) {
        return new ContainerTag("bdo", attributes);
    }

    static Node bdo(Attributes attributes, String text) {
        return new ContainerTag("bdo", attributes, text);
    }

    static Node bdo(Attributes attributes, Node... nodes) {
        return new ContainerTag("bdo", attributes, nodes);
    }

    static Node bdo(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("bdo", attributes, nodes);
    }

    static Node bdo(String className, String text) {
        return new ContainerTag("bdo", className, text);
    }

    static Node bdo(String className, Node... nodes) {
        return new ContainerTag("bdo", className, nodes);
    }

    static Node bdo(String className, Stream<Node> nodes) {
        return new ContainerTag("bdo", className, nodes);
    }

    static Node bdo(String className, Attributes attributes) {
        return new ContainerTag("bdo", className, attributes);
    }

    static Node bdo(String className, Attributes attributes, String text) {
        return new ContainerTag("bdo", className, attributes, text);
    }

    static Node bdo(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("bdo", className, attributes, nodes);
    }

    static Node bdo(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("bdo", className, attributes, nodes);
    }

    static Node blockquote() {
        return new ContainerTag("blockquote");
    }

    static Node blockquote(String text) {
        return new ContainerTag("blockquote", text);
    }

    static Node blockquote(Node... nodes) {
        return new ContainerTag("blockquote", nodes);
    }

    static Node blockquote(Stream<Node> nodes) {
        return new ContainerTag("blockquote", nodes);
    }

    static Node blockquote(Attributes attributes) {
        return new ContainerTag("blockquote", attributes);
    }

    static Node blockquote(Attributes attributes, String text) {
        return new ContainerTag("blockquote", attributes, text);
    }

    static Node blockquote(Attributes attributes, Node... nodes) {
        return new ContainerTag("blockquote", attributes, nodes);
    }

    static Node blockquote(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("blockquote", attributes, nodes);
    }

    static Node blockquote(String className, String text) {
        return new ContainerTag("blockquote", className, text);
    }

    static Node blockquote(String className, Node... nodes) {
        return new ContainerTag("blockquote", className, nodes);
    }

    static Node blockquote(String className, Stream<Node> nodes) {
        return new ContainerTag("blockquote", className, nodes);
    }

    static Node blockquote(String className, Attributes attributes) {
        return new ContainerTag("blockquote", className, attributes);
    }

    static Node blockquote(String className, Attributes attributes, String text) {
        return new ContainerTag("blockquote", className, attributes, text);
    }

    static Node blockquote(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("blockquote", className, attributes, nodes);
    }

    static Node blockquote(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("blockquote", className, attributes, nodes);
    }

    static Node body() {
        return new ContainerTag("body");
    }

    static Node body(String text) {
        return new ContainerTag("body", text);
    }

    static Node body(Node... nodes) {
        return new ContainerTag("body", nodes);
    }

    static Node body(Stream<Node> nodes) {
        return new ContainerTag("body", nodes);
    }

    static Node body(Attributes attributes) {
        return new ContainerTag("body", attributes);
    }

    static Node body(Attributes attributes, String text) {
        return new ContainerTag("body", attributes, text);
    }

    static Node body(Attributes attributes, Node... nodes) {
        return new ContainerTag("body", attributes, nodes);
    }

    static Node body(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("body", attributes, nodes);
    }

    static Node body(String className, String text) {
        return new ContainerTag("body", className, text);
    }

    static Node body(String className, Node... nodes) {
        return new ContainerTag("body", className, nodes);
    }

    static Node body(String className, Stream<Node> nodes) {
        return new ContainerTag("body", className, nodes);
    }

    static Node body(String className, Attributes attributes) {
        return new ContainerTag("body", className, attributes);
    }

    static Node body(String className, Attributes attributes, String text) {
        return new ContainerTag("body", className, attributes, text);
    }

    static Node body(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("body", className, attributes, nodes);
    }

    static Node body(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("body", className, attributes, nodes);
    }

    static Node button() {
        return new ContainerTag("button");
    }

    static Node button(String text) {
        return new ContainerTag("button", text);
    }

    static Node button(Node... nodes) {
        return new ContainerTag("button", nodes);
    }

    static Node button(Stream<Node> nodes) {
        return new ContainerTag("button", nodes);
    }

    static Node button(Attributes attributes) {
        return new ContainerTag("button", attributes);
    }

    static Node button(Attributes attributes, String text) {
        return new ContainerTag("button", attributes, text);
    }

    static Node button(Attributes attributes, Node... nodes) {
        return new ContainerTag("button", attributes, nodes);
    }

    static Node button(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("button", attributes, nodes);
    }

    static Node button(String className, String text) {
        return new ContainerTag("button", className, text);
    }

    static Node button(String className, Node... nodes) {
        return new ContainerTag("button", className, nodes);
    }

    static Node button(String className, Stream<Node> nodes) {
        return new ContainerTag("button", className, nodes);
    }

    static Node button(String className, Attributes attributes) {
        return new ContainerTag("button", className, attributes);
    }

    static Node button(String className, Attributes attributes, String text) {
        return new ContainerTag("button", className, attributes, text);
    }

    static Node button(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("button", className, attributes, nodes);
    }

    static Node button(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("button", className, attributes, nodes);
    }

    static Node canvas() {
        return new ContainerTag("canvas");
    }

    static Node canvas(String text) {
        return new ContainerTag("canvas", text);
    }

    static Node canvas(Node... nodes) {
        return new ContainerTag("canvas", nodes);
    }

    static Node canvas(Stream<Node> nodes) {
        return new ContainerTag("canvas", nodes);
    }

    static Node canvas(Attributes attributes) {
        return new ContainerTag("canvas", attributes);
    }

    static Node canvas(Attributes attributes, String text) {
        return new ContainerTag("canvas", attributes, text);
    }

    static Node canvas(Attributes attributes, Node... nodes) {
        return new ContainerTag("canvas", attributes, nodes);
    }

    static Node canvas(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("canvas", attributes, nodes);
    }

    static Node canvas(String className, String text) {
        return new ContainerTag("canvas", className, text);
    }

    static Node canvas(String className, Node... nodes) {
        return new ContainerTag("canvas", className, nodes);
    }

    static Node canvas(String className, Stream<Node> nodes) {
        return new ContainerTag("canvas", className, nodes);
    }

    static Node canvas(String className, Attributes attributes) {
        return new ContainerTag("canvas", className, attributes);
    }

    static Node canvas(String className, Attributes attributes, String text) {
        return new ContainerTag("canvas", className, attributes, text);
    }

    static Node canvas(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("canvas", className, attributes, nodes);
    }

    static Node canvas(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("canvas", className, attributes, nodes);
    }

    static Node caption() {
        return new ContainerTag("caption");
    }

    static Node caption(String text) {
        return new ContainerTag("caption", text);
    }

    static Node caption(Node... nodes) {
        return new ContainerTag("caption", nodes);
    }

    static Node caption(Stream<Node> nodes) {
        return new ContainerTag("caption", nodes);
    }

    static Node caption(Attributes attributes) {
        return new ContainerTag("caption", attributes);
    }

    static Node caption(Attributes attributes, String text) {
        return new ContainerTag("caption", attributes, text);
    }

    static Node caption(Attributes attributes, Node... nodes) {
        return new ContainerTag("caption", attributes, nodes);
    }

    static Node caption(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("caption", attributes, nodes);
    }

    static Node caption(String className, String text) {
        return new ContainerTag("caption", className, text);
    }

    static Node caption(String className, Node... nodes) {
        return new ContainerTag("caption", className, nodes);
    }

    static Node caption(String className, Stream<Node> nodes) {
        return new ContainerTag("caption", className, nodes);
    }

    static Node caption(String className, Attributes attributes) {
        return new ContainerTag("caption", className, attributes);
    }

    static Node caption(String className, Attributes attributes, String text) {
        return new ContainerTag("caption", className, attributes, text);
    }

    static Node caption(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("caption", className, attributes, nodes);
    }

    static Node caption(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("caption", className, attributes, nodes);
    }

    static Node cite() {
        return new ContainerTag("cite");
    }

    static Node cite(String text) {
        return new ContainerTag("cite", text);
    }

    static Node cite(Node... nodes) {
        return new ContainerTag("cite", nodes);
    }

    static Node cite(Stream<Node> nodes) {
        return new ContainerTag("cite", nodes);
    }

    static Node cite(Attributes attributes) {
        return new ContainerTag("cite", attributes);
    }

    static Node cite(Attributes attributes, String text) {
        return new ContainerTag("cite", attributes, text);
    }

    static Node cite(Attributes attributes, Node... nodes) {
        return new ContainerTag("cite", attributes, nodes);
    }

    static Node cite(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("cite", attributes, nodes);
    }

    static Node cite(String className, String text) {
        return new ContainerTag("cite", className, text);
    }

    static Node cite(String className, Node... nodes) {
        return new ContainerTag("cite", className, nodes);
    }

    static Node cite(String className, Stream<Node> nodes) {
        return new ContainerTag("cite", className, nodes);
    }

    static Node cite(String className, Attributes attributes) {
        return new ContainerTag("cite", className, attributes);
    }

    static Node cite(String className, Attributes attributes, String text) {
        return new ContainerTag("cite", className, attributes, text);
    }

    static Node cite(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("cite", className, attributes, nodes);
    }

    static Node cite(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("cite", className, attributes, nodes);
    }

    static Node code() {
        return new ContainerTag("code");
    }

    static Node code(String text) {
        return new ContainerTag("code", text);
    }

    static Node code(Node... nodes) {
        return new ContainerTag("code", nodes);
    }

    static Node code(Stream<Node> nodes) {
        return new ContainerTag("code", nodes);
    }

    static Node code(Attributes attributes) {
        return new ContainerTag("code", attributes);
    }

    static Node code(Attributes attributes, String text) {
        return new ContainerTag("code", attributes, text);
    }

    static Node code(Attributes attributes, Node... nodes) {
        return new ContainerTag("code", attributes, nodes);
    }

    static Node code(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("code", attributes, nodes);
    }

    static Node code(String className, String text) {
        return new ContainerTag("code", className, text);
    }

    static Node code(String className, Node... nodes) {
        return new ContainerTag("code", className, nodes);
    }

    static Node code(String className, Stream<Node> nodes) {
        return new ContainerTag("code", className, nodes);
    }

    static Node code(String className, Attributes attributes) {
        return new ContainerTag("code", className, attributes);
    }

    static Node code(String className, Attributes attributes, String text) {
        return new ContainerTag("code", className, attributes, text);
    }

    static Node code(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("code", className, attributes, nodes);
    }

    static Node code(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("code", className, attributes, nodes);
    }

    static Node colgroup() {
        return new ContainerTag("colgroup");
    }

    static Node colgroup(String text) {
        return new ContainerTag("colgroup", text);
    }

    static Node colgroup(Node... nodes) {
        return new ContainerTag("colgroup", nodes);
    }

    static Node colgroup(Stream<Node> nodes) {
        return new ContainerTag("colgroup", nodes);
    }

    static Node colgroup(Attributes attributes) {
        return new ContainerTag("colgroup", attributes);
    }

    static Node colgroup(Attributes attributes, String text) {
        return new ContainerTag("colgroup", attributes, text);
    }

    static Node colgroup(Attributes attributes, Node... nodes) {
        return new ContainerTag("colgroup", attributes, nodes);
    }

    static Node colgroup(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("colgroup", attributes, nodes);
    }

    static Node colgroup(String className, String text) {
        return new ContainerTag("colgroup", className, text);
    }

    static Node colgroup(String className, Node... nodes) {
        return new ContainerTag("colgroup", className, nodes);
    }

    static Node colgroup(String className, Stream<Node> nodes) {
        return new ContainerTag("colgroup", className, nodes);
    }

    static Node colgroup(String className, Attributes attributes) {
        return new ContainerTag("colgroup", className, attributes);
    }

    static Node colgroup(String className, Attributes attributes, String text) {
        return new ContainerTag("colgroup", className, attributes, text);
    }

    static Node colgroup(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("colgroup", className, attributes, nodes);
    }

    static Node colgroup(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("colgroup", className, attributes, nodes);
    }

    static Node datalist() {
        return new ContainerTag("datalist");
    }

    static Node datalist(String text) {
        return new ContainerTag("datalist", text);
    }

    static Node datalist(Node... nodes) {
        return new ContainerTag("datalist", nodes);
    }

    static Node datalist(Stream<Node> nodes) {
        return new ContainerTag("datalist", nodes);
    }

    static Node datalist(Attributes attributes) {
        return new ContainerTag("datalist", attributes);
    }

    static Node datalist(Attributes attributes, String text) {
        return new ContainerTag("datalist", attributes, text);
    }

    static Node datalist(Attributes attributes, Node... nodes) {
        return new ContainerTag("datalist", attributes, nodes);
    }

    static Node datalist(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("datalist", attributes, nodes);
    }

    static Node datalist(String className, String text) {
        return new ContainerTag("datalist", className, text);
    }

    static Node datalist(String className, Node... nodes) {
        return new ContainerTag("datalist", className, nodes);
    }

    static Node datalist(String className, Stream<Node> nodes) {
        return new ContainerTag("datalist", className, nodes);
    }

    static Node datalist(String className, Attributes attributes) {
        return new ContainerTag("datalist", className, attributes);
    }

    static Node datalist(String className, Attributes attributes, String text) {
        return new ContainerTag("datalist", className, attributes, text);
    }

    static Node datalist(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("datalist", className, attributes, nodes);
    }

    static Node datalist(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("datalist", className, attributes, nodes);
    }

    static Node dd() {
        return new ContainerTag("dd");
    }

    static Node dd(String text) {
        return new ContainerTag("dd", text);
    }

    static Node dd(Node... nodes) {
        return new ContainerTag("dd", nodes);
    }

    static Node dd(Stream<Node> nodes) {
        return new ContainerTag("dd", nodes);
    }

    static Node dd(Attributes attributes) {
        return new ContainerTag("dd", attributes);
    }

    static Node dd(Attributes attributes, String text) {
        return new ContainerTag("dd", attributes, text);
    }

    static Node dd(Attributes attributes, Node... nodes) {
        return new ContainerTag("dd", attributes, nodes);
    }

    static Node dd(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dd", attributes, nodes);
    }

    static Node dd(String className, String text) {
        return new ContainerTag("dd", className, text);
    }

    static Node dd(String className, Node... nodes) {
        return new ContainerTag("dd", className, nodes);
    }

    static Node dd(String className, Stream<Node> nodes) {
        return new ContainerTag("dd", className, nodes);
    }

    static Node dd(String className, Attributes attributes) {
        return new ContainerTag("dd", className, attributes);
    }

    static Node dd(String className, Attributes attributes, String text) {
        return new ContainerTag("dd", className, attributes, text);
    }

    static Node dd(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("dd", className, attributes, nodes);
    }

    static Node dd(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dd", className, attributes, nodes);
    }

    static Node del() {
        return new ContainerTag("del");
    }

    static Node del(String text) {
        return new ContainerTag("del", text);
    }

    static Node del(Node... nodes) {
        return new ContainerTag("del", nodes);
    }

    static Node del(Stream<Node> nodes) {
        return new ContainerTag("del", nodes);
    }

    static Node del(Attributes attributes) {
        return new ContainerTag("del", attributes);
    }

    static Node del(Attributes attributes, String text) {
        return new ContainerTag("del", attributes, text);
    }

    static Node del(Attributes attributes, Node... nodes) {
        return new ContainerTag("del", attributes, nodes);
    }

    static Node del(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("del", attributes, nodes);
    }

    static Node del(String className, String text) {
        return new ContainerTag("del", className, text);
    }

    static Node del(String className, Node... nodes) {
        return new ContainerTag("del", className, nodes);
    }

    static Node del(String className, Stream<Node> nodes) {
        return new ContainerTag("del", className, nodes);
    }

    static Node del(String className, Attributes attributes) {
        return new ContainerTag("del", className, attributes);
    }

    static Node del(String className, Attributes attributes, String text) {
        return new ContainerTag("del", className, attributes, text);
    }

    static Node del(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("del", className, attributes, nodes);
    }

    static Node del(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("del", className, attributes, nodes);
    }

    static Node details() {
        return new ContainerTag("details");
    }

    static Node details(String text) {
        return new ContainerTag("details", text);
    }

    static Node details(Node... nodes) {
        return new ContainerTag("details", nodes);
    }

    static Node details(Stream<Node> nodes) {
        return new ContainerTag("details", nodes);
    }

    static Node details(Attributes attributes) {
        return new ContainerTag("details", attributes);
    }

    static Node details(Attributes attributes, String text) {
        return new ContainerTag("details", attributes, text);
    }

    static Node details(Attributes attributes, Node... nodes) {
        return new ContainerTag("details", attributes, nodes);
    }

    static Node details(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("details", attributes, nodes);
    }

    static Node details(String className, String text) {
        return new ContainerTag("details", className, text);
    }

    static Node details(String className, Node... nodes) {
        return new ContainerTag("details", className, nodes);
    }

    static Node details(String className, Stream<Node> nodes) {
        return new ContainerTag("details", className, nodes);
    }

    static Node details(String className, Attributes attributes) {
        return new ContainerTag("details", className, attributes);
    }

    static Node details(String className, Attributes attributes, String text) {
        return new ContainerTag("details", className, attributes, text);
    }

    static Node details(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("details", className, attributes, nodes);
    }

    static Node details(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("details", className, attributes, nodes);
    }

    static Node dfn() {
        return new ContainerTag("dfn");
    }

    static Node dfn(String text) {
        return new ContainerTag("dfn", text);
    }

    static Node dfn(Node... nodes) {
        return new ContainerTag("dfn", nodes);
    }

    static Node dfn(Stream<Node> nodes) {
        return new ContainerTag("dfn", nodes);
    }

    static Node dfn(Attributes attributes) {
        return new ContainerTag("dfn", attributes);
    }

    static Node dfn(Attributes attributes, String text) {
        return new ContainerTag("dfn", attributes, text);
    }

    static Node dfn(Attributes attributes, Node... nodes) {
        return new ContainerTag("dfn", attributes, nodes);
    }

    static Node dfn(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dfn", attributes, nodes);
    }

    static Node dfn(String className, String text) {
        return new ContainerTag("dfn", className, text);
    }

    static Node dfn(String className, Node... nodes) {
        return new ContainerTag("dfn", className, nodes);
    }

    static Node dfn(String className, Stream<Node> nodes) {
        return new ContainerTag("dfn", className, nodes);
    }

    static Node dfn(String className, Attributes attributes) {
        return new ContainerTag("dfn", className, attributes);
    }

    static Node dfn(String className, Attributes attributes, String text) {
        return new ContainerTag("dfn", className, attributes, text);
    }

    static Node dfn(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("dfn", className, attributes, nodes);
    }

    static Node dfn(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dfn", className, attributes, nodes);
    }

    static Node dialog() {
        return new ContainerTag("dialog");
    }

    static Node dialog(String text) {
        return new ContainerTag("dialog", text);
    }

    static Node dialog(Node... nodes) {
        return new ContainerTag("dialog", nodes);
    }

    static Node dialog(Stream<Node> nodes) {
        return new ContainerTag("dialog", nodes);
    }

    static Node dialog(Attributes attributes) {
        return new ContainerTag("dialog", attributes);
    }

    static Node dialog(Attributes attributes, String text) {
        return new ContainerTag("dialog", attributes, text);
    }

    static Node dialog(Attributes attributes, Node... nodes) {
        return new ContainerTag("dialog", attributes, nodes);
    }

    static Node dialog(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dialog", attributes, nodes);
    }

    static Node dialog(String className, String text) {
        return new ContainerTag("dialog", className, text);
    }

    static Node dialog(String className, Node... nodes) {
        return new ContainerTag("dialog", className, nodes);
    }

    static Node dialog(String className, Stream<Node> nodes) {
        return new ContainerTag("dialog", className, nodes);
    }

    static Node dialog(String className, Attributes attributes) {
        return new ContainerTag("dialog", className, attributes);
    }

    static Node dialog(String className, Attributes attributes, String text) {
        return new ContainerTag("dialog", className, attributes, text);
    }

    static Node dialog(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("dialog", className, attributes, nodes);
    }

    static Node dialog(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dialog", className, attributes, nodes);
    }

    static Node div() {
        return new ContainerTag("div");
    }

    static Node div(String text) {
        return new ContainerTag("div", text);
    }

    static Node div(Node... nodes) {
        return new ContainerTag("div", nodes);
    }

    static Node div(Stream<Node> nodes) {
        return new ContainerTag("div", nodes);
    }

    static Node div(Attributes attributes) {
        return new ContainerTag("div", attributes);
    }

    static Node div(Attributes attributes, String text) {
        return new ContainerTag("div", attributes, text);
    }

    static Node div(Attributes attributes, Node... nodes) {
        return new ContainerTag("div", attributes, nodes);
    }

    static Node div(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("div", attributes, nodes);
    }

    static Node div(String className, String text) {
        return new ContainerTag("div", className, text);
    }

    static Node div(String className, Node... nodes) {
        return new ContainerTag("div", className, nodes);
    }

    static Node div(String className, Stream<Node> nodes) {
        return new ContainerTag("div", className, nodes);
    }

    static Node div(String className, Attributes attributes) {
        return new ContainerTag("div", className, attributes);
    }

    static Node div(String className, Attributes attributes, String text) {
        return new ContainerTag("div", className, attributes, text);
    }

    static Node div(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("div", className, attributes, nodes);
    }

    static Node div(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("div", className, attributes, nodes);
    }

    static Node dl() {
        return new ContainerTag("dl");
    }

    static Node dl(String text) {
        return new ContainerTag("dl", text);
    }

    static Node dl(Node... nodes) {
        return new ContainerTag("dl", nodes);
    }

    static Node dl(Stream<Node> nodes) {
        return new ContainerTag("dl", nodes);
    }

    static Node dl(Attributes attributes) {
        return new ContainerTag("dl", attributes);
    }

    static Node dl(Attributes attributes, String text) {
        return new ContainerTag("dl", attributes, text);
    }

    static Node dl(Attributes attributes, Node... nodes) {
        return new ContainerTag("dl", attributes, nodes);
    }

    static Node dl(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dl", attributes, nodes);
    }

    static Node dl(String className, String text) {
        return new ContainerTag("dl", className, text);
    }

    static Node dl(String className, Node... nodes) {
        return new ContainerTag("dl", className, nodes);
    }

    static Node dl(String className, Stream<Node> nodes) {
        return new ContainerTag("dl", className, nodes);
    }

    static Node dl(String className, Attributes attributes) {
        return new ContainerTag("dl", className, attributes);
    }

    static Node dl(String className, Attributes attributes, String text) {
        return new ContainerTag("dl", className, attributes, text);
    }

    static Node dl(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("dl", className, attributes, nodes);
    }

    static Node dl(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dl", className, attributes, nodes);
    }

    static Node dt() {
        return new ContainerTag("dt");
    }

    static Node dt(String text) {
        return new ContainerTag("dt", text);
    }

    static Node dt(Node... nodes) {
        return new ContainerTag("dt", nodes);
    }

    static Node dt(Stream<Node> nodes) {
        return new ContainerTag("dt", nodes);
    }

    static Node dt(Attributes attributes) {
        return new ContainerTag("dt", attributes);
    }

    static Node dt(Attributes attributes, String text) {
        return new ContainerTag("dt", attributes, text);
    }

    static Node dt(Attributes attributes, Node... nodes) {
        return new ContainerTag("dt", attributes, nodes);
    }

    static Node dt(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dt", attributes, nodes);
    }

    static Node dt(String className, String text) {
        return new ContainerTag("dt", className, text);
    }

    static Node dt(String className, Node... nodes) {
        return new ContainerTag("dt", className, nodes);
    }

    static Node dt(String className, Stream<Node> nodes) {
        return new ContainerTag("dt", className, nodes);
    }

    static Node dt(String className, Attributes attributes) {
        return new ContainerTag("dt", className, attributes);
    }

    static Node dt(String className, Attributes attributes, String text) {
        return new ContainerTag("dt", className, attributes, text);
    }

    static Node dt(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("dt", className, attributes, nodes);
    }

    static Node dt(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dt", className, attributes, nodes);
    }

    static Node em() {
        return new ContainerTag("em");
    }

    static Node em(String text) {
        return new ContainerTag("em", text);
    }

    static Node em(Node... nodes) {
        return new ContainerTag("em", nodes);
    }

    static Node em(Stream<Node> nodes) {
        return new ContainerTag("em", nodes);
    }

    static Node em(Attributes attributes) {
        return new ContainerTag("em", attributes);
    }

    static Node em(Attributes attributes, String text) {
        return new ContainerTag("em", attributes, text);
    }

    static Node em(Attributes attributes, Node... nodes) {
        return new ContainerTag("em", attributes, nodes);
    }

    static Node em(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("em", attributes, nodes);
    }

    static Node em(String className, String text) {
        return new ContainerTag("em", className, text);
    }

    static Node em(String className, Node... nodes) {
        return new ContainerTag("em", className, nodes);
    }

    static Node em(String className, Stream<Node> nodes) {
        return new ContainerTag("em", className, nodes);
    }

    static Node em(String className, Attributes attributes) {
        return new ContainerTag("em", className, attributes);
    }

    static Node em(String className, Attributes attributes, String text) {
        return new ContainerTag("em", className, attributes, text);
    }

    static Node em(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("em", className, attributes, nodes);
    }

    static Node em(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("em", className, attributes, nodes);
    }

    static Node fieldset() {
        return new ContainerTag("fieldset");
    }

    static Node fieldset(String text) {
        return new ContainerTag("fieldset", text);
    }

    static Node fieldset(Node... nodes) {
        return new ContainerTag("fieldset", nodes);
    }

    static Node fieldset(Stream<Node> nodes) {
        return new ContainerTag("fieldset", nodes);
    }

    static Node fieldset(Attributes attributes) {
        return new ContainerTag("fieldset", attributes);
    }

    static Node fieldset(Attributes attributes, String text) {
        return new ContainerTag("fieldset", attributes, text);
    }

    static Node fieldset(Attributes attributes, Node... nodes) {
        return new ContainerTag("fieldset", attributes, nodes);
    }

    static Node fieldset(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("fieldset", attributes, nodes);
    }

    static Node fieldset(String className, String text) {
        return new ContainerTag("fieldset", className, text);
    }

    static Node fieldset(String className, Node... nodes) {
        return new ContainerTag("fieldset", className, nodes);
    }

    static Node fieldset(String className, Stream<Node> nodes) {
        return new ContainerTag("fieldset", className, nodes);
    }

    static Node fieldset(String className, Attributes attributes) {
        return new ContainerTag("fieldset", className, attributes);
    }

    static Node fieldset(String className, Attributes attributes, String text) {
        return new ContainerTag("fieldset", className, attributes, text);
    }

    static Node fieldset(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("fieldset", className, attributes, nodes);
    }

    static Node fieldset(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("fieldset", className, attributes, nodes);
    }

    static Node figcaption() {
        return new ContainerTag("figcaption");
    }

    static Node figcaption(String text) {
        return new ContainerTag("figcaption", text);
    }

    static Node figcaption(Node... nodes) {
        return new ContainerTag("figcaption", nodes);
    }

    static Node figcaption(Stream<Node> nodes) {
        return new ContainerTag("figcaption", nodes);
    }

    static Node figcaption(Attributes attributes) {
        return new ContainerTag("figcaption", attributes);
    }

    static Node figcaption(Attributes attributes, String text) {
        return new ContainerTag("figcaption", attributes, text);
    }

    static Node figcaption(Attributes attributes, Node... nodes) {
        return new ContainerTag("figcaption", attributes, nodes);
    }

    static Node figcaption(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("figcaption", attributes, nodes);
    }

    static Node figcaption(String className, String text) {
        return new ContainerTag("figcaption", className, text);
    }

    static Node figcaption(String className, Node... nodes) {
        return new ContainerTag("figcaption", className, nodes);
    }

    static Node figcaption(String className, Stream<Node> nodes) {
        return new ContainerTag("figcaption", className, nodes);
    }

    static Node figcaption(String className, Attributes attributes) {
        return new ContainerTag("figcaption", className, attributes);
    }

    static Node figcaption(String className, Attributes attributes, String text) {
        return new ContainerTag("figcaption", className, attributes, text);
    }

    static Node figcaption(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("figcaption", className, attributes, nodes);
    }

    static Node figcaption(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("figcaption", className, attributes, nodes);
    }

    static Node figure() {
        return new ContainerTag("figure");
    }

    static Node figure(String text) {
        return new ContainerTag("figure", text);
    }

    static Node figure(Node... nodes) {
        return new ContainerTag("figure", nodes);
    }

    static Node figure(Stream<Node> nodes) {
        return new ContainerTag("figure", nodes);
    }

    static Node figure(Attributes attributes) {
        return new ContainerTag("figure", attributes);
    }

    static Node figure(Attributes attributes, String text) {
        return new ContainerTag("figure", attributes, text);
    }

    static Node figure(Attributes attributes, Node... nodes) {
        return new ContainerTag("figure", attributes, nodes);
    }

    static Node figure(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("figure", attributes, nodes);
    }

    static Node figure(String className, String text) {
        return new ContainerTag("figure", className, text);
    }

    static Node figure(String className, Node... nodes) {
        return new ContainerTag("figure", className, nodes);
    }

    static Node figure(String className, Stream<Node> nodes) {
        return new ContainerTag("figure", className, nodes);
    }

    static Node figure(String className, Attributes attributes) {
        return new ContainerTag("figure", className, attributes);
    }

    static Node figure(String className, Attributes attributes, String text) {
        return new ContainerTag("figure", className, attributes, text);
    }

    static Node figure(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("figure", className, attributes, nodes);
    }

    static Node figure(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("figure", className, attributes, nodes);
    }

    static Node footer() {
        return new ContainerTag("footer");
    }

    static Node footer(String text) {
        return new ContainerTag("footer", text);
    }

    static Node footer(Node... nodes) {
        return new ContainerTag("footer", nodes);
    }

    static Node footer(Stream<Node> nodes) {
        return new ContainerTag("footer", nodes);
    }

    static Node footer(Attributes attributes) {
        return new ContainerTag("footer", attributes);
    }

    static Node footer(Attributes attributes, String text) {
        return new ContainerTag("footer", attributes, text);
    }

    static Node footer(Attributes attributes, Node... nodes) {
        return new ContainerTag("footer", attributes, nodes);
    }

    static Node footer(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("footer", attributes, nodes);
    }

    static Node footer(String className, String text) {
        return new ContainerTag("footer", className, text);
    }

    static Node footer(String className, Node... nodes) {
        return new ContainerTag("footer", className, nodes);
    }

    static Node footer(String className, Stream<Node> nodes) {
        return new ContainerTag("footer", className, nodes);
    }

    static Node footer(String className, Attributes attributes) {
        return new ContainerTag("footer", className, attributes);
    }

    static Node footer(String className, Attributes attributes, String text) {
        return new ContainerTag("footer", className, attributes, text);
    }

    static Node footer(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("footer", className, attributes, nodes);
    }

    static Node footer(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("footer", className, attributes, nodes);
    }

    static Node form() {
        return new ContainerTag("form");
    }

    static Node form(String text) {
        return new ContainerTag("form", text);
    }

    static Node form(Node... nodes) {
        return new ContainerTag("form", nodes);
    }

    static Node form(Stream<Node> nodes) {
        return new ContainerTag("form", nodes);
    }

    static Node form(Attributes attributes) {
        return new ContainerTag("form", attributes);
    }

    static Node form(Attributes attributes, String text) {
        return new ContainerTag("form", attributes, text);
    }

    static Node form(Attributes attributes, Node... nodes) {
        return new ContainerTag("form", attributes, nodes);
    }

    static Node form(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("form", attributes, nodes);
    }

    static Node form(String className, String text) {
        return new ContainerTag("form", className, text);
    }

    static Node form(String className, Node... nodes) {
        return new ContainerTag("form", className, nodes);
    }

    static Node form(String className, Stream<Node> nodes) {
        return new ContainerTag("form", className, nodes);
    }

    static Node form(String className, Attributes attributes) {
        return new ContainerTag("form", className, attributes);
    }

    static Node form(String className, Attributes attributes, String text) {
        return new ContainerTag("form", className, attributes, text);
    }

    static Node form(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("form", className, attributes, nodes);
    }

    static Node form(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("form", className, attributes, nodes);
    }

    static Node h1() {
        return new ContainerTag("h1");
    }

    static Node h1(String text) {
        return new ContainerTag("h1", text);
    }

    static Node h1(Node... nodes) {
        return new ContainerTag("h1", nodes);
    }

    static Node h1(Stream<Node> nodes) {
        return new ContainerTag("h1", nodes);
    }

    static Node h1(Attributes attributes) {
        return new ContainerTag("h1", attributes);
    }

    static Node h1(Attributes attributes, String text) {
        return new ContainerTag("h1", attributes, text);
    }

    static Node h1(Attributes attributes, Node... nodes) {
        return new ContainerTag("h1", attributes, nodes);
    }

    static Node h1(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h1", attributes, nodes);
    }

    static Node h1(String className, String text) {
        return new ContainerTag("h1", className, text);
    }

    static Node h1(String className, Node... nodes) {
        return new ContainerTag("h1", className, nodes);
    }

    static Node h1(String className, Stream<Node> nodes) {
        return new ContainerTag("h1", className, nodes);
    }

    static Node h1(String className, Attributes attributes) {
        return new ContainerTag("h1", className, attributes);
    }

    static Node h1(String className, Attributes attributes, String text) {
        return new ContainerTag("h1", className, attributes, text);
    }

    static Node h1(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("h1", className, attributes, nodes);
    }

    static Node h1(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h1", className, attributes, nodes);
    }

    static Node h2() {
        return new ContainerTag("h2");
    }

    static Node h2(String text) {
        return new ContainerTag("h2", text);
    }

    static Node h2(Node... nodes) {
        return new ContainerTag("h2", nodes);
    }

    static Node h2(Stream<Node> nodes) {
        return new ContainerTag("h2", nodes);
    }

    static Node h2(Attributes attributes) {
        return new ContainerTag("h2", attributes);
    }

    static Node h2(Attributes attributes, String text) {
        return new ContainerTag("h2", attributes, text);
    }

    static Node h2(Attributes attributes, Node... nodes) {
        return new ContainerTag("h2", attributes, nodes);
    }

    static Node h2(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h2", attributes, nodes);
    }

    static Node h2(String className, String text) {
        return new ContainerTag("h2", className, text);
    }

    static Node h2(String className, Node... nodes) {
        return new ContainerTag("h2", className, nodes);
    }

    static Node h2(String className, Stream<Node> nodes) {
        return new ContainerTag("h2", className, nodes);
    }

    static Node h2(String className, Attributes attributes) {
        return new ContainerTag("h2", className, attributes);
    }

    static Node h2(String className, Attributes attributes, String text) {
        return new ContainerTag("h2", className, attributes, text);
    }

    static Node h2(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("h2", className, attributes, nodes);
    }

    static Node h2(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h2", className, attributes, nodes);
    }

    static Node h3() {
        return new ContainerTag("h3");
    }

    static Node h3(String text) {
        return new ContainerTag("h3", text);
    }

    static Node h3(Node... nodes) {
        return new ContainerTag("h3", nodes);
    }

    static Node h3(Stream<Node> nodes) {
        return new ContainerTag("h3", nodes);
    }

    static Node h3(Attributes attributes) {
        return new ContainerTag("h3", attributes);
    }

    static Node h3(Attributes attributes, String text) {
        return new ContainerTag("h3", attributes, text);
    }

    static Node h3(Attributes attributes, Node... nodes) {
        return new ContainerTag("h3", attributes, nodes);
    }

    static Node h3(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h3", attributes, nodes);
    }

    static Node h3(String className, String text) {
        return new ContainerTag("h3", className, text);
    }

    static Node h3(String className, Node... nodes) {
        return new ContainerTag("h3", className, nodes);
    }

    static Node h3(String className, Stream<Node> nodes) {
        return new ContainerTag("h3", className, nodes);
    }

    static Node h3(String className, Attributes attributes) {
        return new ContainerTag("h3", className, attributes);
    }

    static Node h3(String className, Attributes attributes, String text) {
        return new ContainerTag("h3", className, attributes, text);
    }

    static Node h3(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("h3", className, attributes, nodes);
    }

    static Node h3(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h3", className, attributes, nodes);
    }

    static Node h4() {
        return new ContainerTag("h4");
    }

    static Node h4(String text) {
        return new ContainerTag("h4", text);
    }

    static Node h4(Node... nodes) {
        return new ContainerTag("h4", nodes);
    }

    static Node h4(Stream<Node> nodes) {
        return new ContainerTag("h4", nodes);
    }

    static Node h4(Attributes attributes) {
        return new ContainerTag("h4", attributes);
    }

    static Node h4(Attributes attributes, String text) {
        return new ContainerTag("h4", attributes, text);
    }

    static Node h4(Attributes attributes, Node... nodes) {
        return new ContainerTag("h4", attributes, nodes);
    }

    static Node h4(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h4", attributes, nodes);
    }

    static Node h4(String className, String text) {
        return new ContainerTag("h4", className, text);
    }

    static Node h4(String className, Node... nodes) {
        return new ContainerTag("h4", className, nodes);
    }

    static Node h4(String className, Stream<Node> nodes) {
        return new ContainerTag("h4", className, nodes);
    }

    static Node h4(String className, Attributes attributes) {
        return new ContainerTag("h4", className, attributes);
    }

    static Node h4(String className, Attributes attributes, String text) {
        return new ContainerTag("h4", className, attributes, text);
    }

    static Node h4(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("h4", className, attributes, nodes);
    }

    static Node h4(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h4", className, attributes, nodes);
    }

    static Node h5() {
        return new ContainerTag("h5");
    }

    static Node h5(String text) {
        return new ContainerTag("h5", text);
    }

    static Node h5(Node... nodes) {
        return new ContainerTag("h5", nodes);
    }

    static Node h5(Stream<Node> nodes) {
        return new ContainerTag("h5", nodes);
    }

    static Node h5(Attributes attributes) {
        return new ContainerTag("h5", attributes);
    }

    static Node h5(Attributes attributes, String text) {
        return new ContainerTag("h5", attributes, text);
    }

    static Node h5(Attributes attributes, Node... nodes) {
        return new ContainerTag("h5", attributes, nodes);
    }

    static Node h5(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h5", attributes, nodes);
    }

    static Node h5(String className, String text) {
        return new ContainerTag("h5", className, text);
    }

    static Node h5(String className, Node... nodes) {
        return new ContainerTag("h5", className, nodes);
    }

    static Node h5(String className, Stream<Node> nodes) {
        return new ContainerTag("h5", className, nodes);
    }

    static Node h5(String className, Attributes attributes) {
        return new ContainerTag("h5", className, attributes);
    }

    static Node h5(String className, Attributes attributes, String text) {
        return new ContainerTag("h5", className, attributes, text);
    }

    static Node h5(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("h5", className, attributes, nodes);
    }

    static Node h5(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h5", className, attributes, nodes);
    }

    static Node h6() {
        return new ContainerTag("h6");
    }

    static Node h6(String text) {
        return new ContainerTag("h6", text);
    }

    static Node h6(Node... nodes) {
        return new ContainerTag("h6", nodes);
    }

    static Node h6(Stream<Node> nodes) {
        return new ContainerTag("h6", nodes);
    }

    static Node h6(Attributes attributes) {
        return new ContainerTag("h6", attributes);
    }

    static Node h6(Attributes attributes, String text) {
        return new ContainerTag("h6", attributes, text);
    }

    static Node h6(Attributes attributes, Node... nodes) {
        return new ContainerTag("h6", attributes, nodes);
    }

    static Node h6(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h6", attributes, nodes);
    }

    static Node h6(String className, String text) {
        return new ContainerTag("h6", className, text);
    }

    static Node h6(String className, Node... nodes) {
        return new ContainerTag("h6", className, nodes);
    }

    static Node h6(String className, Stream<Node> nodes) {
        return new ContainerTag("h6", className, nodes);
    }

    static Node h6(String className, Attributes attributes) {
        return new ContainerTag("h6", className, attributes);
    }

    static Node h6(String className, Attributes attributes, String text) {
        return new ContainerTag("h6", className, attributes, text);
    }

    static Node h6(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("h6", className, attributes, nodes);
    }

    static Node h6(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h6", className, attributes, nodes);
    }

    static Node head() {
        return new ContainerTag("head");
    }

    static Node head(String text) {
        return new ContainerTag("head", text);
    }

    static Node head(Node... nodes) {
        return new ContainerTag("head", nodes);
    }

    static Node head(Stream<Node> nodes) {
        return new ContainerTag("head", nodes);
    }

    static Node head(Attributes attributes) {
        return new ContainerTag("head", attributes);
    }

    static Node head(Attributes attributes, String text) {
        return new ContainerTag("head", attributes, text);
    }

    static Node head(Attributes attributes, Node... nodes) {
        return new ContainerTag("head", attributes, nodes);
    }

    static Node head(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("head", attributes, nodes);
    }

    static Node head(String className, String text) {
        return new ContainerTag("head", className, text);
    }

    static Node head(String className, Node... nodes) {
        return new ContainerTag("head", className, nodes);
    }

    static Node head(String className, Stream<Node> nodes) {
        return new ContainerTag("head", className, nodes);
    }

    static Node head(String className, Attributes attributes) {
        return new ContainerTag("head", className, attributes);
    }

    static Node head(String className, Attributes attributes, String text) {
        return new ContainerTag("head", className, attributes, text);
    }

    static Node head(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("head", className, attributes, nodes);
    }

    static Node head(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("head", className, attributes, nodes);
    }

    static Node header() {
        return new ContainerTag("header");
    }

    static Node header(String text) {
        return new ContainerTag("header", text);
    }

    static Node header(Node... nodes) {
        return new ContainerTag("header", nodes);
    }

    static Node header(Stream<Node> nodes) {
        return new ContainerTag("header", nodes);
    }

    static Node header(Attributes attributes) {
        return new ContainerTag("header", attributes);
    }

    static Node header(Attributes attributes, String text) {
        return new ContainerTag("header", attributes, text);
    }

    static Node header(Attributes attributes, Node... nodes) {
        return new ContainerTag("header", attributes, nodes);
    }

    static Node header(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("header", attributes, nodes);
    }

    static Node header(String className, String text) {
        return new ContainerTag("header", className, text);
    }

    static Node header(String className, Node... nodes) {
        return new ContainerTag("header", className, nodes);
    }

    static Node header(String className, Stream<Node> nodes) {
        return new ContainerTag("header", className, nodes);
    }

    static Node header(String className, Attributes attributes) {
        return new ContainerTag("header", className, attributes);
    }

    static Node header(String className, Attributes attributes, String text) {
        return new ContainerTag("header", className, attributes, text);
    }

    static Node header(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("header", className, attributes, nodes);
    }

    static Node header(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("header", className, attributes, nodes);
    }

    static Node html() {
        return new ContainerTag("html");
    }

    static Node html(String text) {
        return new ContainerTag("html", text);
    }

    static Node html(Node... nodes) {
        return new ContainerTag("html", nodes);
    }

    static Node html(Stream<Node> nodes) {
        return new ContainerTag("html", nodes);
    }

    static Node html(Attributes attributes) {
        return new ContainerTag("html", attributes);
    }

    static Node html(Attributes attributes, String text) {
        return new ContainerTag("html", attributes, text);
    }

    static Node html(Attributes attributes, Node... nodes) {
        return new ContainerTag("html", attributes, nodes);
    }

    static Node html(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("html", attributes, nodes);
    }

    static Node html(String className, String text) {
        return new ContainerTag("html", className, text);
    }

    static Node html(String className, Node... nodes) {
        return new ContainerTag("html", className, nodes);
    }

    static Node html(String className, Stream<Node> nodes) {
        return new ContainerTag("html", className, nodes);
    }

    static Node html(String className, Attributes attributes) {
        return new ContainerTag("html", className, attributes);
    }

    static Node html(String className, Attributes attributes, String text) {
        return new ContainerTag("html", className, attributes, text);
    }

    static Node html(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("html", className, attributes, nodes);
    }

    static Node html(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("html", className, attributes, nodes);
    }

    static Node i() {
        return new ContainerTag("i");
    }

    static Node i(String text) {
        return new ContainerTag("i", text);
    }

    static Node i(Node... nodes) {
        return new ContainerTag("i", nodes);
    }

    static Node i(Stream<Node> nodes) {
        return new ContainerTag("i", nodes);
    }

    static Node i(Attributes attributes) {
        return new ContainerTag("i", attributes);
    }

    static Node i(Attributes attributes, String text) {
        return new ContainerTag("i", attributes, text);
    }

    static Node i(Attributes attributes, Node... nodes) {
        return new ContainerTag("i", attributes, nodes);
    }

    static Node i(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("i", attributes, nodes);
    }

    static Node i(String className, String text) {
        return new ContainerTag("i", className, text);
    }

    static Node i(String className, Node... nodes) {
        return new ContainerTag("i", className, nodes);
    }

    static Node i(String className, Stream<Node> nodes) {
        return new ContainerTag("i", className, nodes);
    }

    static Node i(String className, Attributes attributes) {
        return new ContainerTag("i", className, attributes);
    }

    static Node i(String className, Attributes attributes, String text) {
        return new ContainerTag("i", className, attributes, text);
    }

    static Node i(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("i", className, attributes, nodes);
    }

    static Node i(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("i", className, attributes, nodes);
    }

    static Node iframe() {
        return new ContainerTag("iframe");
    }

    static Node iframe(String text) {
        return new ContainerTag("iframe", text);
    }

    static Node iframe(Node... nodes) {
        return new ContainerTag("iframe", nodes);
    }

    static Node iframe(Stream<Node> nodes) {
        return new ContainerTag("iframe", nodes);
    }

    static Node iframe(Attributes attributes) {
        return new ContainerTag("iframe", attributes);
    }

    static Node iframe(Attributes attributes, String text) {
        return new ContainerTag("iframe", attributes, text);
    }

    static Node iframe(Attributes attributes, Node... nodes) {
        return new ContainerTag("iframe", attributes, nodes);
    }

    static Node iframe(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("iframe", attributes, nodes);
    }

    static Node iframe(String className, String text) {
        return new ContainerTag("iframe", className, text);
    }

    static Node iframe(String className, Node... nodes) {
        return new ContainerTag("iframe", className, nodes);
    }

    static Node iframe(String className, Stream<Node> nodes) {
        return new ContainerTag("iframe", className, nodes);
    }

    static Node iframe(String className, Attributes attributes) {
        return new ContainerTag("iframe", className, attributes);
    }

    static Node iframe(String className, Attributes attributes, String text) {
        return new ContainerTag("iframe", className, attributes, text);
    }

    static Node iframe(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("iframe", className, attributes, nodes);
    }

    static Node iframe(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("iframe", className, attributes, nodes);
    }

    static Node ins() {
        return new ContainerTag("ins");
    }

    static Node ins(String text) {
        return new ContainerTag("ins", text);
    }

    static Node ins(Node... nodes) {
        return new ContainerTag("ins", nodes);
    }

    static Node ins(Stream<Node> nodes) {
        return new ContainerTag("ins", nodes);
    }

    static Node ins(Attributes attributes) {
        return new ContainerTag("ins", attributes);
    }

    static Node ins(Attributes attributes, String text) {
        return new ContainerTag("ins", attributes, text);
    }

    static Node ins(Attributes attributes, Node... nodes) {
        return new ContainerTag("ins", attributes, nodes);
    }

    static Node ins(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("ins", attributes, nodes);
    }

    static Node ins(String className, String text) {
        return new ContainerTag("ins", className, text);
    }

    static Node ins(String className, Node... nodes) {
        return new ContainerTag("ins", className, nodes);
    }

    static Node ins(String className, Stream<Node> nodes) {
        return new ContainerTag("ins", className, nodes);
    }

    static Node ins(String className, Attributes attributes) {
        return new ContainerTag("ins", className, attributes);
    }

    static Node ins(String className, Attributes attributes, String text) {
        return new ContainerTag("ins", className, attributes, text);
    }

    static Node ins(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("ins", className, attributes, nodes);
    }

    static Node ins(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("ins", className, attributes, nodes);
    }

    static Node kbd() {
        return new ContainerTag("kbd");
    }

    static Node kbd(String text) {
        return new ContainerTag("kbd", text);
    }

    static Node kbd(Node... nodes) {
        return new ContainerTag("kbd", nodes);
    }

    static Node kbd(Stream<Node> nodes) {
        return new ContainerTag("kbd", nodes);
    }

    static Node kbd(Attributes attributes) {
        return new ContainerTag("kbd", attributes);
    }

    static Node kbd(Attributes attributes, String text) {
        return new ContainerTag("kbd", attributes, text);
    }

    static Node kbd(Attributes attributes, Node... nodes) {
        return new ContainerTag("kbd", attributes, nodes);
    }

    static Node kbd(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("kbd", attributes, nodes);
    }

    static Node kbd(String className, String text) {
        return new ContainerTag("kbd", className, text);
    }

    static Node kbd(String className, Node... nodes) {
        return new ContainerTag("kbd", className, nodes);
    }

    static Node kbd(String className, Stream<Node> nodes) {
        return new ContainerTag("kbd", className, nodes);
    }

    static Node kbd(String className, Attributes attributes) {
        return new ContainerTag("kbd", className, attributes);
    }

    static Node kbd(String className, Attributes attributes, String text) {
        return new ContainerTag("kbd", className, attributes, text);
    }

    static Node kbd(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("kbd", className, attributes, nodes);
    }

    static Node kbd(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("kbd", className, attributes, nodes);
    }

    static Node label() {
        return new ContainerTag("label");
    }

    static Node label(String text) {
        return new ContainerTag("label", text);
    }

    static Node label(Node... nodes) {
        return new ContainerTag("label", nodes);
    }

    static Node label(Stream<Node> nodes) {
        return new ContainerTag("label", nodes);
    }

    static Node label(Attributes attributes) {
        return new ContainerTag("label", attributes);
    }

    static Node label(Attributes attributes, String text) {
        return new ContainerTag("label", attributes, text);
    }

    static Node label(Attributes attributes, Node... nodes) {
        return new ContainerTag("label", attributes, nodes);
    }

    static Node label(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("label", attributes, nodes);
    }

    static Node label(String className, String text) {
        return new ContainerTag("label", className, text);
    }

    static Node label(String className, Node... nodes) {
        return new ContainerTag("label", className, nodes);
    }

    static Node label(String className, Stream<Node> nodes) {
        return new ContainerTag("label", className, nodes);
    }

    static Node label(String className, Attributes attributes) {
        return new ContainerTag("label", className, attributes);
    }

    static Node label(String className, Attributes attributes, String text) {
        return new ContainerTag("label", className, attributes, text);
    }

    static Node label(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("label", className, attributes, nodes);
    }

    static Node label(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("label", className, attributes, nodes);
    }

    static Node legend() {
        return new ContainerTag("legend");
    }

    static Node legend(String text) {
        return new ContainerTag("legend", text);
    }

    static Node legend(Node... nodes) {
        return new ContainerTag("legend", nodes);
    }

    static Node legend(Stream<Node> nodes) {
        return new ContainerTag("legend", nodes);
    }

    static Node legend(Attributes attributes) {
        return new ContainerTag("legend", attributes);
    }

    static Node legend(Attributes attributes, String text) {
        return new ContainerTag("legend", attributes, text);
    }

    static Node legend(Attributes attributes, Node... nodes) {
        return new ContainerTag("legend", attributes, nodes);
    }

    static Node legend(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("legend", attributes, nodes);
    }

    static Node legend(String className, String text) {
        return new ContainerTag("legend", className, text);
    }

    static Node legend(String className, Node... nodes) {
        return new ContainerTag("legend", className, nodes);
    }

    static Node legend(String className, Stream<Node> nodes) {
        return new ContainerTag("legend", className, nodes);
    }

    static Node legend(String className, Attributes attributes) {
        return new ContainerTag("legend", className, attributes);
    }

    static Node legend(String className, Attributes attributes, String text) {
        return new ContainerTag("legend", className, attributes, text);
    }

    static Node legend(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("legend", className, attributes, nodes);
    }

    static Node legend(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("legend", className, attributes, nodes);
    }

    static Node li() {
        return new ContainerTag("li");
    }

    static Node li(String text) {
        return new ContainerTag("li", text);
    }

    static Node li(Node... nodes) {
        return new ContainerTag("li", nodes);
    }

    static Node li(Stream<Node> nodes) {
        return new ContainerTag("li", nodes);
    }

    static Node li(Attributes attributes) {
        return new ContainerTag("li", attributes);
    }

    static Node li(Attributes attributes, String text) {
        return new ContainerTag("li", attributes, text);
    }

    static Node li(Attributes attributes, Node... nodes) {
        return new ContainerTag("li", attributes, nodes);
    }

    static Node li(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("li", attributes, nodes);
    }

    static Node li(String className, String text) {
        return new ContainerTag("li", className, text);
    }

    static Node li(String className, Node... nodes) {
        return new ContainerTag("li", className, nodes);
    }

    static Node li(String className, Stream<Node> nodes) {
        return new ContainerTag("li", className, nodes);
    }

    static Node li(String className, Attributes attributes) {
        return new ContainerTag("li", className, attributes);
    }

    static Node li(String className, Attributes attributes, String text) {
        return new ContainerTag("li", className, attributes, text);
    }

    static Node li(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("li", className, attributes, nodes);
    }

    static Node li(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("li", className, attributes, nodes);
    }

    static Node generate() {
        return new ContainerTag("generate");
    }

    static Node generate(String text) {
        return new ContainerTag("generate", text);
    }

    static Node generate(Node... nodes) {
        return new ContainerTag("generate", nodes);
    }

    static Node generate(Stream<Node> nodes) {
        return new ContainerTag("generate", nodes);
    }

    static Node generate(Attributes attributes) {
        return new ContainerTag("generate", attributes);
    }

    static Node generate(Attributes attributes, String text) {
        return new ContainerTag("generate", attributes, text);
    }

    static Node generate(Attributes attributes, Node... nodes) {
        return new ContainerTag("generate", attributes, nodes);
    }

    static Node generate(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("generate", attributes, nodes);
    }

    static Node generate(String className, String text) {
        return new ContainerTag("generate", className, text);
    }

    static Node generate(String className, Node... nodes) {
        return new ContainerTag("generate", className, nodes);
    }

    static Node generate(String className, Stream<Node> nodes) {
        return new ContainerTag("generate", className, nodes);
    }

    static Node generate(String className, Attributes attributes) {
        return new ContainerTag("generate", className, attributes);
    }

    static Node generate(String className, Attributes attributes, String text) {
        return new ContainerTag("generate", className, attributes, text);
    }

    static Node generate(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("generate", className, attributes, nodes);
    }

    static Node generate(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("generate", className, attributes, nodes);
    }

    static Node main() {
        return new ContainerTag("main");
    }

    static Node main(String text) {
        return new ContainerTag("main", text);
    }

    static Node main(Node... nodes) {
        return new ContainerTag("main", nodes);
    }

    static Node main(Stream<Node> nodes) {
        return new ContainerTag("main", nodes);
    }

    static Node main(Attributes attributes) {
        return new ContainerTag("main", attributes);
    }

    static Node main(Attributes attributes, String text) {
        return new ContainerTag("main", attributes, text);
    }

    static Node main(Attributes attributes, Node... nodes) {
        return new ContainerTag("main", attributes, nodes);
    }

    static Node main(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("main", attributes, nodes);
    }

    static Node main(String className, String text) {
        return new ContainerTag("main", className, text);
    }

    static Node main(String className, Node... nodes) {
        return new ContainerTag("main", className, nodes);
    }

    static Node main(String className, Stream<Node> nodes) {
        return new ContainerTag("main", className, nodes);
    }

    static Node main(String className, Attributes attributes) {
        return new ContainerTag("main", className, attributes);
    }

    static Node main(String className, Attributes attributes, String text) {
        return new ContainerTag("main", className, attributes, text);
    }

    static Node main(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("main", className, attributes, nodes);
    }

    static Node main(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("main", className, attributes, nodes);
    }

    static Node map() {
        return new ContainerTag("map");
    }

    static Node map(String text) {
        return new ContainerTag("map", text);
    }

    static Node map(Node... nodes) {
        return new ContainerTag("map", nodes);
    }

    static Node map(Stream<Node> nodes) {
        return new ContainerTag("map", nodes);
    }

    static Node map(Attributes attributes) {
        return new ContainerTag("map", attributes);
    }

    static Node map(Attributes attributes, String text) {
        return new ContainerTag("map", attributes, text);
    }

    static Node map(Attributes attributes, Node... nodes) {
        return new ContainerTag("map", attributes, nodes);
    }

    static Node map(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("map", attributes, nodes);
    }

    static Node map(String className, String text) {
        return new ContainerTag("map", className, text);
    }

    static Node map(String className, Node... nodes) {
        return new ContainerTag("map", className, nodes);
    }

    static Node map(String className, Stream<Node> nodes) {
        return new ContainerTag("map", className, nodes);
    }

    static Node map(String className, Attributes attributes) {
        return new ContainerTag("map", className, attributes);
    }

    static Node map(String className, Attributes attributes, String text) {
        return new ContainerTag("map", className, attributes, text);
    }

    static Node map(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("map", className, attributes, nodes);
    }

    static Node map(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("map", className, attributes, nodes);
    }

    static Node mark() {
        return new ContainerTag("mark");
    }

    static Node mark(String text) {
        return new ContainerTag("mark", text);
    }

    static Node mark(Node... nodes) {
        return new ContainerTag("mark", nodes);
    }

    static Node mark(Stream<Node> nodes) {
        return new ContainerTag("mark", nodes);
    }

    static Node mark(Attributes attributes) {
        return new ContainerTag("mark", attributes);
    }

    static Node mark(Attributes attributes, String text) {
        return new ContainerTag("mark", attributes, text);
    }

    static Node mark(Attributes attributes, Node... nodes) {
        return new ContainerTag("mark", attributes, nodes);
    }

    static Node mark(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("mark", attributes, nodes);
    }

    static Node mark(String className, String text) {
        return new ContainerTag("mark", className, text);
    }

    static Node mark(String className, Node... nodes) {
        return new ContainerTag("mark", className, nodes);
    }

    static Node mark(String className, Stream<Node> nodes) {
        return new ContainerTag("mark", className, nodes);
    }

    static Node mark(String className, Attributes attributes) {
        return new ContainerTag("mark", className, attributes);
    }

    static Node mark(String className, Attributes attributes, String text) {
        return new ContainerTag("mark", className, attributes, text);
    }

    static Node mark(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("mark", className, attributes, nodes);
    }

    static Node mark(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("mark", className, attributes, nodes);
    }

    static Node menu() {
        return new ContainerTag("menu");
    }

    static Node menu(String text) {
        return new ContainerTag("menu", text);
    }

    static Node menu(Node... nodes) {
        return new ContainerTag("menu", nodes);
    }

    static Node menu(Stream<Node> nodes) {
        return new ContainerTag("menu", nodes);
    }

    static Node menu(Attributes attributes) {
        return new ContainerTag("menu", attributes);
    }

    static Node menu(Attributes attributes, String text) {
        return new ContainerTag("menu", attributes, text);
    }

    static Node menu(Attributes attributes, Node... nodes) {
        return new ContainerTag("menu", attributes, nodes);
    }

    static Node menu(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("menu", attributes, nodes);
    }

    static Node menu(String className, String text) {
        return new ContainerTag("menu", className, text);
    }

    static Node menu(String className, Node... nodes) {
        return new ContainerTag("menu", className, nodes);
    }

    static Node menu(String className, Stream<Node> nodes) {
        return new ContainerTag("menu", className, nodes);
    }

    static Node menu(String className, Attributes attributes) {
        return new ContainerTag("menu", className, attributes);
    }

    static Node menu(String className, Attributes attributes, String text) {
        return new ContainerTag("menu", className, attributes, text);
    }

    static Node menu(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("menu", className, attributes, nodes);
    }

    static Node menu(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("menu", className, attributes, nodes);
    }

    static Node menuitem() {
        return new ContainerTag("menuitem");
    }

    static Node menuitem(String text) {
        return new ContainerTag("menuitem", text);
    }

    static Node menuitem(Node... nodes) {
        return new ContainerTag("menuitem", nodes);
    }

    static Node menuitem(Stream<Node> nodes) {
        return new ContainerTag("menuitem", nodes);
    }

    static Node menuitem(Attributes attributes) {
        return new ContainerTag("menuitem", attributes);
    }

    static Node menuitem(Attributes attributes, String text) {
        return new ContainerTag("menuitem", attributes, text);
    }

    static Node menuitem(Attributes attributes, Node... nodes) {
        return new ContainerTag("menuitem", attributes, nodes);
    }

    static Node menuitem(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("menuitem", attributes, nodes);
    }

    static Node menuitem(String className, String text) {
        return new ContainerTag("menuitem", className, text);
    }

    static Node menuitem(String className, Node... nodes) {
        return new ContainerTag("menuitem", className, nodes);
    }

    static Node menuitem(String className, Stream<Node> nodes) {
        return new ContainerTag("menuitem", className, nodes);
    }

    static Node menuitem(String className, Attributes attributes) {
        return new ContainerTag("menuitem", className, attributes);
    }

    static Node menuitem(String className, Attributes attributes, String text) {
        return new ContainerTag("menuitem", className, attributes, text);
    }

    static Node menuitem(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("menuitem", className, attributes, nodes);
    }

    static Node menuitem(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("menuitem", className, attributes, nodes);
    }

    static Node meter() {
        return new ContainerTag("meter");
    }

    static Node meter(String text) {
        return new ContainerTag("meter", text);
    }

    static Node meter(Node... nodes) {
        return new ContainerTag("meter", nodes);
    }

    static Node meter(Stream<Node> nodes) {
        return new ContainerTag("meter", nodes);
    }

    static Node meter(Attributes attributes) {
        return new ContainerTag("meter", attributes);
    }

    static Node meter(Attributes attributes, String text) {
        return new ContainerTag("meter", attributes, text);
    }

    static Node meter(Attributes attributes, Node... nodes) {
        return new ContainerTag("meter", attributes, nodes);
    }

    static Node meter(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("meter", attributes, nodes);
    }

    static Node meter(String className, String text) {
        return new ContainerTag("meter", className, text);
    }

    static Node meter(String className, Node... nodes) {
        return new ContainerTag("meter", className, nodes);
    }

    static Node meter(String className, Stream<Node> nodes) {
        return new ContainerTag("meter", className, nodes);
    }

    static Node meter(String className, Attributes attributes) {
        return new ContainerTag("meter", className, attributes);
    }

    static Node meter(String className, Attributes attributes, String text) {
        return new ContainerTag("meter", className, attributes, text);
    }

    static Node meter(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("meter", className, attributes, nodes);
    }

    static Node meter(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("meter", className, attributes, nodes);
    }

    static Node nav() {
        return new ContainerTag("nav");
    }

    static Node nav(String text) {
        return new ContainerTag("nav", text);
    }

    static Node nav(Node... nodes) {
        return new ContainerTag("nav", nodes);
    }

    static Node nav(Stream<Node> nodes) {
        return new ContainerTag("nav", nodes);
    }

    static Node nav(Attributes attributes) {
        return new ContainerTag("nav", attributes);
    }

    static Node nav(Attributes attributes, String text) {
        return new ContainerTag("nav", attributes, text);
    }

    static Node nav(Attributes attributes, Node... nodes) {
        return new ContainerTag("nav", attributes, nodes);
    }

    static Node nav(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("nav", attributes, nodes);
    }

    static Node nav(String className, String text) {
        return new ContainerTag("nav", className, text);
    }

    static Node nav(String className, Node... nodes) {
        return new ContainerTag("nav", className, nodes);
    }

    static Node nav(String className, Stream<Node> nodes) {
        return new ContainerTag("nav", className, nodes);
    }

    static Node nav(String className, Attributes attributes) {
        return new ContainerTag("nav", className, attributes);
    }

    static Node nav(String className, Attributes attributes, String text) {
        return new ContainerTag("nav", className, attributes, text);
    }

    static Node nav(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("nav", className, attributes, nodes);
    }

    static Node nav(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("nav", className, attributes, nodes);
    }

    static Node noscript() {
        return new ContainerTag("noscript");
    }

    static Node noscript(String text) {
        return new ContainerTag("noscript", text);
    }

    static Node noscript(Node... nodes) {
        return new ContainerTag("noscript", nodes);
    }

    static Node noscript(Stream<Node> nodes) {
        return new ContainerTag("noscript", nodes);
    }

    static Node noscript(Attributes attributes) {
        return new ContainerTag("noscript", attributes);
    }

    static Node noscript(Attributes attributes, String text) {
        return new ContainerTag("noscript", attributes, text);
    }

    static Node noscript(Attributes attributes, Node... nodes) {
        return new ContainerTag("noscript", attributes, nodes);
    }

    static Node noscript(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("noscript", attributes, nodes);
    }

    static Node noscript(String className, String text) {
        return new ContainerTag("noscript", className, text);
    }

    static Node noscript(String className, Node... nodes) {
        return new ContainerTag("noscript", className, nodes);
    }

    static Node noscript(String className, Stream<Node> nodes) {
        return new ContainerTag("noscript", className, nodes);
    }

    static Node noscript(String className, Attributes attributes) {
        return new ContainerTag("noscript", className, attributes);
    }

    static Node noscript(String className, Attributes attributes, String text) {
        return new ContainerTag("noscript", className, attributes, text);
    }

    static Node noscript(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("noscript", className, attributes, nodes);
    }

    static Node noscript(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("noscript", className, attributes, nodes);
    }

    static Node object() {
        return new ContainerTag("object");
    }

    static Node object(String text) {
        return new ContainerTag("object", text);
    }

    static Node object(Node... nodes) {
        return new ContainerTag("object", nodes);
    }

    static Node object(Stream<Node> nodes) {
        return new ContainerTag("object", nodes);
    }

    static Node object(Attributes attributes) {
        return new ContainerTag("object", attributes);
    }

    static Node object(Attributes attributes, String text) {
        return new ContainerTag("object", attributes, text);
    }

    static Node object(Attributes attributes, Node... nodes) {
        return new ContainerTag("object", attributes, nodes);
    }

    static Node object(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("object", attributes, nodes);
    }

    static Node object(String className, String text) {
        return new ContainerTag("object", className, text);
    }

    static Node object(String className, Node... nodes) {
        return new ContainerTag("object", className, nodes);
    }

    static Node object(String className, Stream<Node> nodes) {
        return new ContainerTag("object", className, nodes);
    }

    static Node object(String className, Attributes attributes) {
        return new ContainerTag("object", className, attributes);
    }

    static Node object(String className, Attributes attributes, String text) {
        return new ContainerTag("object", className, attributes, text);
    }

    static Node object(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("object", className, attributes, nodes);
    }

    static Node object(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("object", className, attributes, nodes);
    }

    static Node ol() {
        return new ContainerTag("ol");
    }

    static Node ol(String text) {
        return new ContainerTag("ol", text);
    }

    static Node ol(Node... nodes) {
        return new ContainerTag("ol", nodes);
    }

    static Node ol(Stream<Node> nodes) {
        return new ContainerTag("ol", nodes);
    }

    static Node ol(Attributes attributes) {
        return new ContainerTag("ol", attributes);
    }

    static Node ol(Attributes attributes, String text) {
        return new ContainerTag("ol", attributes, text);
    }

    static Node ol(Attributes attributes, Node... nodes) {
        return new ContainerTag("ol", attributes, nodes);
    }

    static Node ol(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("ol", attributes, nodes);
    }

    static Node ol(String className, String text) {
        return new ContainerTag("ol", className, text);
    }

    static Node ol(String className, Node... nodes) {
        return new ContainerTag("ol", className, nodes);
    }

    static Node ol(String className, Stream<Node> nodes) {
        return new ContainerTag("ol", className, nodes);
    }

    static Node ol(String className, Attributes attributes) {
        return new ContainerTag("ol", className, attributes);
    }

    static Node ol(String className, Attributes attributes, String text) {
        return new ContainerTag("ol", className, attributes, text);
    }

    static Node ol(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("ol", className, attributes, nodes);
    }

    static Node ol(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("ol", className, attributes, nodes);
    }

    static Node optgroup() {
        return new ContainerTag("optgroup");
    }

    static Node optgroup(String text) {
        return new ContainerTag("optgroup", text);
    }

    static Node optgroup(Node... nodes) {
        return new ContainerTag("optgroup", nodes);
    }

    static Node optgroup(Stream<Node> nodes) {
        return new ContainerTag("optgroup", nodes);
    }

    static Node optgroup(Attributes attributes) {
        return new ContainerTag("optgroup", attributes);
    }

    static Node optgroup(Attributes attributes, String text) {
        return new ContainerTag("optgroup", attributes, text);
    }

    static Node optgroup(Attributes attributes, Node... nodes) {
        return new ContainerTag("optgroup", attributes, nodes);
    }

    static Node optgroup(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("optgroup", attributes, nodes);
    }

    static Node optgroup(String className, String text) {
        return new ContainerTag("optgroup", className, text);
    }

    static Node optgroup(String className, Node... nodes) {
        return new ContainerTag("optgroup", className, nodes);
    }

    static Node optgroup(String className, Stream<Node> nodes) {
        return new ContainerTag("optgroup", className, nodes);
    }

    static Node optgroup(String className, Attributes attributes) {
        return new ContainerTag("optgroup", className, attributes);
    }

    static Node optgroup(String className, Attributes attributes, String text) {
        return new ContainerTag("optgroup", className, attributes, text);
    }

    static Node optgroup(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("optgroup", className, attributes, nodes);
    }

    static Node optgroup(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("optgroup", className, attributes, nodes);
    }

    static Node option() {
        return new ContainerTag("option");
    }

    static Node option(String text) {
        return new ContainerTag("option", text);
    }

    static Node option(Node... nodes) {
        return new ContainerTag("option", nodes);
    }

    static Node option(Stream<Node> nodes) {
        return new ContainerTag("option", nodes);
    }

    static Node option(Attributes attributes) {
        return new ContainerTag("option", attributes);
    }

    static Node option(Attributes attributes, String text) {
        return new ContainerTag("option", attributes, text);
    }

    static Node option(Attributes attributes, Node... nodes) {
        return new ContainerTag("option", attributes, nodes);
    }

    static Node option(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("option", attributes, nodes);
    }

    static Node option(String className, String text) {
        return new ContainerTag("option", className, text);
    }

    static Node option(String className, Node... nodes) {
        return new ContainerTag("option", className, nodes);
    }

    static Node option(String className, Stream<Node> nodes) {
        return new ContainerTag("option", className, nodes);
    }

    static Node option(String className, Attributes attributes) {
        return new ContainerTag("option", className, attributes);
    }

    static Node option(String className, Attributes attributes, String text) {
        return new ContainerTag("option", className, attributes, text);
    }

    static Node option(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("option", className, attributes, nodes);
    }

    static Node option(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("option", className, attributes, nodes);
    }

    static Node output() {
        return new ContainerTag("output");
    }

    static Node output(String text) {
        return new ContainerTag("output", text);
    }

    static Node output(Node... nodes) {
        return new ContainerTag("output", nodes);
    }

    static Node output(Stream<Node> nodes) {
        return new ContainerTag("output", nodes);
    }

    static Node output(Attributes attributes) {
        return new ContainerTag("output", attributes);
    }

    static Node output(Attributes attributes, String text) {
        return new ContainerTag("output", attributes, text);
    }

    static Node output(Attributes attributes, Node... nodes) {
        return new ContainerTag("output", attributes, nodes);
    }

    static Node output(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("output", attributes, nodes);
    }

    static Node output(String className, String text) {
        return new ContainerTag("output", className, text);
    }

    static Node output(String className, Node... nodes) {
        return new ContainerTag("output", className, nodes);
    }

    static Node output(String className, Stream<Node> nodes) {
        return new ContainerTag("output", className, nodes);
    }

    static Node output(String className, Attributes attributes) {
        return new ContainerTag("output", className, attributes);
    }

    static Node output(String className, Attributes attributes, String text) {
        return new ContainerTag("output", className, attributes, text);
    }

    static Node output(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("output", className, attributes, nodes);
    }

    static Node output(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("output", className, attributes, nodes);
    }

    static Node p() {
        return new ContainerTag("p");
    }

    static Node p(String text) {
        return new ContainerTag("p", text);
    }

    static Node p(Node... nodes) {
        return new ContainerTag("p", nodes);
    }

    static Node p(Stream<Node> nodes) {
        return new ContainerTag("p", nodes);
    }

    static Node p(Attributes attributes) {
        return new ContainerTag("p", attributes);
    }

    static Node p(Attributes attributes, String text) {
        return new ContainerTag("p", attributes, text);
    }

    static Node p(Attributes attributes, Node... nodes) {
        return new ContainerTag("p", attributes, nodes);
    }

    static Node p(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("p", attributes, nodes);
    }

    static Node p(String className, String text) {
        return new ContainerTag("p", className, text);
    }

    static Node p(String className, Node... nodes) {
        return new ContainerTag("p", className, nodes);
    }

    static Node p(String className, Stream<Node> nodes) {
        return new ContainerTag("p", className, nodes);
    }

    static Node p(String className, Attributes attributes) {
        return new ContainerTag("p", className, attributes);
    }

    static Node p(String className, Attributes attributes, String text) {
        return new ContainerTag("p", className, attributes, text);
    }

    static Node p(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("p", className, attributes, nodes);
    }

    static Node p(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("p", className, attributes, nodes);
    }

    static Node picture() {
        return new ContainerTag("picture");
    }

    static Node picture(String text) {
        return new ContainerTag("picture", text);
    }

    static Node picture(Node... nodes) {
        return new ContainerTag("picture", nodes);
    }

    static Node picture(Stream<Node> nodes) {
        return new ContainerTag("picture", nodes);
    }

    static Node picture(Attributes attributes) {
        return new ContainerTag("picture", attributes);
    }

    static Node picture(Attributes attributes, String text) {
        return new ContainerTag("picture", attributes, text);
    }

    static Node picture(Attributes attributes, Node... nodes) {
        return new ContainerTag("picture", attributes, nodes);
    }

    static Node picture(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("picture", attributes, nodes);
    }

    static Node picture(String className, String text) {
        return new ContainerTag("picture", className, text);
    }

    static Node picture(String className, Node... nodes) {
        return new ContainerTag("picture", className, nodes);
    }

    static Node picture(String className, Stream<Node> nodes) {
        return new ContainerTag("picture", className, nodes);
    }

    static Node picture(String className, Attributes attributes) {
        return new ContainerTag("picture", className, attributes);
    }

    static Node picture(String className, Attributes attributes, String text) {
        return new ContainerTag("picture", className, attributes, text);
    }

    static Node picture(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("picture", className, attributes, nodes);
    }

    static Node picture(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("picture", className, attributes, nodes);
    }

    static Node pre() {
        return new ContainerTag("pre");
    }

    static Node pre(String text) {
        return new ContainerTag("pre", text);
    }

    static Node pre(Node... nodes) {
        return new ContainerTag("pre", nodes);
    }

    static Node pre(Stream<Node> nodes) {
        return new ContainerTag("pre", nodes);
    }

    static Node pre(Attributes attributes) {
        return new ContainerTag("pre", attributes);
    }

    static Node pre(Attributes attributes, String text) {
        return new ContainerTag("pre", attributes, text);
    }

    static Node pre(Attributes attributes, Node... nodes) {
        return new ContainerTag("pre", attributes, nodes);
    }

    static Node pre(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("pre", attributes, nodes);
    }

    static Node pre(String className, String text) {
        return new ContainerTag("pre", className, text);
    }

    static Node pre(String className, Node... nodes) {
        return new ContainerTag("pre", className, nodes);
    }

    static Node pre(String className, Stream<Node> nodes) {
        return new ContainerTag("pre", className, nodes);
    }

    static Node pre(String className, Attributes attributes) {
        return new ContainerTag("pre", className, attributes);
    }

    static Node pre(String className, Attributes attributes, String text) {
        return new ContainerTag("pre", className, attributes, text);
    }

    static Node pre(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("pre", className, attributes, nodes);
    }

    static Node pre(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("pre", className, attributes, nodes);
    }

    static Node progress() {
        return new ContainerTag("progress");
    }

    static Node progress(String text) {
        return new ContainerTag("progress", text);
    }

    static Node progress(Node... nodes) {
        return new ContainerTag("progress", nodes);
    }

    static Node progress(Stream<Node> nodes) {
        return new ContainerTag("progress", nodes);
    }

    static Node progress(Attributes attributes) {
        return new ContainerTag("progress", attributes);
    }

    static Node progress(Attributes attributes, String text) {
        return new ContainerTag("progress", attributes, text);
    }

    static Node progress(Attributes attributes, Node... nodes) {
        return new ContainerTag("progress", attributes, nodes);
    }

    static Node progress(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("progress", attributes, nodes);
    }

    static Node progress(String className, String text) {
        return new ContainerTag("progress", className, text);
    }

    static Node progress(String className, Node... nodes) {
        return new ContainerTag("progress", className, nodes);
    }

    static Node progress(String className, Stream<Node> nodes) {
        return new ContainerTag("progress", className, nodes);
    }

    static Node progress(String className, Attributes attributes) {
        return new ContainerTag("progress", className, attributes);
    }

    static Node progress(String className, Attributes attributes, String text) {
        return new ContainerTag("progress", className, attributes, text);
    }

    static Node progress(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("progress", className, attributes, nodes);
    }

    static Node progress(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("progress", className, attributes, nodes);
    }

    static Node q() {
        return new ContainerTag("q");
    }

    static Node q(String text) {
        return new ContainerTag("q", text);
    }

    static Node q(Node... nodes) {
        return new ContainerTag("q", nodes);
    }

    static Node q(Stream<Node> nodes) {
        return new ContainerTag("q", nodes);
    }

    static Node q(Attributes attributes) {
        return new ContainerTag("q", attributes);
    }

    static Node q(Attributes attributes, String text) {
        return new ContainerTag("q", attributes, text);
    }

    static Node q(Attributes attributes, Node... nodes) {
        return new ContainerTag("q", attributes, nodes);
    }

    static Node q(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("q", attributes, nodes);
    }

    static Node q(String className, String text) {
        return new ContainerTag("q", className, text);
    }

    static Node q(String className, Node... nodes) {
        return new ContainerTag("q", className, nodes);
    }

    static Node q(String className, Stream<Node> nodes) {
        return new ContainerTag("q", className, nodes);
    }

    static Node q(String className, Attributes attributes) {
        return new ContainerTag("q", className, attributes);
    }

    static Node q(String className, Attributes attributes, String text) {
        return new ContainerTag("q", className, attributes, text);
    }

    static Node q(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("q", className, attributes, nodes);
    }

    static Node q(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("q", className, attributes, nodes);
    }

    static Node rp() {
        return new ContainerTag("rp");
    }

    static Node rp(String text) {
        return new ContainerTag("rp", text);
    }

    static Node rp(Node... nodes) {
        return new ContainerTag("rp", nodes);
    }

    static Node rp(Stream<Node> nodes) {
        return new ContainerTag("rp", nodes);
    }

    static Node rp(Attributes attributes) {
        return new ContainerTag("rp", attributes);
    }

    static Node rp(Attributes attributes, String text) {
        return new ContainerTag("rp", attributes, text);
    }

    static Node rp(Attributes attributes, Node... nodes) {
        return new ContainerTag("rp", attributes, nodes);
    }

    static Node rp(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("rp", attributes, nodes);
    }

    static Node rp(String className, String text) {
        return new ContainerTag("rp", className, text);
    }

    static Node rp(String className, Node... nodes) {
        return new ContainerTag("rp", className, nodes);
    }

    static Node rp(String className, Stream<Node> nodes) {
        return new ContainerTag("rp", className, nodes);
    }

    static Node rp(String className, Attributes attributes) {
        return new ContainerTag("rp", className, attributes);
    }

    static Node rp(String className, Attributes attributes, String text) {
        return new ContainerTag("rp", className, attributes, text);
    }

    static Node rp(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("rp", className, attributes, nodes);
    }

    static Node rp(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("rp", className, attributes, nodes);
    }

    static Node rt() {
        return new ContainerTag("rt");
    }

    static Node rt(String text) {
        return new ContainerTag("rt", text);
    }

    static Node rt(Node... nodes) {
        return new ContainerTag("rt", nodes);
    }

    static Node rt(Stream<Node> nodes) {
        return new ContainerTag("rt", nodes);
    }

    static Node rt(Attributes attributes) {
        return new ContainerTag("rt", attributes);
    }

    static Node rt(Attributes attributes, String text) {
        return new ContainerTag("rt", attributes, text);
    }

    static Node rt(Attributes attributes, Node... nodes) {
        return new ContainerTag("rt", attributes, nodes);
    }

    static Node rt(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("rt", attributes, nodes);
    }

    static Node rt(String className, String text) {
        return new ContainerTag("rt", className, text);
    }

    static Node rt(String className, Node... nodes) {
        return new ContainerTag("rt", className, nodes);
    }

    static Node rt(String className, Stream<Node> nodes) {
        return new ContainerTag("rt", className, nodes);
    }

    static Node rt(String className, Attributes attributes) {
        return new ContainerTag("rt", className, attributes);
    }

    static Node rt(String className, Attributes attributes, String text) {
        return new ContainerTag("rt", className, attributes, text);
    }

    static Node rt(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("rt", className, attributes, nodes);
    }

    static Node rt(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("rt", className, attributes, nodes);
    }

    static Node ruby() {
        return new ContainerTag("ruby");
    }

    static Node ruby(String text) {
        return new ContainerTag("ruby", text);
    }

    static Node ruby(Node... nodes) {
        return new ContainerTag("ruby", nodes);
    }

    static Node ruby(Stream<Node> nodes) {
        return new ContainerTag("ruby", nodes);
    }

    static Node ruby(Attributes attributes) {
        return new ContainerTag("ruby", attributes);
    }

    static Node ruby(Attributes attributes, String text) {
        return new ContainerTag("ruby", attributes, text);
    }

    static Node ruby(Attributes attributes, Node... nodes) {
        return new ContainerTag("ruby", attributes, nodes);
    }

    static Node ruby(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("ruby", attributes, nodes);
    }

    static Node ruby(String className, String text) {
        return new ContainerTag("ruby", className, text);
    }

    static Node ruby(String className, Node... nodes) {
        return new ContainerTag("ruby", className, nodes);
    }

    static Node ruby(String className, Stream<Node> nodes) {
        return new ContainerTag("ruby", className, nodes);
    }

    static Node ruby(String className, Attributes attributes) {
        return new ContainerTag("ruby", className, attributes);
    }

    static Node ruby(String className, Attributes attributes, String text) {
        return new ContainerTag("ruby", className, attributes, text);
    }

    static Node ruby(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("ruby", className, attributes, nodes);
    }

    static Node ruby(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("ruby", className, attributes, nodes);
    }

    static Node s() {
        return new ContainerTag("s");
    }

    static Node s(String text) {
        return new ContainerTag("s", text);
    }

    static Node s(Node... nodes) {
        return new ContainerTag("s", nodes);
    }

    static Node s(Stream<Node> nodes) {
        return new ContainerTag("s", nodes);
    }

    static Node s(Attributes attributes) {
        return new ContainerTag("s", attributes);
    }

    static Node s(Attributes attributes, String text) {
        return new ContainerTag("s", attributes, text);
    }

    static Node s(Attributes attributes, Node... nodes) {
        return new ContainerTag("s", attributes, nodes);
    }

    static Node s(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("s", attributes, nodes);
    }

    static Node s(String className, String text) {
        return new ContainerTag("s", className, text);
    }

    static Node s(String className, Node... nodes) {
        return new ContainerTag("s", className, nodes);
    }

    static Node s(String className, Stream<Node> nodes) {
        return new ContainerTag("s", className, nodes);
    }

    static Node s(String className, Attributes attributes) {
        return new ContainerTag("s", className, attributes);
    }

    static Node s(String className, Attributes attributes, String text) {
        return new ContainerTag("s", className, attributes, text);
    }

    static Node s(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("s", className, attributes, nodes);
    }

    static Node s(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("s", className, attributes, nodes);
    }

    static Node samp() {
        return new ContainerTag("samp");
    }

    static Node samp(String text) {
        return new ContainerTag("samp", text);
    }

    static Node samp(Node... nodes) {
        return new ContainerTag("samp", nodes);
    }

    static Node samp(Stream<Node> nodes) {
        return new ContainerTag("samp", nodes);
    }

    static Node samp(Attributes attributes) {
        return new ContainerTag("samp", attributes);
    }

    static Node samp(Attributes attributes, String text) {
        return new ContainerTag("samp", attributes, text);
    }

    static Node samp(Attributes attributes, Node... nodes) {
        return new ContainerTag("samp", attributes, nodes);
    }

    static Node samp(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("samp", attributes, nodes);
    }

    static Node samp(String className, String text) {
        return new ContainerTag("samp", className, text);
    }

    static Node samp(String className, Node... nodes) {
        return new ContainerTag("samp", className, nodes);
    }

    static Node samp(String className, Stream<Node> nodes) {
        return new ContainerTag("samp", className, nodes);
    }

    static Node samp(String className, Attributes attributes) {
        return new ContainerTag("samp", className, attributes);
    }

    static Node samp(String className, Attributes attributes, String text) {
        return new ContainerTag("samp", className, attributes, text);
    }

    static Node samp(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("samp", className, attributes, nodes);
    }

    static Node samp(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("samp", className, attributes, nodes);
    }

    static Node script() {
        return new ContainerTag("script");
    }

    static Node script(String text) {
        return new ContainerTag("script", text);
    }

    static Node script(Node... nodes) {
        return new ContainerTag("script", nodes);
    }

    static Node script(Stream<Node> nodes) {
        return new ContainerTag("script", nodes);
    }

    static Node script(Attributes attributes) {
        return new ContainerTag("script", attributes);
    }

    static Node script(Attributes attributes, String text) {
        return new ContainerTag("script", attributes, text);
    }

    static Node script(Attributes attributes, Node... nodes) {
        return new ContainerTag("script", attributes, nodes);
    }

    static Node script(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("script", attributes, nodes);
    }

    static Node script(String className, String text) {
        return new ContainerTag("script", className, text);
    }

    static Node script(String className, Node... nodes) {
        return new ContainerTag("script", className, nodes);
    }

    static Node script(String className, Stream<Node> nodes) {
        return new ContainerTag("script", className, nodes);
    }

    static Node script(String className, Attributes attributes) {
        return new ContainerTag("script", className, attributes);
    }

    static Node script(String className, Attributes attributes, String text) {
        return new ContainerTag("script", className, attributes, text);
    }

    static Node script(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("script", className, attributes, nodes);
    }

    static Node script(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("script", className, attributes, nodes);
    }

    static Node section() {
        return new ContainerTag("section");
    }

    static Node section(String text) {
        return new ContainerTag("section", text);
    }

    static Node section(Node... nodes) {
        return new ContainerTag("section", nodes);
    }

    static Node section(Stream<Node> nodes) {
        return new ContainerTag("section", nodes);
    }

    static Node section(Attributes attributes) {
        return new ContainerTag("section", attributes);
    }

    static Node section(Attributes attributes, String text) {
        return new ContainerTag("section", attributes, text);
    }

    static Node section(Attributes attributes, Node... nodes) {
        return new ContainerTag("section", attributes, nodes);
    }

    static Node section(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("section", attributes, nodes);
    }

    static Node section(String className, String text) {
        return new ContainerTag("section", className, text);
    }

    static Node section(String className, Node... nodes) {
        return new ContainerTag("section", className, nodes);
    }

    static Node section(String className, Stream<Node> nodes) {
        return new ContainerTag("section", className, nodes);
    }

    static Node section(String className, Attributes attributes) {
        return new ContainerTag("section", className, attributes);
    }

    static Node section(String className, Attributes attributes, String text) {
        return new ContainerTag("section", className, attributes, text);
    }

    static Node section(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("section", className, attributes, nodes);
    }

    static Node section(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("section", className, attributes, nodes);
    }

    static Node select() {
        return new ContainerTag("select");
    }

    static Node select(String text) {
        return new ContainerTag("select", text);
    }

    static Node select(Node... nodes) {
        return new ContainerTag("select", nodes);
    }

    static Node select(Stream<Node> nodes) {
        return new ContainerTag("select", nodes);
    }

    static Node select(Attributes attributes) {
        return new ContainerTag("select", attributes);
    }

    static Node select(Attributes attributes, String text) {
        return new ContainerTag("select", attributes, text);
    }

    static Node select(Attributes attributes, Node... nodes) {
        return new ContainerTag("select", attributes, nodes);
    }

    static Node select(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("select", attributes, nodes);
    }

    static Node select(String className, String text) {
        return new ContainerTag("select", className, text);
    }

    static Node select(String className, Node... nodes) {
        return new ContainerTag("select", className, nodes);
    }

    static Node select(String className, Stream<Node> nodes) {
        return new ContainerTag("select", className, nodes);
    }

    static Node select(String className, Attributes attributes) {
        return new ContainerTag("select", className, attributes);
    }

    static Node select(String className, Attributes attributes, String text) {
        return new ContainerTag("select", className, attributes, text);
    }

    static Node select(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("select", className, attributes, nodes);
    }

    static Node select(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("select", className, attributes, nodes);
    }

    static Node small() {
        return new ContainerTag("small");
    }

    static Node small(String text) {
        return new ContainerTag("small", text);
    }

    static Node small(Node... nodes) {
        return new ContainerTag("small", nodes);
    }

    static Node small(Stream<Node> nodes) {
        return new ContainerTag("small", nodes);
    }

    static Node small(Attributes attributes) {
        return new ContainerTag("small", attributes);
    }

    static Node small(Attributes attributes, String text) {
        return new ContainerTag("small", attributes, text);
    }

    static Node small(Attributes attributes, Node... nodes) {
        return new ContainerTag("small", attributes, nodes);
    }

    static Node small(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("small", attributes, nodes);
    }

    static Node small(String className, String text) {
        return new ContainerTag("small", className, text);
    }

    static Node small(String className, Node... nodes) {
        return new ContainerTag("small", className, nodes);
    }

    static Node small(String className, Stream<Node> nodes) {
        return new ContainerTag("small", className, nodes);
    }

    static Node small(String className, Attributes attributes) {
        return new ContainerTag("small", className, attributes);
    }

    static Node small(String className, Attributes attributes, String text) {
        return new ContainerTag("small", className, attributes, text);
    }

    static Node small(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("small", className, attributes, nodes);
    }

    static Node small(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("small", className, attributes, nodes);
    }

    static Node span() {
        return new ContainerTag("span");
    }

    static Node span(String text) {
        return new ContainerTag("span", text);
    }

    static Node span(Node... nodes) {
        return new ContainerTag("span", nodes);
    }

    static Node span(Stream<Node> nodes) {
        return new ContainerTag("span", nodes);
    }

    static Node span(Attributes attributes) {
        return new ContainerTag("span", attributes);
    }

    static Node span(Attributes attributes, String text) {
        return new ContainerTag("span", attributes, text);
    }

    static Node span(Attributes attributes, Node... nodes) {
        return new ContainerTag("span", attributes, nodes);
    }

    static Node span(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("span", attributes, nodes);
    }

    static Node span(String className, String text) {
        return new ContainerTag("span", className, text);
    }

    static Node span(String className, Node... nodes) {
        return new ContainerTag("span", className, nodes);
    }

    static Node span(String className, Stream<Node> nodes) {
        return new ContainerTag("span", className, nodes);
    }

    static Node span(String className, Attributes attributes) {
        return new ContainerTag("span", className, attributes);
    }

    static Node span(String className, Attributes attributes, String text) {
        return new ContainerTag("span", className, attributes, text);
    }

    static Node span(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("span", className, attributes, nodes);
    }

    static Node span(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("span", className, attributes, nodes);
    }

    static Node strong() {
        return new ContainerTag("strong");
    }

    static Node strong(String text) {
        return new ContainerTag("strong", text);
    }

    static Node strong(Node... nodes) {
        return new ContainerTag("strong", nodes);
    }

    static Node strong(Stream<Node> nodes) {
        return new ContainerTag("strong", nodes);
    }

    static Node strong(Attributes attributes) {
        return new ContainerTag("strong", attributes);
    }

    static Node strong(Attributes attributes, String text) {
        return new ContainerTag("strong", attributes, text);
    }

    static Node strong(Attributes attributes, Node... nodes) {
        return new ContainerTag("strong", attributes, nodes);
    }

    static Node strong(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("strong", attributes, nodes);
    }

    static Node strong(String className, String text) {
        return new ContainerTag("strong", className, text);
    }

    static Node strong(String className, Node... nodes) {
        return new ContainerTag("strong", className, nodes);
    }

    static Node strong(String className, Stream<Node> nodes) {
        return new ContainerTag("strong", className, nodes);
    }

    static Node strong(String className, Attributes attributes) {
        return new ContainerTag("strong", className, attributes);
    }

    static Node strong(String className, Attributes attributes, String text) {
        return new ContainerTag("strong", className, attributes, text);
    }

    static Node strong(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("strong", className, attributes, nodes);
    }

    static Node strong(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("strong", className, attributes, nodes);
    }

    static Node style() {
        return new ContainerTag("style");
    }

    static Node style(String text) {
        return new ContainerTag("style", text);
    }

    static Node style(Node... nodes) {
        return new ContainerTag("style", nodes);
    }

    static Node style(Stream<Node> nodes) {
        return new ContainerTag("style", nodes);
    }

    static Node style(Attributes attributes) {
        return new ContainerTag("style", attributes);
    }

    static Node style(Attributes attributes, String text) {
        return new ContainerTag("style", attributes, text);
    }

    static Node style(Attributes attributes, Node... nodes) {
        return new ContainerTag("style", attributes, nodes);
    }

    static Node style(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("style", attributes, nodes);
    }

    static Node style(String className, String text) {
        return new ContainerTag("style", className, text);
    }

    static Node style(String className, Node... nodes) {
        return new ContainerTag("style", className, nodes);
    }

    static Node style(String className, Stream<Node> nodes) {
        return new ContainerTag("style", className, nodes);
    }

    static Node style(String className, Attributes attributes) {
        return new ContainerTag("style", className, attributes);
    }

    static Node style(String className, Attributes attributes, String text) {
        return new ContainerTag("style", className, attributes, text);
    }

    static Node style(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("style", className, attributes, nodes);
    }

    static Node style(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("style", className, attributes, nodes);
    }

    static Node sub() {
        return new ContainerTag("sub");
    }

    static Node sub(String text) {
        return new ContainerTag("sub", text);
    }

    static Node sub(Node... nodes) {
        return new ContainerTag("sub", nodes);
    }

    static Node sub(Stream<Node> nodes) {
        return new ContainerTag("sub", nodes);
    }

    static Node sub(Attributes attributes) {
        return new ContainerTag("sub", attributes);
    }

    static Node sub(Attributes attributes, String text) {
        return new ContainerTag("sub", attributes, text);
    }

    static Node sub(Attributes attributes, Node... nodes) {
        return new ContainerTag("sub", attributes, nodes);
    }

    static Node sub(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("sub", attributes, nodes);
    }

    static Node sub(String className, String text) {
        return new ContainerTag("sub", className, text);
    }

    static Node sub(String className, Node... nodes) {
        return new ContainerTag("sub", className, nodes);
    }

    static Node sub(String className, Stream<Node> nodes) {
        return new ContainerTag("sub", className, nodes);
    }

    static Node sub(String className, Attributes attributes) {
        return new ContainerTag("sub", className, attributes);
    }

    static Node sub(String className, Attributes attributes, String text) {
        return new ContainerTag("sub", className, attributes, text);
    }

    static Node sub(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("sub", className, attributes, nodes);
    }

    static Node sub(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("sub", className, attributes, nodes);
    }

    static Node summary() {
        return new ContainerTag("summary");
    }

    static Node summary(String text) {
        return new ContainerTag("summary", text);
    }

    static Node summary(Node... nodes) {
        return new ContainerTag("summary", nodes);
    }

    static Node summary(Stream<Node> nodes) {
        return new ContainerTag("summary", nodes);
    }

    static Node summary(Attributes attributes) {
        return new ContainerTag("summary", attributes);
    }

    static Node summary(Attributes attributes, String text) {
        return new ContainerTag("summary", attributes, text);
    }

    static Node summary(Attributes attributes, Node... nodes) {
        return new ContainerTag("summary", attributes, nodes);
    }

    static Node summary(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("summary", attributes, nodes);
    }

    static Node summary(String className, String text) {
        return new ContainerTag("summary", className, text);
    }

    static Node summary(String className, Node... nodes) {
        return new ContainerTag("summary", className, nodes);
    }

    static Node summary(String className, Stream<Node> nodes) {
        return new ContainerTag("summary", className, nodes);
    }

    static Node summary(String className, Attributes attributes) {
        return new ContainerTag("summary", className, attributes);
    }

    static Node summary(String className, Attributes attributes, String text) {
        return new ContainerTag("summary", className, attributes, text);
    }

    static Node summary(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("summary", className, attributes, nodes);
    }

    static Node summary(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("summary", className, attributes, nodes);
    }

    static Node sup() {
        return new ContainerTag("sup");
    }

    static Node sup(String text) {
        return new ContainerTag("sup", text);
    }

    static Node sup(Node... nodes) {
        return new ContainerTag("sup", nodes);
    }

    static Node sup(Stream<Node> nodes) {
        return new ContainerTag("sup", nodes);
    }

    static Node sup(Attributes attributes) {
        return new ContainerTag("sup", attributes);
    }

    static Node sup(Attributes attributes, String text) {
        return new ContainerTag("sup", attributes, text);
    }

    static Node sup(Attributes attributes, Node... nodes) {
        return new ContainerTag("sup", attributes, nodes);
    }

    static Node sup(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("sup", attributes, nodes);
    }

    static Node sup(String className, String text) {
        return new ContainerTag("sup", className, text);
    }

    static Node sup(String className, Node... nodes) {
        return new ContainerTag("sup", className, nodes);
    }

    static Node sup(String className, Stream<Node> nodes) {
        return new ContainerTag("sup", className, nodes);
    }

    static Node sup(String className, Attributes attributes) {
        return new ContainerTag("sup", className, attributes);
    }

    static Node sup(String className, Attributes attributes, String text) {
        return new ContainerTag("sup", className, attributes, text);
    }

    static Node sup(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("sup", className, attributes, nodes);
    }

    static Node sup(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("sup", className, attributes, nodes);
    }

    static Node table() {
        return new ContainerTag("table");
    }

    static Node table(String text) {
        return new ContainerTag("table", text);
    }

    static Node table(Node... nodes) {
        return new ContainerTag("table", nodes);
    }

    static Node table(Stream<Node> nodes) {
        return new ContainerTag("table", nodes);
    }

    static Node table(Attributes attributes) {
        return new ContainerTag("table", attributes);
    }

    static Node table(Attributes attributes, String text) {
        return new ContainerTag("table", attributes, text);
    }

    static Node table(Attributes attributes, Node... nodes) {
        return new ContainerTag("table", attributes, nodes);
    }

    static Node table(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("table", attributes, nodes);
    }

    static Node table(String className, String text) {
        return new ContainerTag("table", className, text);
    }

    static Node table(String className, Node... nodes) {
        return new ContainerTag("table", className, nodes);
    }

    static Node table(String className, Stream<Node> nodes) {
        return new ContainerTag("table", className, nodes);
    }

    static Node table(String className, Attributes attributes) {
        return new ContainerTag("table", className, attributes);
    }

    static Node table(String className, Attributes attributes, String text) {
        return new ContainerTag("table", className, attributes, text);
    }

    static Node table(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("table", className, attributes, nodes);
    }

    static Node table(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("table", className, attributes, nodes);
    }

    static Node tbody() {
        return new ContainerTag("tbody");
    }

    static Node tbody(String text) {
        return new ContainerTag("tbody", text);
    }

    static Node tbody(Node... nodes) {
        return new ContainerTag("tbody", nodes);
    }

    static Node tbody(Stream<Node> nodes) {
        return new ContainerTag("tbody", nodes);
    }

    static Node tbody(Attributes attributes) {
        return new ContainerTag("tbody", attributes);
    }

    static Node tbody(Attributes attributes, String text) {
        return new ContainerTag("tbody", attributes, text);
    }

    static Node tbody(Attributes attributes, Node... nodes) {
        return new ContainerTag("tbody", attributes, nodes);
    }

    static Node tbody(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("tbody", attributes, nodes);
    }

    static Node tbody(String className, String text) {
        return new ContainerTag("tbody", className, text);
    }

    static Node tbody(String className, Node... nodes) {
        return new ContainerTag("tbody", className, nodes);
    }

    static Node tbody(String className, Stream<Node> nodes) {
        return new ContainerTag("tbody", className, nodes);
    }

    static Node tbody(String className, Attributes attributes) {
        return new ContainerTag("tbody", className, attributes);
    }

    static Node tbody(String className, Attributes attributes, String text) {
        return new ContainerTag("tbody", className, attributes, text);
    }

    static Node tbody(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("tbody", className, attributes, nodes);
    }

    static Node tbody(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("tbody", className, attributes, nodes);
    }

    static Node td() {
        return new ContainerTag("td");
    }

    static Node td(String text) {
        return new ContainerTag("td", text);
    }

    static Node td(Node... nodes) {
        return new ContainerTag("td", nodes);
    }

    static Node td(Stream<Node> nodes) {
        return new ContainerTag("td", nodes);
    }

    static Node td(Attributes attributes) {
        return new ContainerTag("td", attributes);
    }

    static Node td(Attributes attributes, String text) {
        return new ContainerTag("td", attributes, text);
    }

    static Node td(Attributes attributes, Node... nodes) {
        return new ContainerTag("td", attributes, nodes);
    }

    static Node td(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("td", attributes, nodes);
    }

    static Node td(String className, String text) {
        return new ContainerTag("td", className, text);
    }

    static Node td(String className, Node... nodes) {
        return new ContainerTag("td", className, nodes);
    }

    static Node td(String className, Stream<Node> nodes) {
        return new ContainerTag("td", className, nodes);
    }

    static Node td(String className, Attributes attributes) {
        return new ContainerTag("td", className, attributes);
    }

    static Node td(String className, Attributes attributes, String text) {
        return new ContainerTag("td", className, attributes, text);
    }

    static Node td(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("td", className, attributes, nodes);
    }

    static Node td(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("td", className, attributes, nodes);
    }

    static Node textarea() {
        return new ContainerTag("textarea");
    }

    static Node textarea(String text) {
        return new ContainerTag("textarea", text);
    }

    static Node textarea(Node... nodes) {
        return new ContainerTag("textarea", nodes);
    }

    static Node textarea(Stream<Node> nodes) {
        return new ContainerTag("textarea", nodes);
    }

    static Node textarea(Attributes attributes) {
        return new ContainerTag("textarea", attributes);
    }

    static Node textarea(Attributes attributes, String text) {
        return new ContainerTag("textarea", attributes, text);
    }

    static Node textarea(Attributes attributes, Node... nodes) {
        return new ContainerTag("textarea", attributes, nodes);
    }

    static Node textarea(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("textarea", attributes, nodes);
    }

    static Node textarea(String className, String text) {
        return new ContainerTag("textarea", className, text);
    }

    static Node textarea(String className, Node... nodes) {
        return new ContainerTag("textarea", className, nodes);
    }

    static Node textarea(String className, Stream<Node> nodes) {
        return new ContainerTag("textarea", className, nodes);
    }

    static Node textarea(String className, Attributes attributes) {
        return new ContainerTag("textarea", className, attributes);
    }

    static Node textarea(String className, Attributes attributes, String text) {
        return new ContainerTag("textarea", className, attributes, text);
    }

    static Node textarea(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("textarea", className, attributes, nodes);
    }

    static Node textarea(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("textarea", className, attributes, nodes);
    }

    static Node tfoot() {
        return new ContainerTag("tfoot");
    }

    static Node tfoot(String text) {
        return new ContainerTag("tfoot", text);
    }

    static Node tfoot(Node... nodes) {
        return new ContainerTag("tfoot", nodes);
    }

    static Node tfoot(Stream<Node> nodes) {
        return new ContainerTag("tfoot", nodes);
    }

    static Node tfoot(Attributes attributes) {
        return new ContainerTag("tfoot", attributes);
    }

    static Node tfoot(Attributes attributes, String text) {
        return new ContainerTag("tfoot", attributes, text);
    }

    static Node tfoot(Attributes attributes, Node... nodes) {
        return new ContainerTag("tfoot", attributes, nodes);
    }

    static Node tfoot(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("tfoot", attributes, nodes);
    }

    static Node tfoot(String className, String text) {
        return new ContainerTag("tfoot", className, text);
    }

    static Node tfoot(String className, Node... nodes) {
        return new ContainerTag("tfoot", className, nodes);
    }

    static Node tfoot(String className, Stream<Node> nodes) {
        return new ContainerTag("tfoot", className, nodes);
    }

    static Node tfoot(String className, Attributes attributes) {
        return new ContainerTag("tfoot", className, attributes);
    }

    static Node tfoot(String className, Attributes attributes, String text) {
        return new ContainerTag("tfoot", className, attributes, text);
    }

    static Node tfoot(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("tfoot", className, attributes, nodes);
    }

    static Node tfoot(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("tfoot", className, attributes, nodes);
    }

    static Node th() {
        return new ContainerTag("th");
    }

    static Node th(String text) {
        return new ContainerTag("th", text);
    }

    static Node th(Node... nodes) {
        return new ContainerTag("th", nodes);
    }

    static Node th(Stream<Node> nodes) {
        return new ContainerTag("th", nodes);
    }

    static Node th(Attributes attributes) {
        return new ContainerTag("th", attributes);
    }

    static Node th(Attributes attributes, String text) {
        return new ContainerTag("th", attributes, text);
    }

    static Node th(Attributes attributes, Node... nodes) {
        return new ContainerTag("th", attributes, nodes);
    }

    static Node th(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("th", attributes, nodes);
    }

    static Node th(String className, String text) {
        return new ContainerTag("th", className, text);
    }

    static Node th(String className, Node... nodes) {
        return new ContainerTag("th", className, nodes);
    }

    static Node th(String className, Stream<Node> nodes) {
        return new ContainerTag("th", className, nodes);
    }

    static Node th(String className, Attributes attributes) {
        return new ContainerTag("th", className, attributes);
    }

    static Node th(String className, Attributes attributes, String text) {
        return new ContainerTag("th", className, attributes, text);
    }

    static Node th(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("th", className, attributes, nodes);
    }

    static Node th(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("th", className, attributes, nodes);
    }

    static Node thead() {
        return new ContainerTag("thead");
    }

    static Node thead(String text) {
        return new ContainerTag("thead", text);
    }

    static Node thead(Node... nodes) {
        return new ContainerTag("thead", nodes);
    }

    static Node thead(Stream<Node> nodes) {
        return new ContainerTag("thead", nodes);
    }

    static Node thead(Attributes attributes) {
        return new ContainerTag("thead", attributes);
    }

    static Node thead(Attributes attributes, String text) {
        return new ContainerTag("thead", attributes, text);
    }

    static Node thead(Attributes attributes, Node... nodes) {
        return new ContainerTag("thead", attributes, nodes);
    }

    static Node thead(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("thead", attributes, nodes);
    }

    static Node thead(String className, String text) {
        return new ContainerTag("thead", className, text);
    }

    static Node thead(String className, Node... nodes) {
        return new ContainerTag("thead", className, nodes);
    }

    static Node thead(String className, Stream<Node> nodes) {
        return new ContainerTag("thead", className, nodes);
    }

    static Node thead(String className, Attributes attributes) {
        return new ContainerTag("thead", className, attributes);
    }

    static Node thead(String className, Attributes attributes, String text) {
        return new ContainerTag("thead", className, attributes, text);
    }

    static Node thead(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("thead", className, attributes, nodes);
    }

    static Node thead(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("thead", className, attributes, nodes);
    }

    static Node time() {
        return new ContainerTag("time");
    }

    static Node time(String text) {
        return new ContainerTag("time", text);
    }

    static Node time(Node... nodes) {
        return new ContainerTag("time", nodes);
    }

    static Node time(Stream<Node> nodes) {
        return new ContainerTag("time", nodes);
    }

    static Node time(Attributes attributes) {
        return new ContainerTag("time", attributes);
    }

    static Node time(Attributes attributes, String text) {
        return new ContainerTag("time", attributes, text);
    }

    static Node time(Attributes attributes, Node... nodes) {
        return new ContainerTag("time", attributes, nodes);
    }

    static Node time(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("time", attributes, nodes);
    }

    static Node time(String className, String text) {
        return new ContainerTag("time", className, text);
    }

    static Node time(String className, Node... nodes) {
        return new ContainerTag("time", className, nodes);
    }

    static Node time(String className, Stream<Node> nodes) {
        return new ContainerTag("time", className, nodes);
    }

    static Node time(String className, Attributes attributes) {
        return new ContainerTag("time", className, attributes);
    }

    static Node time(String className, Attributes attributes, String text) {
        return new ContainerTag("time", className, attributes, text);
    }

    static Node time(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("time", className, attributes, nodes);
    }

    static Node time(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("time", className, attributes, nodes);
    }

    static Node title() {
        return new ContainerTag("title");
    }

    static Node title(String text) {
        return new ContainerTag("title", text);
    }

    static Node title(Node... nodes) {
        return new ContainerTag("title", nodes);
    }

    static Node title(Stream<Node> nodes) {
        return new ContainerTag("title", nodes);
    }

    static Node title(Attributes attributes) {
        return new ContainerTag("title", attributes);
    }

    static Node title(Attributes attributes, String text) {
        return new ContainerTag("title", attributes, text);
    }

    static Node title(Attributes attributes, Node... nodes) {
        return new ContainerTag("title", attributes, nodes);
    }

    static Node title(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("title", attributes, nodes);
    }

    static Node title(String className, String text) {
        return new ContainerTag("title", className, text);
    }

    static Node title(String className, Node... nodes) {
        return new ContainerTag("title", className, nodes);
    }

    static Node title(String className, Stream<Node> nodes) {
        return new ContainerTag("title", className, nodes);
    }

    static Node title(String className, Attributes attributes) {
        return new ContainerTag("title", className, attributes);
    }

    static Node title(String className, Attributes attributes, String text) {
        return new ContainerTag("title", className, attributes, text);
    }

    static Node title(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("title", className, attributes, nodes);
    }

    static Node title(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("title", className, attributes, nodes);
    }

    static Node tr() {
        return new ContainerTag("tr");
    }

    static Node tr(String text) {
        return new ContainerTag("tr", text);
    }

    static Node tr(Node... nodes) {
        return new ContainerTag("tr", nodes);
    }

    static Node tr(Stream<Node> nodes) {
        return new ContainerTag("tr", nodes);
    }

    static Node tr(Attributes attributes) {
        return new ContainerTag("tr", attributes);
    }

    static Node tr(Attributes attributes, String text) {
        return new ContainerTag("tr", attributes, text);
    }

    static Node tr(Attributes attributes, Node... nodes) {
        return new ContainerTag("tr", attributes, nodes);
    }

    static Node tr(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("tr", attributes, nodes);
    }

    static Node tr(String className, String text) {
        return new ContainerTag("tr", className, text);
    }

    static Node tr(String className, Node... nodes) {
        return new ContainerTag("tr", className, nodes);
    }

    static Node tr(String className, Stream<Node> nodes) {
        return new ContainerTag("tr", className, nodes);
    }

    static Node tr(String className, Attributes attributes) {
        return new ContainerTag("tr", className, attributes);
    }

    static Node tr(String className, Attributes attributes, String text) {
        return new ContainerTag("tr", className, attributes, text);
    }

    static Node tr(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("tr", className, attributes, nodes);
    }

    static Node tr(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("tr", className, attributes, nodes);
    }

    static Node u() {
        return new ContainerTag("u");
    }

    static Node u(String text) {
        return new ContainerTag("u", text);
    }

    static Node u(Node... nodes) {
        return new ContainerTag("u", nodes);
    }

    static Node u(Stream<Node> nodes) {
        return new ContainerTag("u", nodes);
    }

    static Node u(Attributes attributes) {
        return new ContainerTag("u", attributes);
    }

    static Node u(Attributes attributes, String text) {
        return new ContainerTag("u", attributes, text);
    }

    static Node u(Attributes attributes, Node... nodes) {
        return new ContainerTag("u", attributes, nodes);
    }

    static Node u(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("u", attributes, nodes);
    }

    static Node u(String className, String text) {
        return new ContainerTag("u", className, text);
    }

    static Node u(String className, Node... nodes) {
        return new ContainerTag("u", className, nodes);
    }

    static Node u(String className, Stream<Node> nodes) {
        return new ContainerTag("u", className, nodes);
    }

    static Node u(String className, Attributes attributes) {
        return new ContainerTag("u", className, attributes);
    }

    static Node u(String className, Attributes attributes, String text) {
        return new ContainerTag("u", className, attributes, text);
    }

    static Node u(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("u", className, attributes, nodes);
    }

    static Node u(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("u", className, attributes, nodes);
    }

    static Node ul() {
        return new ContainerTag("ul");
    }

    static Node ul(String text) {
        return new ContainerTag("ul", text);
    }

    static Node ul(Node... nodes) {
        return new ContainerTag("ul", nodes);
    }

    static Node ul(Stream<Node> nodes) {
        return new ContainerTag("ul", nodes);
    }

    static Node ul(Attributes attributes) {
        return new ContainerTag("ul", attributes);
    }

    static Node ul(Attributes attributes, String text) {
        return new ContainerTag("ul", attributes, text);
    }

    static Node ul(Attributes attributes, Node... nodes) {
        return new ContainerTag("ul", attributes, nodes);
    }

    static Node ul(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("ul", attributes, nodes);
    }

    static Node ul(String className, String text) {
        return new ContainerTag("ul", className, text);
    }

    static Node ul(String className, Node... nodes) {
        return new ContainerTag("ul", className, nodes);
    }

    static Node ul(String className, Stream<Node> nodes) {
        return new ContainerTag("ul", className, nodes);
    }

    static Node ul(String className, Attributes attributes) {
        return new ContainerTag("ul", className, attributes);
    }

    static Node ul(String className, Attributes attributes, String text) {
        return new ContainerTag("ul", className, attributes, text);
    }

    static Node ul(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("ul", className, attributes, nodes);
    }

    static Node ul(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("ul", className, attributes, nodes);
    }

    static Node var() {
        return new ContainerTag("var");
    }

    static Node var(String text) {
        return new ContainerTag("var", text);
    }

    static Node var(Node... nodes) {
        return new ContainerTag("var", nodes);
    }

    static Node var(Stream<Node> nodes) {
        return new ContainerTag("var", nodes);
    }

    static Node var(Attributes attributes) {
        return new ContainerTag("var", attributes);
    }

    static Node var(Attributes attributes, String text) {
        return new ContainerTag("var", attributes, text);
    }

    static Node var(Attributes attributes, Node... nodes) {
        return new ContainerTag("var", attributes, nodes);
    }

    static Node var(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("var", attributes, nodes);
    }

    static Node var(String className, String text) {
        return new ContainerTag("var", className, text);
    }

    static Node var(String className, Node... nodes) {
        return new ContainerTag("var", className, nodes);
    }

    static Node var(String className, Stream<Node> nodes) {
        return new ContainerTag("var", className, nodes);
    }

    static Node var(String className, Attributes attributes) {
        return new ContainerTag("var", className, attributes);
    }

    static Node var(String className, Attributes attributes, String text) {
        return new ContainerTag("var", className, attributes, text);
    }

    static Node var(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("var", className, attributes, nodes);
    }

    static Node var(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("var", className, attributes, nodes);
    }

    static Node video() {
        return new ContainerTag("video");
    }

    static Node video(String text) {
        return new ContainerTag("video", text);
    }

    static Node video(Node... nodes) {
        return new ContainerTag("video", nodes);
    }

    static Node video(Stream<Node> nodes) {
        return new ContainerTag("video", nodes);
    }

    static Node video(Attributes attributes) {
        return new ContainerTag("video", attributes);
    }

    static Node video(Attributes attributes, String text) {
        return new ContainerTag("video", attributes, text);
    }

    static Node video(Attributes attributes, Node... nodes) {
        return new ContainerTag("video", attributes, nodes);
    }

    static Node video(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("video", attributes, nodes);
    }

    static Node video(String className, String text) {
        return new ContainerTag("video", className, text);
    }

    static Node video(String className, Node... nodes) {
        return new ContainerTag("video", className, nodes);
    }

    static Node video(String className, Stream<Node> nodes) {
        return new ContainerTag("video", className, nodes);
    }

    static Node video(String className, Attributes attributes) {
        return new ContainerTag("video", className, attributes);
    }

    static Node video(String className, Attributes attributes, String text) {
        return new ContainerTag("video", className, attributes, text);
    }

    static Node video(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("video", className, attributes, nodes);
    }

    static Node video(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("video", className, attributes, nodes);
    }

    static Node area() {
        return new EmptyTag("area");
    }

    static Node area(Attributes attributes) {
        return new EmptyTag("area", attributes);
    }

    static Node area(String className) {
        return new EmptyTag("area", className);
    }

    static Node area(String className, Attributes attributes) {
        return new EmptyTag("area", className, attributes);
    }

    static Node base() {
        return new EmptyTag("base");
    }

    static Node base(Attributes attributes) {
        return new EmptyTag("base", attributes);
    }

    static Node base(String className) {
        return new EmptyTag("base", className);
    }

    static Node base(String className, Attributes attributes) {
        return new EmptyTag("base", className, attributes);
    }

    static Node br() {
        return new EmptyTag("br");
    }

    static Node br(Attributes attributes) {
        return new EmptyTag("br", attributes);
    }

    static Node br(String className) {
        return new EmptyTag("br", className);
    }

    static Node br(String className, Attributes attributes) {
        return new EmptyTag("br", className, attributes);
    }

    static Node col() {
        return new EmptyTag("col");
    }

    static Node col(Attributes attributes) {
        return new EmptyTag("col", attributes);
    }

    static Node col(String className) {
        return new EmptyTag("col", className);
    }

    static Node col(String className, Attributes attributes) {
        return new EmptyTag("col", className, attributes);
    }

    static Node embed() {
        return new EmptyTag("embed");
    }

    static Node embed(Attributes attributes) {
        return new EmptyTag("embed", attributes);
    }

    static Node embed(String className) {
        return new EmptyTag("embed", className);
    }

    static Node embed(String className, Attributes attributes) {
        return new EmptyTag("embed", className, attributes);
    }

    static Node hr() {
        return new EmptyTag("hr");
    }

    static Node hr(Attributes attributes) {
        return new EmptyTag("hr", attributes);
    }

    static Node hr(String className) {
        return new EmptyTag("hr", className);
    }

    static Node hr(String className, Attributes attributes) {
        return new EmptyTag("hr", className, attributes);
    }

    static Node img() {
        return new EmptyTag("img");
    }

    static Node img(Attributes attributes) {
        return new EmptyTag("img", attributes);
    }

    static Node img(String className) {
        return new EmptyTag("img", className);
    }

    static Node img(String className, Attributes attributes) {
        return new EmptyTag("img", className, attributes);
    }

    static Node input() {
        return new EmptyTag("input");
    }

    static Node input(Attributes attributes) {
        return new EmptyTag("input", attributes);
    }

    static Node input(String className) {
        return new EmptyTag("input", className);
    }

    static Node input(String className, Attributes attributes) {
        return new EmptyTag("input", className, attributes);
    }

    static Node keygen() {
        return new EmptyTag("keygen");
    }

    static Node keygen(Attributes attributes) {
        return new EmptyTag("keygen", attributes);
    }

    static Node keygen(String className) {
        return new EmptyTag("keygen", className);
    }

    static Node keygen(String className, Attributes attributes) {
        return new EmptyTag("keygen", className, attributes);
    }

    static Node link() {
        return new EmptyTag("link");
    }

    static Node link(Attributes attributes) {
        return new EmptyTag("link", attributes);
    }

    static Node link(String className) {
        return new EmptyTag("link", className);
    }

    static Node link(String className, Attributes attributes) {
        return new EmptyTag("link", className, attributes);
    }

    static Node meta() {
        return new EmptyTag("meta");
    }

    static Node meta(Attributes attributes) {
        return new EmptyTag("meta", attributes);
    }

    static Node meta(String className) {
        return new EmptyTag("meta", className);
    }

    static Node meta(String className, Attributes attributes) {
        return new EmptyTag("meta", className, attributes);
    }

    static Node param() {
        return new EmptyTag("param");
    }

    static Node param(Attributes attributes) {
        return new EmptyTag("param", attributes);
    }

    static Node param(String className) {
        return new EmptyTag("param", className);
    }

    static Node param(String className, Attributes attributes) {
        return new EmptyTag("param", className, attributes);
    }

    static Node source() {
        return new EmptyTag("source");
    }

    static Node source(Attributes attributes) {
        return new EmptyTag("source", attributes);
    }

    static Node source(String className) {
        return new EmptyTag("source", className);
    }

    static Node source(String className, Attributes attributes) {
        return new EmptyTag("source", className, attributes);
    }

    static Node track() {
        return new EmptyTag("track");
    }

    static Node track(Attributes attributes) {
        return new EmptyTag("track", attributes);
    }

    static Node track(String className) {
        return new EmptyTag("track", className);
    }

    static Node track(String className, Attributes attributes) {
        return new EmptyTag("track", className, attributes);
    }

    static Node wbr() {
        return new EmptyTag("wbr");
    }

    static Node wbr(Attributes attributes) {
        return new EmptyTag("wbr", attributes);
    }

    static Node wbr(String className) {
        return new EmptyTag("wbr", className);
    }

    static Node wbr(String className, Attributes attributes) {
        return new EmptyTag("wbr", className, attributes);
    }
}
