package com.meetinclass.html;

import com.meetinclass.html.color.NamedColor;
import java.lang.String;
import java.util.stream.Stream;

public interface HtmlFactory {
    @NamedColor("html-dsl-tag")
    static Node text(String text) {
        return new TextNode(text);
    }

    @NamedColor("html-dsl-tag")
    static Node rawHtml(String html) {
        return new RawHtmlNode(html);
    }

    @NamedColor("html-dsl-tag")
    static Node each(Node... nodes) {
        return new EachNode(Stream.of(nodes));
    }

    @NamedColor("html-dsl-tag")
    static Node each(Stream<Node> nodes) {
        return new EachNode(nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node a() {
        return new ContainerTag("a");
    }

    @NamedColor("html-dsl-tag")
    static Node a(String text) {
        return new ContainerTag("a", text);
    }

    @NamedColor("html-dsl-tag")
    static Node a(Node... nodes) {
        return new ContainerTag("a", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node a(Stream<Node> nodes) {
        return new ContainerTag("a", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node a(Attributes attributes) {
        return new ContainerTag("a", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node a(Attributes attributes, String text) {
        return new ContainerTag("a", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node a(Attributes attributes, Node... nodes) {
        return new ContainerTag("a", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node a(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("a", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node a(String className, String text) {
        return new ContainerTag("a", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node a(String className, Node... nodes) {
        return new ContainerTag("a", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node a(String className, Stream<Node> nodes) {
        return new ContainerTag("a", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node a(String className, Attributes attributes) {
        return new ContainerTag("a", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node a(String className, Attributes attributes, String text) {
        return new ContainerTag("a", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node a(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("a", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node a(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("a", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node abbr() {
        return new ContainerTag("abbr");
    }

    @NamedColor("html-dsl-tag")
    static Node abbr(String text) {
        return new ContainerTag("abbr", text);
    }

    @NamedColor("html-dsl-tag")
    static Node abbr(Node... nodes) {
        return new ContainerTag("abbr", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node abbr(Stream<Node> nodes) {
        return new ContainerTag("abbr", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node abbr(Attributes attributes) {
        return new ContainerTag("abbr", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node abbr(Attributes attributes, String text) {
        return new ContainerTag("abbr", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node abbr(Attributes attributes, Node... nodes) {
        return new ContainerTag("abbr", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node abbr(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("abbr", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node abbr(String className, String text) {
        return new ContainerTag("abbr", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node abbr(String className, Node... nodes) {
        return new ContainerTag("abbr", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node abbr(String className, Stream<Node> nodes) {
        return new ContainerTag("abbr", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node abbr(String className, Attributes attributes) {
        return new ContainerTag("abbr", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node abbr(String className, Attributes attributes, String text) {
        return new ContainerTag("abbr", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node abbr(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("abbr", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node abbr(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("abbr", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node address() {
        return new ContainerTag("address");
    }

    @NamedColor("html-dsl-tag")
    static Node address(String text) {
        return new ContainerTag("address", text);
    }

    @NamedColor("html-dsl-tag")
    static Node address(Node... nodes) {
        return new ContainerTag("address", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node address(Stream<Node> nodes) {
        return new ContainerTag("address", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node address(Attributes attributes) {
        return new ContainerTag("address", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node address(Attributes attributes, String text) {
        return new ContainerTag("address", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node address(Attributes attributes, Node... nodes) {
        return new ContainerTag("address", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node address(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("address", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node address(String className, String text) {
        return new ContainerTag("address", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node address(String className, Node... nodes) {
        return new ContainerTag("address", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node address(String className, Stream<Node> nodes) {
        return new ContainerTag("address", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node address(String className, Attributes attributes) {
        return new ContainerTag("address", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node address(String className, Attributes attributes, String text) {
        return new ContainerTag("address", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node address(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("address", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node address(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("address", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node article() {
        return new ContainerTag("article");
    }

    @NamedColor("html-dsl-tag")
    static Node article(String text) {
        return new ContainerTag("article", text);
    }

    @NamedColor("html-dsl-tag")
    static Node article(Node... nodes) {
        return new ContainerTag("article", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node article(Stream<Node> nodes) {
        return new ContainerTag("article", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node article(Attributes attributes) {
        return new ContainerTag("article", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node article(Attributes attributes, String text) {
        return new ContainerTag("article", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node article(Attributes attributes, Node... nodes) {
        return new ContainerTag("article", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node article(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("article", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node article(String className, String text) {
        return new ContainerTag("article", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node article(String className, Node... nodes) {
        return new ContainerTag("article", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node article(String className, Stream<Node> nodes) {
        return new ContainerTag("article", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node article(String className, Attributes attributes) {
        return new ContainerTag("article", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node article(String className, Attributes attributes, String text) {
        return new ContainerTag("article", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node article(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("article", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node article(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("article", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node aside() {
        return new ContainerTag("aside");
    }

    @NamedColor("html-dsl-tag")
    static Node aside(String text) {
        return new ContainerTag("aside", text);
    }

    @NamedColor("html-dsl-tag")
    static Node aside(Node... nodes) {
        return new ContainerTag("aside", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node aside(Stream<Node> nodes) {
        return new ContainerTag("aside", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node aside(Attributes attributes) {
        return new ContainerTag("aside", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node aside(Attributes attributes, String text) {
        return new ContainerTag("aside", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node aside(Attributes attributes, Node... nodes) {
        return new ContainerTag("aside", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node aside(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("aside", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node aside(String className, String text) {
        return new ContainerTag("aside", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node aside(String className, Node... nodes) {
        return new ContainerTag("aside", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node aside(String className, Stream<Node> nodes) {
        return new ContainerTag("aside", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node aside(String className, Attributes attributes) {
        return new ContainerTag("aside", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node aside(String className, Attributes attributes, String text) {
        return new ContainerTag("aside", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node aside(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("aside", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node aside(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("aside", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node audio() {
        return new ContainerTag("audio");
    }

    @NamedColor("html-dsl-tag")
    static Node audio(String text) {
        return new ContainerTag("audio", text);
    }

    @NamedColor("html-dsl-tag")
    static Node audio(Node... nodes) {
        return new ContainerTag("audio", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node audio(Stream<Node> nodes) {
        return new ContainerTag("audio", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node audio(Attributes attributes) {
        return new ContainerTag("audio", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node audio(Attributes attributes, String text) {
        return new ContainerTag("audio", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node audio(Attributes attributes, Node... nodes) {
        return new ContainerTag("audio", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node audio(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("audio", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node audio(String className, String text) {
        return new ContainerTag("audio", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node audio(String className, Node... nodes) {
        return new ContainerTag("audio", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node audio(String className, Stream<Node> nodes) {
        return new ContainerTag("audio", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node audio(String className, Attributes attributes) {
        return new ContainerTag("audio", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node audio(String className, Attributes attributes, String text) {
        return new ContainerTag("audio", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node audio(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("audio", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node audio(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("audio", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node b() {
        return new ContainerTag("b");
    }

    @NamedColor("html-dsl-tag")
    static Node b(String text) {
        return new ContainerTag("b", text);
    }

    @NamedColor("html-dsl-tag")
    static Node b(Node... nodes) {
        return new ContainerTag("b", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node b(Stream<Node> nodes) {
        return new ContainerTag("b", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node b(Attributes attributes) {
        return new ContainerTag("b", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node b(Attributes attributes, String text) {
        return new ContainerTag("b", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node b(Attributes attributes, Node... nodes) {
        return new ContainerTag("b", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node b(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("b", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node b(String className, String text) {
        return new ContainerTag("b", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node b(String className, Node... nodes) {
        return new ContainerTag("b", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node b(String className, Stream<Node> nodes) {
        return new ContainerTag("b", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node b(String className, Attributes attributes) {
        return new ContainerTag("b", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node b(String className, Attributes attributes, String text) {
        return new ContainerTag("b", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node b(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("b", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node b(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("b", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdi() {
        return new ContainerTag("bdi");
    }

    @NamedColor("html-dsl-tag")
    static Node bdi(String text) {
        return new ContainerTag("bdi", text);
    }

    @NamedColor("html-dsl-tag")
    static Node bdi(Node... nodes) {
        return new ContainerTag("bdi", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdi(Stream<Node> nodes) {
        return new ContainerTag("bdi", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdi(Attributes attributes) {
        return new ContainerTag("bdi", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdi(Attributes attributes, String text) {
        return new ContainerTag("bdi", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node bdi(Attributes attributes, Node... nodes) {
        return new ContainerTag("bdi", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdi(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("bdi", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdi(String className, String text) {
        return new ContainerTag("bdi", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node bdi(String className, Node... nodes) {
        return new ContainerTag("bdi", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdi(String className, Stream<Node> nodes) {
        return new ContainerTag("bdi", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdi(String className, Attributes attributes) {
        return new ContainerTag("bdi", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdi(String className, Attributes attributes, String text) {
        return new ContainerTag("bdi", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node bdi(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("bdi", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdi(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("bdi", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdo() {
        return new ContainerTag("bdo");
    }

    @NamedColor("html-dsl-tag")
    static Node bdo(String text) {
        return new ContainerTag("bdo", text);
    }

    @NamedColor("html-dsl-tag")
    static Node bdo(Node... nodes) {
        return new ContainerTag("bdo", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdo(Stream<Node> nodes) {
        return new ContainerTag("bdo", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdo(Attributes attributes) {
        return new ContainerTag("bdo", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdo(Attributes attributes, String text) {
        return new ContainerTag("bdo", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node bdo(Attributes attributes, Node... nodes) {
        return new ContainerTag("bdo", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdo(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("bdo", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdo(String className, String text) {
        return new ContainerTag("bdo", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node bdo(String className, Node... nodes) {
        return new ContainerTag("bdo", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdo(String className, Stream<Node> nodes) {
        return new ContainerTag("bdo", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdo(String className, Attributes attributes) {
        return new ContainerTag("bdo", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdo(String className, Attributes attributes, String text) {
        return new ContainerTag("bdo", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node bdo(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("bdo", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node bdo(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("bdo", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node blockquote() {
        return new ContainerTag("blockquote");
    }

    @NamedColor("html-dsl-tag")
    static Node blockquote(String text) {
        return new ContainerTag("blockquote", text);
    }

    @NamedColor("html-dsl-tag")
    static Node blockquote(Node... nodes) {
        return new ContainerTag("blockquote", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node blockquote(Stream<Node> nodes) {
        return new ContainerTag("blockquote", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node blockquote(Attributes attributes) {
        return new ContainerTag("blockquote", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node blockquote(Attributes attributes, String text) {
        return new ContainerTag("blockquote", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node blockquote(Attributes attributes, Node... nodes) {
        return new ContainerTag("blockquote", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node blockquote(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("blockquote", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node blockquote(String className, String text) {
        return new ContainerTag("blockquote", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node blockquote(String className, Node... nodes) {
        return new ContainerTag("blockquote", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node blockquote(String className, Stream<Node> nodes) {
        return new ContainerTag("blockquote", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node blockquote(String className, Attributes attributes) {
        return new ContainerTag("blockquote", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node blockquote(String className, Attributes attributes, String text) {
        return new ContainerTag("blockquote", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node blockquote(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("blockquote", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node blockquote(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("blockquote", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node body() {
        return new ContainerTag("body");
    }

    @NamedColor("html-dsl-tag")
    static Node body(String text) {
        return new ContainerTag("body", text);
    }

    @NamedColor("html-dsl-tag")
    static Node body(Node... nodes) {
        return new ContainerTag("body", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node body(Stream<Node> nodes) {
        return new ContainerTag("body", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node body(Attributes attributes) {
        return new ContainerTag("body", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node body(Attributes attributes, String text) {
        return new ContainerTag("body", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node body(Attributes attributes, Node... nodes) {
        return new ContainerTag("body", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node body(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("body", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node body(String className, String text) {
        return new ContainerTag("body", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node body(String className, Node... nodes) {
        return new ContainerTag("body", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node body(String className, Stream<Node> nodes) {
        return new ContainerTag("body", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node body(String className, Attributes attributes) {
        return new ContainerTag("body", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node body(String className, Attributes attributes, String text) {
        return new ContainerTag("body", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node body(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("body", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node body(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("body", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node button() {
        return new ContainerTag("button");
    }

    @NamedColor("html-dsl-tag")
    static Node button(String text) {
        return new ContainerTag("button", text);
    }

    @NamedColor("html-dsl-tag")
    static Node button(Node... nodes) {
        return new ContainerTag("button", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node button(Stream<Node> nodes) {
        return new ContainerTag("button", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node button(Attributes attributes) {
        return new ContainerTag("button", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node button(Attributes attributes, String text) {
        return new ContainerTag("button", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node button(Attributes attributes, Node... nodes) {
        return new ContainerTag("button", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node button(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("button", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node button(String className, String text) {
        return new ContainerTag("button", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node button(String className, Node... nodes) {
        return new ContainerTag("button", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node button(String className, Stream<Node> nodes) {
        return new ContainerTag("button", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node button(String className, Attributes attributes) {
        return new ContainerTag("button", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node button(String className, Attributes attributes, String text) {
        return new ContainerTag("button", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node button(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("button", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node button(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("button", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node canvas() {
        return new ContainerTag("canvas");
    }

    @NamedColor("html-dsl-tag")
    static Node canvas(String text) {
        return new ContainerTag("canvas", text);
    }

    @NamedColor("html-dsl-tag")
    static Node canvas(Node... nodes) {
        return new ContainerTag("canvas", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node canvas(Stream<Node> nodes) {
        return new ContainerTag("canvas", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node canvas(Attributes attributes) {
        return new ContainerTag("canvas", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node canvas(Attributes attributes, String text) {
        return new ContainerTag("canvas", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node canvas(Attributes attributes, Node... nodes) {
        return new ContainerTag("canvas", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node canvas(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("canvas", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node canvas(String className, String text) {
        return new ContainerTag("canvas", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node canvas(String className, Node... nodes) {
        return new ContainerTag("canvas", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node canvas(String className, Stream<Node> nodes) {
        return new ContainerTag("canvas", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node canvas(String className, Attributes attributes) {
        return new ContainerTag("canvas", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node canvas(String className, Attributes attributes, String text) {
        return new ContainerTag("canvas", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node canvas(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("canvas", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node canvas(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("canvas", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node caption() {
        return new ContainerTag("caption");
    }

    @NamedColor("html-dsl-tag")
    static Node caption(String text) {
        return new ContainerTag("caption", text);
    }

    @NamedColor("html-dsl-tag")
    static Node caption(Node... nodes) {
        return new ContainerTag("caption", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node caption(Stream<Node> nodes) {
        return new ContainerTag("caption", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node caption(Attributes attributes) {
        return new ContainerTag("caption", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node caption(Attributes attributes, String text) {
        return new ContainerTag("caption", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node caption(Attributes attributes, Node... nodes) {
        return new ContainerTag("caption", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node caption(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("caption", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node caption(String className, String text) {
        return new ContainerTag("caption", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node caption(String className, Node... nodes) {
        return new ContainerTag("caption", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node caption(String className, Stream<Node> nodes) {
        return new ContainerTag("caption", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node caption(String className, Attributes attributes) {
        return new ContainerTag("caption", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node caption(String className, Attributes attributes, String text) {
        return new ContainerTag("caption", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node caption(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("caption", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node caption(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("caption", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node cite() {
        return new ContainerTag("cite");
    }

    @NamedColor("html-dsl-tag")
    static Node cite(String text) {
        return new ContainerTag("cite", text);
    }

    @NamedColor("html-dsl-tag")
    static Node cite(Node... nodes) {
        return new ContainerTag("cite", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node cite(Stream<Node> nodes) {
        return new ContainerTag("cite", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node cite(Attributes attributes) {
        return new ContainerTag("cite", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node cite(Attributes attributes, String text) {
        return new ContainerTag("cite", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node cite(Attributes attributes, Node... nodes) {
        return new ContainerTag("cite", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node cite(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("cite", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node cite(String className, String text) {
        return new ContainerTag("cite", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node cite(String className, Node... nodes) {
        return new ContainerTag("cite", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node cite(String className, Stream<Node> nodes) {
        return new ContainerTag("cite", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node cite(String className, Attributes attributes) {
        return new ContainerTag("cite", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node cite(String className, Attributes attributes, String text) {
        return new ContainerTag("cite", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node cite(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("cite", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node cite(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("cite", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node code() {
        return new ContainerTag("code");
    }

    @NamedColor("html-dsl-tag")
    static Node code(String text) {
        return new ContainerTag("code", text);
    }

    @NamedColor("html-dsl-tag")
    static Node code(Node... nodes) {
        return new ContainerTag("code", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node code(Stream<Node> nodes) {
        return new ContainerTag("code", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node code(Attributes attributes) {
        return new ContainerTag("code", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node code(Attributes attributes, String text) {
        return new ContainerTag("code", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node code(Attributes attributes, Node... nodes) {
        return new ContainerTag("code", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node code(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("code", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node code(String className, String text) {
        return new ContainerTag("code", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node code(String className, Node... nodes) {
        return new ContainerTag("code", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node code(String className, Stream<Node> nodes) {
        return new ContainerTag("code", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node code(String className, Attributes attributes) {
        return new ContainerTag("code", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node code(String className, Attributes attributes, String text) {
        return new ContainerTag("code", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node code(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("code", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node code(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("code", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node colgroup() {
        return new ContainerTag("colgroup");
    }

    @NamedColor("html-dsl-tag")
    static Node colgroup(String text) {
        return new ContainerTag("colgroup", text);
    }

    @NamedColor("html-dsl-tag")
    static Node colgroup(Node... nodes) {
        return new ContainerTag("colgroup", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node colgroup(Stream<Node> nodes) {
        return new ContainerTag("colgroup", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node colgroup(Attributes attributes) {
        return new ContainerTag("colgroup", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node colgroup(Attributes attributes, String text) {
        return new ContainerTag("colgroup", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node colgroup(Attributes attributes, Node... nodes) {
        return new ContainerTag("colgroup", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node colgroup(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("colgroup", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node colgroup(String className, String text) {
        return new ContainerTag("colgroup", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node colgroup(String className, Node... nodes) {
        return new ContainerTag("colgroup", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node colgroup(String className, Stream<Node> nodes) {
        return new ContainerTag("colgroup", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node colgroup(String className, Attributes attributes) {
        return new ContainerTag("colgroup", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node colgroup(String className, Attributes attributes, String text) {
        return new ContainerTag("colgroup", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node colgroup(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("colgroup", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node colgroup(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("colgroup", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node datalist() {
        return new ContainerTag("datalist");
    }

    @NamedColor("html-dsl-tag")
    static Node datalist(String text) {
        return new ContainerTag("datalist", text);
    }

    @NamedColor("html-dsl-tag")
    static Node datalist(Node... nodes) {
        return new ContainerTag("datalist", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node datalist(Stream<Node> nodes) {
        return new ContainerTag("datalist", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node datalist(Attributes attributes) {
        return new ContainerTag("datalist", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node datalist(Attributes attributes, String text) {
        return new ContainerTag("datalist", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node datalist(Attributes attributes, Node... nodes) {
        return new ContainerTag("datalist", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node datalist(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("datalist", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node datalist(String className, String text) {
        return new ContainerTag("datalist", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node datalist(String className, Node... nodes) {
        return new ContainerTag("datalist", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node datalist(String className, Stream<Node> nodes) {
        return new ContainerTag("datalist", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node datalist(String className, Attributes attributes) {
        return new ContainerTag("datalist", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node datalist(String className, Attributes attributes, String text) {
        return new ContainerTag("datalist", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node datalist(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("datalist", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node datalist(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("datalist", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dd() {
        return new ContainerTag("dd");
    }

    @NamedColor("html-dsl-tag")
    static Node dd(String text) {
        return new ContainerTag("dd", text);
    }

    @NamedColor("html-dsl-tag")
    static Node dd(Node... nodes) {
        return new ContainerTag("dd", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dd(Stream<Node> nodes) {
        return new ContainerTag("dd", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dd(Attributes attributes) {
        return new ContainerTag("dd", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node dd(Attributes attributes, String text) {
        return new ContainerTag("dd", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node dd(Attributes attributes, Node... nodes) {
        return new ContainerTag("dd", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dd(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dd", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dd(String className, String text) {
        return new ContainerTag("dd", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node dd(String className, Node... nodes) {
        return new ContainerTag("dd", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dd(String className, Stream<Node> nodes) {
        return new ContainerTag("dd", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dd(String className, Attributes attributes) {
        return new ContainerTag("dd", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node dd(String className, Attributes attributes, String text) {
        return new ContainerTag("dd", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node dd(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("dd", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dd(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dd", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node del() {
        return new ContainerTag("del");
    }

    @NamedColor("html-dsl-tag")
    static Node del(String text) {
        return new ContainerTag("del", text);
    }

    @NamedColor("html-dsl-tag")
    static Node del(Node... nodes) {
        return new ContainerTag("del", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node del(Stream<Node> nodes) {
        return new ContainerTag("del", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node del(Attributes attributes) {
        return new ContainerTag("del", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node del(Attributes attributes, String text) {
        return new ContainerTag("del", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node del(Attributes attributes, Node... nodes) {
        return new ContainerTag("del", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node del(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("del", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node del(String className, String text) {
        return new ContainerTag("del", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node del(String className, Node... nodes) {
        return new ContainerTag("del", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node del(String className, Stream<Node> nodes) {
        return new ContainerTag("del", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node del(String className, Attributes attributes) {
        return new ContainerTag("del", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node del(String className, Attributes attributes, String text) {
        return new ContainerTag("del", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node del(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("del", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node del(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("del", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node details() {
        return new ContainerTag("details");
    }

    @NamedColor("html-dsl-tag")
    static Node details(String text) {
        return new ContainerTag("details", text);
    }

    @NamedColor("html-dsl-tag")
    static Node details(Node... nodes) {
        return new ContainerTag("details", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node details(Stream<Node> nodes) {
        return new ContainerTag("details", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node details(Attributes attributes) {
        return new ContainerTag("details", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node details(Attributes attributes, String text) {
        return new ContainerTag("details", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node details(Attributes attributes, Node... nodes) {
        return new ContainerTag("details", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node details(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("details", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node details(String className, String text) {
        return new ContainerTag("details", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node details(String className, Node... nodes) {
        return new ContainerTag("details", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node details(String className, Stream<Node> nodes) {
        return new ContainerTag("details", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node details(String className, Attributes attributes) {
        return new ContainerTag("details", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node details(String className, Attributes attributes, String text) {
        return new ContainerTag("details", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node details(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("details", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node details(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("details", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dfn() {
        return new ContainerTag("dfn");
    }

    @NamedColor("html-dsl-tag")
    static Node dfn(String text) {
        return new ContainerTag("dfn", text);
    }

    @NamedColor("html-dsl-tag")
    static Node dfn(Node... nodes) {
        return new ContainerTag("dfn", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dfn(Stream<Node> nodes) {
        return new ContainerTag("dfn", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dfn(Attributes attributes) {
        return new ContainerTag("dfn", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node dfn(Attributes attributes, String text) {
        return new ContainerTag("dfn", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node dfn(Attributes attributes, Node... nodes) {
        return new ContainerTag("dfn", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dfn(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dfn", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dfn(String className, String text) {
        return new ContainerTag("dfn", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node dfn(String className, Node... nodes) {
        return new ContainerTag("dfn", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dfn(String className, Stream<Node> nodes) {
        return new ContainerTag("dfn", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dfn(String className, Attributes attributes) {
        return new ContainerTag("dfn", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node dfn(String className, Attributes attributes, String text) {
        return new ContainerTag("dfn", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node dfn(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("dfn", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dfn(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dfn", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dialog() {
        return new ContainerTag("dialog");
    }

    @NamedColor("html-dsl-tag")
    static Node dialog(String text) {
        return new ContainerTag("dialog", text);
    }

    @NamedColor("html-dsl-tag")
    static Node dialog(Node... nodes) {
        return new ContainerTag("dialog", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dialog(Stream<Node> nodes) {
        return new ContainerTag("dialog", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dialog(Attributes attributes) {
        return new ContainerTag("dialog", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node dialog(Attributes attributes, String text) {
        return new ContainerTag("dialog", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node dialog(Attributes attributes, Node... nodes) {
        return new ContainerTag("dialog", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dialog(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dialog", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dialog(String className, String text) {
        return new ContainerTag("dialog", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node dialog(String className, Node... nodes) {
        return new ContainerTag("dialog", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dialog(String className, Stream<Node> nodes) {
        return new ContainerTag("dialog", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dialog(String className, Attributes attributes) {
        return new ContainerTag("dialog", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node dialog(String className, Attributes attributes, String text) {
        return new ContainerTag("dialog", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node dialog(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("dialog", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dialog(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dialog", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node div() {
        return new ContainerTag("div");
    }

    @NamedColor("html-dsl-tag")
    static Node div(String text) {
        return new ContainerTag("div", text);
    }

    @NamedColor("html-dsl-tag")
    static Node div(Node... nodes) {
        return new ContainerTag("div", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node div(Stream<Node> nodes) {
        return new ContainerTag("div", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node div(Attributes attributes) {
        return new ContainerTag("div", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node div(Attributes attributes, String text) {
        return new ContainerTag("div", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node div(Attributes attributes, Node... nodes) {
        return new ContainerTag("div", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node div(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("div", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node div(String className, String text) {
        return new ContainerTag("div", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node div(String className, Node... nodes) {
        return new ContainerTag("div", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node div(String className, Stream<Node> nodes) {
        return new ContainerTag("div", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node div(String className, Attributes attributes) {
        return new ContainerTag("div", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node div(String className, Attributes attributes, String text) {
        return new ContainerTag("div", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node div(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("div", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node div(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("div", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dl() {
        return new ContainerTag("dl");
    }

    @NamedColor("html-dsl-tag")
    static Node dl(String text) {
        return new ContainerTag("dl", text);
    }

    @NamedColor("html-dsl-tag")
    static Node dl(Node... nodes) {
        return new ContainerTag("dl", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dl(Stream<Node> nodes) {
        return new ContainerTag("dl", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dl(Attributes attributes) {
        return new ContainerTag("dl", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node dl(Attributes attributes, String text) {
        return new ContainerTag("dl", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node dl(Attributes attributes, Node... nodes) {
        return new ContainerTag("dl", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dl(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dl", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dl(String className, String text) {
        return new ContainerTag("dl", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node dl(String className, Node... nodes) {
        return new ContainerTag("dl", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dl(String className, Stream<Node> nodes) {
        return new ContainerTag("dl", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dl(String className, Attributes attributes) {
        return new ContainerTag("dl", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node dl(String className, Attributes attributes, String text) {
        return new ContainerTag("dl", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node dl(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("dl", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dl(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dl", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dt() {
        return new ContainerTag("dt");
    }

    @NamedColor("html-dsl-tag")
    static Node dt(String text) {
        return new ContainerTag("dt", text);
    }

    @NamedColor("html-dsl-tag")
    static Node dt(Node... nodes) {
        return new ContainerTag("dt", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dt(Stream<Node> nodes) {
        return new ContainerTag("dt", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dt(Attributes attributes) {
        return new ContainerTag("dt", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node dt(Attributes attributes, String text) {
        return new ContainerTag("dt", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node dt(Attributes attributes, Node... nodes) {
        return new ContainerTag("dt", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dt(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dt", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dt(String className, String text) {
        return new ContainerTag("dt", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node dt(String className, Node... nodes) {
        return new ContainerTag("dt", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dt(String className, Stream<Node> nodes) {
        return new ContainerTag("dt", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dt(String className, Attributes attributes) {
        return new ContainerTag("dt", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node dt(String className, Attributes attributes, String text) {
        return new ContainerTag("dt", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node dt(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("dt", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node dt(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("dt", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node em() {
        return new ContainerTag("em");
    }

    @NamedColor("html-dsl-tag")
    static Node em(String text) {
        return new ContainerTag("em", text);
    }

    @NamedColor("html-dsl-tag")
    static Node em(Node... nodes) {
        return new ContainerTag("em", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node em(Stream<Node> nodes) {
        return new ContainerTag("em", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node em(Attributes attributes) {
        return new ContainerTag("em", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node em(Attributes attributes, String text) {
        return new ContainerTag("em", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node em(Attributes attributes, Node... nodes) {
        return new ContainerTag("em", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node em(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("em", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node em(String className, String text) {
        return new ContainerTag("em", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node em(String className, Node... nodes) {
        return new ContainerTag("em", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node em(String className, Stream<Node> nodes) {
        return new ContainerTag("em", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node em(String className, Attributes attributes) {
        return new ContainerTag("em", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node em(String className, Attributes attributes, String text) {
        return new ContainerTag("em", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node em(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("em", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node em(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("em", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node fieldset() {
        return new ContainerTag("fieldset");
    }

    @NamedColor("html-dsl-tag")
    static Node fieldset(String text) {
        return new ContainerTag("fieldset", text);
    }

    @NamedColor("html-dsl-tag")
    static Node fieldset(Node... nodes) {
        return new ContainerTag("fieldset", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node fieldset(Stream<Node> nodes) {
        return new ContainerTag("fieldset", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node fieldset(Attributes attributes) {
        return new ContainerTag("fieldset", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node fieldset(Attributes attributes, String text) {
        return new ContainerTag("fieldset", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node fieldset(Attributes attributes, Node... nodes) {
        return new ContainerTag("fieldset", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node fieldset(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("fieldset", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node fieldset(String className, String text) {
        return new ContainerTag("fieldset", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node fieldset(String className, Node... nodes) {
        return new ContainerTag("fieldset", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node fieldset(String className, Stream<Node> nodes) {
        return new ContainerTag("fieldset", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node fieldset(String className, Attributes attributes) {
        return new ContainerTag("fieldset", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node fieldset(String className, Attributes attributes, String text) {
        return new ContainerTag("fieldset", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node fieldset(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("fieldset", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node fieldset(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("fieldset", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node figcaption() {
        return new ContainerTag("figcaption");
    }

    @NamedColor("html-dsl-tag")
    static Node figcaption(String text) {
        return new ContainerTag("figcaption", text);
    }

    @NamedColor("html-dsl-tag")
    static Node figcaption(Node... nodes) {
        return new ContainerTag("figcaption", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node figcaption(Stream<Node> nodes) {
        return new ContainerTag("figcaption", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node figcaption(Attributes attributes) {
        return new ContainerTag("figcaption", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node figcaption(Attributes attributes, String text) {
        return new ContainerTag("figcaption", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node figcaption(Attributes attributes, Node... nodes) {
        return new ContainerTag("figcaption", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node figcaption(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("figcaption", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node figcaption(String className, String text) {
        return new ContainerTag("figcaption", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node figcaption(String className, Node... nodes) {
        return new ContainerTag("figcaption", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node figcaption(String className, Stream<Node> nodes) {
        return new ContainerTag("figcaption", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node figcaption(String className, Attributes attributes) {
        return new ContainerTag("figcaption", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node figcaption(String className, Attributes attributes, String text) {
        return new ContainerTag("figcaption", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node figcaption(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("figcaption", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node figcaption(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("figcaption", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node figure() {
        return new ContainerTag("figure");
    }

    @NamedColor("html-dsl-tag")
    static Node figure(String text) {
        return new ContainerTag("figure", text);
    }

    @NamedColor("html-dsl-tag")
    static Node figure(Node... nodes) {
        return new ContainerTag("figure", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node figure(Stream<Node> nodes) {
        return new ContainerTag("figure", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node figure(Attributes attributes) {
        return new ContainerTag("figure", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node figure(Attributes attributes, String text) {
        return new ContainerTag("figure", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node figure(Attributes attributes, Node... nodes) {
        return new ContainerTag("figure", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node figure(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("figure", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node figure(String className, String text) {
        return new ContainerTag("figure", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node figure(String className, Node... nodes) {
        return new ContainerTag("figure", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node figure(String className, Stream<Node> nodes) {
        return new ContainerTag("figure", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node figure(String className, Attributes attributes) {
        return new ContainerTag("figure", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node figure(String className, Attributes attributes, String text) {
        return new ContainerTag("figure", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node figure(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("figure", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node figure(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("figure", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node footer() {
        return new ContainerTag("footer");
    }

    @NamedColor("html-dsl-tag")
    static Node footer(String text) {
        return new ContainerTag("footer", text);
    }

    @NamedColor("html-dsl-tag")
    static Node footer(Node... nodes) {
        return new ContainerTag("footer", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node footer(Stream<Node> nodes) {
        return new ContainerTag("footer", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node footer(Attributes attributes) {
        return new ContainerTag("footer", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node footer(Attributes attributes, String text) {
        return new ContainerTag("footer", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node footer(Attributes attributes, Node... nodes) {
        return new ContainerTag("footer", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node footer(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("footer", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node footer(String className, String text) {
        return new ContainerTag("footer", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node footer(String className, Node... nodes) {
        return new ContainerTag("footer", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node footer(String className, Stream<Node> nodes) {
        return new ContainerTag("footer", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node footer(String className, Attributes attributes) {
        return new ContainerTag("footer", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node footer(String className, Attributes attributes, String text) {
        return new ContainerTag("footer", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node footer(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("footer", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node footer(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("footer", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node form() {
        return new ContainerTag("form");
    }

    @NamedColor("html-dsl-tag")
    static Node form(String text) {
        return new ContainerTag("form", text);
    }

    @NamedColor("html-dsl-tag")
    static Node form(Node... nodes) {
        return new ContainerTag("form", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node form(Stream<Node> nodes) {
        return new ContainerTag("form", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node form(Attributes attributes) {
        return new ContainerTag("form", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node form(Attributes attributes, String text) {
        return new ContainerTag("form", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node form(Attributes attributes, Node... nodes) {
        return new ContainerTag("form", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node form(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("form", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node form(String className, String text) {
        return new ContainerTag("form", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node form(String className, Node... nodes) {
        return new ContainerTag("form", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node form(String className, Stream<Node> nodes) {
        return new ContainerTag("form", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node form(String className, Attributes attributes) {
        return new ContainerTag("form", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node form(String className, Attributes attributes, String text) {
        return new ContainerTag("form", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node form(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("form", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node form(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("form", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h1() {
        return new ContainerTag("h1");
    }

    @NamedColor("html-dsl-tag")
    static Node h1(String text) {
        return new ContainerTag("h1", text);
    }

    @NamedColor("html-dsl-tag")
    static Node h1(Node... nodes) {
        return new ContainerTag("h1", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h1(Stream<Node> nodes) {
        return new ContainerTag("h1", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h1(Attributes attributes) {
        return new ContainerTag("h1", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node h1(Attributes attributes, String text) {
        return new ContainerTag("h1", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node h1(Attributes attributes, Node... nodes) {
        return new ContainerTag("h1", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h1(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h1", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h1(String className, String text) {
        return new ContainerTag("h1", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node h1(String className, Node... nodes) {
        return new ContainerTag("h1", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h1(String className, Stream<Node> nodes) {
        return new ContainerTag("h1", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h1(String className, Attributes attributes) {
        return new ContainerTag("h1", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node h1(String className, Attributes attributes, String text) {
        return new ContainerTag("h1", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node h1(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("h1", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h1(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h1", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h2() {
        return new ContainerTag("h2");
    }

    @NamedColor("html-dsl-tag")
    static Node h2(String text) {
        return new ContainerTag("h2", text);
    }

    @NamedColor("html-dsl-tag")
    static Node h2(Node... nodes) {
        return new ContainerTag("h2", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h2(Stream<Node> nodes) {
        return new ContainerTag("h2", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h2(Attributes attributes) {
        return new ContainerTag("h2", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node h2(Attributes attributes, String text) {
        return new ContainerTag("h2", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node h2(Attributes attributes, Node... nodes) {
        return new ContainerTag("h2", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h2(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h2", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h2(String className, String text) {
        return new ContainerTag("h2", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node h2(String className, Node... nodes) {
        return new ContainerTag("h2", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h2(String className, Stream<Node> nodes) {
        return new ContainerTag("h2", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h2(String className, Attributes attributes) {
        return new ContainerTag("h2", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node h2(String className, Attributes attributes, String text) {
        return new ContainerTag("h2", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node h2(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("h2", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h2(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h2", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h3() {
        return new ContainerTag("h3");
    }

    @NamedColor("html-dsl-tag")
    static Node h3(String text) {
        return new ContainerTag("h3", text);
    }

    @NamedColor("html-dsl-tag")
    static Node h3(Node... nodes) {
        return new ContainerTag("h3", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h3(Stream<Node> nodes) {
        return new ContainerTag("h3", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h3(Attributes attributes) {
        return new ContainerTag("h3", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node h3(Attributes attributes, String text) {
        return new ContainerTag("h3", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node h3(Attributes attributes, Node... nodes) {
        return new ContainerTag("h3", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h3(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h3", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h3(String className, String text) {
        return new ContainerTag("h3", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node h3(String className, Node... nodes) {
        return new ContainerTag("h3", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h3(String className, Stream<Node> nodes) {
        return new ContainerTag("h3", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h3(String className, Attributes attributes) {
        return new ContainerTag("h3", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node h3(String className, Attributes attributes, String text) {
        return new ContainerTag("h3", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node h3(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("h3", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h3(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h3", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h4() {
        return new ContainerTag("h4");
    }

    @NamedColor("html-dsl-tag")
    static Node h4(String text) {
        return new ContainerTag("h4", text);
    }

    @NamedColor("html-dsl-tag")
    static Node h4(Node... nodes) {
        return new ContainerTag("h4", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h4(Stream<Node> nodes) {
        return new ContainerTag("h4", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h4(Attributes attributes) {
        return new ContainerTag("h4", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node h4(Attributes attributes, String text) {
        return new ContainerTag("h4", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node h4(Attributes attributes, Node... nodes) {
        return new ContainerTag("h4", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h4(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h4", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h4(String className, String text) {
        return new ContainerTag("h4", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node h4(String className, Node... nodes) {
        return new ContainerTag("h4", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h4(String className, Stream<Node> nodes) {
        return new ContainerTag("h4", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h4(String className, Attributes attributes) {
        return new ContainerTag("h4", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node h4(String className, Attributes attributes, String text) {
        return new ContainerTag("h4", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node h4(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("h4", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h4(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h4", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h5() {
        return new ContainerTag("h5");
    }

    @NamedColor("html-dsl-tag")
    static Node h5(String text) {
        return new ContainerTag("h5", text);
    }

    @NamedColor("html-dsl-tag")
    static Node h5(Node... nodes) {
        return new ContainerTag("h5", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h5(Stream<Node> nodes) {
        return new ContainerTag("h5", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h5(Attributes attributes) {
        return new ContainerTag("h5", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node h5(Attributes attributes, String text) {
        return new ContainerTag("h5", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node h5(Attributes attributes, Node... nodes) {
        return new ContainerTag("h5", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h5(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h5", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h5(String className, String text) {
        return new ContainerTag("h5", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node h5(String className, Node... nodes) {
        return new ContainerTag("h5", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h5(String className, Stream<Node> nodes) {
        return new ContainerTag("h5", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h5(String className, Attributes attributes) {
        return new ContainerTag("h5", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node h5(String className, Attributes attributes, String text) {
        return new ContainerTag("h5", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node h5(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("h5", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h5(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h5", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h6() {
        return new ContainerTag("h6");
    }

    @NamedColor("html-dsl-tag")
    static Node h6(String text) {
        return new ContainerTag("h6", text);
    }

    @NamedColor("html-dsl-tag")
    static Node h6(Node... nodes) {
        return new ContainerTag("h6", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h6(Stream<Node> nodes) {
        return new ContainerTag("h6", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h6(Attributes attributes) {
        return new ContainerTag("h6", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node h6(Attributes attributes, String text) {
        return new ContainerTag("h6", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node h6(Attributes attributes, Node... nodes) {
        return new ContainerTag("h6", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h6(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h6", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h6(String className, String text) {
        return new ContainerTag("h6", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node h6(String className, Node... nodes) {
        return new ContainerTag("h6", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h6(String className, Stream<Node> nodes) {
        return new ContainerTag("h6", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h6(String className, Attributes attributes) {
        return new ContainerTag("h6", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node h6(String className, Attributes attributes, String text) {
        return new ContainerTag("h6", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node h6(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("h6", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node h6(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("h6", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node head() {
        return new ContainerTag("head");
    }

    @NamedColor("html-dsl-tag")
    static Node head(String text) {
        return new ContainerTag("head", text);
    }

    @NamedColor("html-dsl-tag")
    static Node head(Node... nodes) {
        return new ContainerTag("head", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node head(Stream<Node> nodes) {
        return new ContainerTag("head", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node head(Attributes attributes) {
        return new ContainerTag("head", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node head(Attributes attributes, String text) {
        return new ContainerTag("head", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node head(Attributes attributes, Node... nodes) {
        return new ContainerTag("head", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node head(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("head", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node head(String className, String text) {
        return new ContainerTag("head", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node head(String className, Node... nodes) {
        return new ContainerTag("head", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node head(String className, Stream<Node> nodes) {
        return new ContainerTag("head", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node head(String className, Attributes attributes) {
        return new ContainerTag("head", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node head(String className, Attributes attributes, String text) {
        return new ContainerTag("head", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node head(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("head", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node head(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("head", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node header() {
        return new ContainerTag("header");
    }

    @NamedColor("html-dsl-tag")
    static Node header(String text) {
        return new ContainerTag("header", text);
    }

    @NamedColor("html-dsl-tag")
    static Node header(Node... nodes) {
        return new ContainerTag("header", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node header(Stream<Node> nodes) {
        return new ContainerTag("header", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node header(Attributes attributes) {
        return new ContainerTag("header", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node header(Attributes attributes, String text) {
        return new ContainerTag("header", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node header(Attributes attributes, Node... nodes) {
        return new ContainerTag("header", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node header(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("header", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node header(String className, String text) {
        return new ContainerTag("header", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node header(String className, Node... nodes) {
        return new ContainerTag("header", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node header(String className, Stream<Node> nodes) {
        return new ContainerTag("header", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node header(String className, Attributes attributes) {
        return new ContainerTag("header", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node header(String className, Attributes attributes, String text) {
        return new ContainerTag("header", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node header(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("header", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node header(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("header", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node html() {
        return new ContainerTag("html");
    }

    @NamedColor("html-dsl-tag")
    static Node html(String text) {
        return new ContainerTag("html", text);
    }

    @NamedColor("html-dsl-tag")
    static Node html(Node... nodes) {
        return new ContainerTag("html", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node html(Stream<Node> nodes) {
        return new ContainerTag("html", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node html(Attributes attributes) {
        return new ContainerTag("html", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node html(Attributes attributes, String text) {
        return new ContainerTag("html", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node html(Attributes attributes, Node... nodes) {
        return new ContainerTag("html", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node html(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("html", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node html(String className, String text) {
        return new ContainerTag("html", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node html(String className, Node... nodes) {
        return new ContainerTag("html", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node html(String className, Stream<Node> nodes) {
        return new ContainerTag("html", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node html(String className, Attributes attributes) {
        return new ContainerTag("html", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node html(String className, Attributes attributes, String text) {
        return new ContainerTag("html", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node html(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("html", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node html(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("html", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node i() {
        return new ContainerTag("i");
    }

    @NamedColor("html-dsl-tag")
    static Node i(String text) {
        return new ContainerTag("i", text);
    }

    @NamedColor("html-dsl-tag")
    static Node i(Node... nodes) {
        return new ContainerTag("i", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node i(Stream<Node> nodes) {
        return new ContainerTag("i", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node i(Attributes attributes) {
        return new ContainerTag("i", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node i(Attributes attributes, String text) {
        return new ContainerTag("i", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node i(Attributes attributes, Node... nodes) {
        return new ContainerTag("i", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node i(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("i", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node i(String className, String text) {
        return new ContainerTag("i", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node i(String className, Node... nodes) {
        return new ContainerTag("i", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node i(String className, Stream<Node> nodes) {
        return new ContainerTag("i", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node i(String className, Attributes attributes) {
        return new ContainerTag("i", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node i(String className, Attributes attributes, String text) {
        return new ContainerTag("i", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node i(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("i", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node i(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("i", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node iframe() {
        return new ContainerTag("iframe");
    }

    @NamedColor("html-dsl-tag")
    static Node iframe(String text) {
        return new ContainerTag("iframe", text);
    }

    @NamedColor("html-dsl-tag")
    static Node iframe(Node... nodes) {
        return new ContainerTag("iframe", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node iframe(Stream<Node> nodes) {
        return new ContainerTag("iframe", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node iframe(Attributes attributes) {
        return new ContainerTag("iframe", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node iframe(Attributes attributes, String text) {
        return new ContainerTag("iframe", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node iframe(Attributes attributes, Node... nodes) {
        return new ContainerTag("iframe", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node iframe(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("iframe", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node iframe(String className, String text) {
        return new ContainerTag("iframe", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node iframe(String className, Node... nodes) {
        return new ContainerTag("iframe", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node iframe(String className, Stream<Node> nodes) {
        return new ContainerTag("iframe", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node iframe(String className, Attributes attributes) {
        return new ContainerTag("iframe", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node iframe(String className, Attributes attributes, String text) {
        return new ContainerTag("iframe", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node iframe(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("iframe", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node iframe(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("iframe", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ins() {
        return new ContainerTag("ins");
    }

    @NamedColor("html-dsl-tag")
    static Node ins(String text) {
        return new ContainerTag("ins", text);
    }

    @NamedColor("html-dsl-tag")
    static Node ins(Node... nodes) {
        return new ContainerTag("ins", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ins(Stream<Node> nodes) {
        return new ContainerTag("ins", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ins(Attributes attributes) {
        return new ContainerTag("ins", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node ins(Attributes attributes, String text) {
        return new ContainerTag("ins", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node ins(Attributes attributes, Node... nodes) {
        return new ContainerTag("ins", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ins(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("ins", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ins(String className, String text) {
        return new ContainerTag("ins", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node ins(String className, Node... nodes) {
        return new ContainerTag("ins", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ins(String className, Stream<Node> nodes) {
        return new ContainerTag("ins", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ins(String className, Attributes attributes) {
        return new ContainerTag("ins", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node ins(String className, Attributes attributes, String text) {
        return new ContainerTag("ins", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node ins(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("ins", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ins(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("ins", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node kbd() {
        return new ContainerTag("kbd");
    }

    @NamedColor("html-dsl-tag")
    static Node kbd(String text) {
        return new ContainerTag("kbd", text);
    }

    @NamedColor("html-dsl-tag")
    static Node kbd(Node... nodes) {
        return new ContainerTag("kbd", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node kbd(Stream<Node> nodes) {
        return new ContainerTag("kbd", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node kbd(Attributes attributes) {
        return new ContainerTag("kbd", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node kbd(Attributes attributes, String text) {
        return new ContainerTag("kbd", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node kbd(Attributes attributes, Node... nodes) {
        return new ContainerTag("kbd", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node kbd(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("kbd", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node kbd(String className, String text) {
        return new ContainerTag("kbd", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node kbd(String className, Node... nodes) {
        return new ContainerTag("kbd", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node kbd(String className, Stream<Node> nodes) {
        return new ContainerTag("kbd", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node kbd(String className, Attributes attributes) {
        return new ContainerTag("kbd", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node kbd(String className, Attributes attributes, String text) {
        return new ContainerTag("kbd", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node kbd(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("kbd", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node kbd(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("kbd", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node label() {
        return new ContainerTag("label");
    }

    @NamedColor("html-dsl-tag")
    static Node label(String text) {
        return new ContainerTag("label", text);
    }

    @NamedColor("html-dsl-tag")
    static Node label(Node... nodes) {
        return new ContainerTag("label", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node label(Stream<Node> nodes) {
        return new ContainerTag("label", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node label(Attributes attributes) {
        return new ContainerTag("label", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node label(Attributes attributes, String text) {
        return new ContainerTag("label", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node label(Attributes attributes, Node... nodes) {
        return new ContainerTag("label", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node label(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("label", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node label(String className, String text) {
        return new ContainerTag("label", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node label(String className, Node... nodes) {
        return new ContainerTag("label", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node label(String className, Stream<Node> nodes) {
        return new ContainerTag("label", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node label(String className, Attributes attributes) {
        return new ContainerTag("label", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node label(String className, Attributes attributes, String text) {
        return new ContainerTag("label", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node label(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("label", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node label(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("label", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node legend() {
        return new ContainerTag("legend");
    }

    @NamedColor("html-dsl-tag")
    static Node legend(String text) {
        return new ContainerTag("legend", text);
    }

    @NamedColor("html-dsl-tag")
    static Node legend(Node... nodes) {
        return new ContainerTag("legend", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node legend(Stream<Node> nodes) {
        return new ContainerTag("legend", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node legend(Attributes attributes) {
        return new ContainerTag("legend", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node legend(Attributes attributes, String text) {
        return new ContainerTag("legend", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node legend(Attributes attributes, Node... nodes) {
        return new ContainerTag("legend", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node legend(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("legend", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node legend(String className, String text) {
        return new ContainerTag("legend", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node legend(String className, Node... nodes) {
        return new ContainerTag("legend", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node legend(String className, Stream<Node> nodes) {
        return new ContainerTag("legend", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node legend(String className, Attributes attributes) {
        return new ContainerTag("legend", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node legend(String className, Attributes attributes, String text) {
        return new ContainerTag("legend", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node legend(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("legend", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node legend(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("legend", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node li() {
        return new ContainerTag("li");
    }

    @NamedColor("html-dsl-tag")
    static Node li(String text) {
        return new ContainerTag("li", text);
    }

    @NamedColor("html-dsl-tag")
    static Node li(Node... nodes) {
        return new ContainerTag("li", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node li(Stream<Node> nodes) {
        return new ContainerTag("li", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node li(Attributes attributes) {
        return new ContainerTag("li", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node li(Attributes attributes, String text) {
        return new ContainerTag("li", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node li(Attributes attributes, Node... nodes) {
        return new ContainerTag("li", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node li(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("li", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node li(String className, String text) {
        return new ContainerTag("li", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node li(String className, Node... nodes) {
        return new ContainerTag("li", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node li(String className, Stream<Node> nodes) {
        return new ContainerTag("li", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node li(String className, Attributes attributes) {
        return new ContainerTag("li", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node li(String className, Attributes attributes, String text) {
        return new ContainerTag("li", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node li(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("li", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node li(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("li", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node generate() {
        return new ContainerTag("generate");
    }

    @NamedColor("html-dsl-tag")
    static Node generate(String text) {
        return new ContainerTag("generate", text);
    }

    @NamedColor("html-dsl-tag")
    static Node generate(Node... nodes) {
        return new ContainerTag("generate", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node generate(Stream<Node> nodes) {
        return new ContainerTag("generate", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node generate(Attributes attributes) {
        return new ContainerTag("generate", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node generate(Attributes attributes, String text) {
        return new ContainerTag("generate", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node generate(Attributes attributes, Node... nodes) {
        return new ContainerTag("generate", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node generate(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("generate", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node generate(String className, String text) {
        return new ContainerTag("generate", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node generate(String className, Node... nodes) {
        return new ContainerTag("generate", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node generate(String className, Stream<Node> nodes) {
        return new ContainerTag("generate", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node generate(String className, Attributes attributes) {
        return new ContainerTag("generate", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node generate(String className, Attributes attributes, String text) {
        return new ContainerTag("generate", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node generate(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("generate", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node generate(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("generate", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node main() {
        return new ContainerTag("main");
    }

    @NamedColor("html-dsl-tag")
    static Node main(String text) {
        return new ContainerTag("main", text);
    }

    @NamedColor("html-dsl-tag")
    static Node main(Node... nodes) {
        return new ContainerTag("main", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node main(Stream<Node> nodes) {
        return new ContainerTag("main", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node main(Attributes attributes) {
        return new ContainerTag("main", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node main(Attributes attributes, String text) {
        return new ContainerTag("main", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node main(Attributes attributes, Node... nodes) {
        return new ContainerTag("main", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node main(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("main", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node main(String className, String text) {
        return new ContainerTag("main", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node main(String className, Node... nodes) {
        return new ContainerTag("main", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node main(String className, Stream<Node> nodes) {
        return new ContainerTag("main", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node main(String className, Attributes attributes) {
        return new ContainerTag("main", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node main(String className, Attributes attributes, String text) {
        return new ContainerTag("main", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node main(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("main", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node main(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("main", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node map() {
        return new ContainerTag("map");
    }

    @NamedColor("html-dsl-tag")
    static Node map(String text) {
        return new ContainerTag("map", text);
    }

    @NamedColor("html-dsl-tag")
    static Node map(Node... nodes) {
        return new ContainerTag("map", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node map(Stream<Node> nodes) {
        return new ContainerTag("map", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node map(Attributes attributes) {
        return new ContainerTag("map", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node map(Attributes attributes, String text) {
        return new ContainerTag("map", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node map(Attributes attributes, Node... nodes) {
        return new ContainerTag("map", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node map(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("map", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node map(String className, String text) {
        return new ContainerTag("map", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node map(String className, Node... nodes) {
        return new ContainerTag("map", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node map(String className, Stream<Node> nodes) {
        return new ContainerTag("map", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node map(String className, Attributes attributes) {
        return new ContainerTag("map", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node map(String className, Attributes attributes, String text) {
        return new ContainerTag("map", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node map(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("map", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node map(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("map", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node mark() {
        return new ContainerTag("mark");
    }

    @NamedColor("html-dsl-tag")
    static Node mark(String text) {
        return new ContainerTag("mark", text);
    }

    @NamedColor("html-dsl-tag")
    static Node mark(Node... nodes) {
        return new ContainerTag("mark", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node mark(Stream<Node> nodes) {
        return new ContainerTag("mark", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node mark(Attributes attributes) {
        return new ContainerTag("mark", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node mark(Attributes attributes, String text) {
        return new ContainerTag("mark", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node mark(Attributes attributes, Node... nodes) {
        return new ContainerTag("mark", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node mark(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("mark", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node mark(String className, String text) {
        return new ContainerTag("mark", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node mark(String className, Node... nodes) {
        return new ContainerTag("mark", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node mark(String className, Stream<Node> nodes) {
        return new ContainerTag("mark", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node mark(String className, Attributes attributes) {
        return new ContainerTag("mark", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node mark(String className, Attributes attributes, String text) {
        return new ContainerTag("mark", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node mark(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("mark", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node mark(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("mark", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node menu() {
        return new ContainerTag("menu");
    }

    @NamedColor("html-dsl-tag")
    static Node menu(String text) {
        return new ContainerTag("menu", text);
    }

    @NamedColor("html-dsl-tag")
    static Node menu(Node... nodes) {
        return new ContainerTag("menu", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node menu(Stream<Node> nodes) {
        return new ContainerTag("menu", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node menu(Attributes attributes) {
        return new ContainerTag("menu", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node menu(Attributes attributes, String text) {
        return new ContainerTag("menu", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node menu(Attributes attributes, Node... nodes) {
        return new ContainerTag("menu", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node menu(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("menu", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node menu(String className, String text) {
        return new ContainerTag("menu", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node menu(String className, Node... nodes) {
        return new ContainerTag("menu", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node menu(String className, Stream<Node> nodes) {
        return new ContainerTag("menu", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node menu(String className, Attributes attributes) {
        return new ContainerTag("menu", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node menu(String className, Attributes attributes, String text) {
        return new ContainerTag("menu", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node menu(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("menu", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node menu(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("menu", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node menuitem() {
        return new ContainerTag("menuitem");
    }

    @NamedColor("html-dsl-tag")
    static Node menuitem(String text) {
        return new ContainerTag("menuitem", text);
    }

    @NamedColor("html-dsl-tag")
    static Node menuitem(Node... nodes) {
        return new ContainerTag("menuitem", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node menuitem(Stream<Node> nodes) {
        return new ContainerTag("menuitem", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node menuitem(Attributes attributes) {
        return new ContainerTag("menuitem", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node menuitem(Attributes attributes, String text) {
        return new ContainerTag("menuitem", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node menuitem(Attributes attributes, Node... nodes) {
        return new ContainerTag("menuitem", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node menuitem(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("menuitem", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node menuitem(String className, String text) {
        return new ContainerTag("menuitem", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node menuitem(String className, Node... nodes) {
        return new ContainerTag("menuitem", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node menuitem(String className, Stream<Node> nodes) {
        return new ContainerTag("menuitem", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node menuitem(String className, Attributes attributes) {
        return new ContainerTag("menuitem", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node menuitem(String className, Attributes attributes, String text) {
        return new ContainerTag("menuitem", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node menuitem(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("menuitem", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node menuitem(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("menuitem", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node meter() {
        return new ContainerTag("meter");
    }

    @NamedColor("html-dsl-tag")
    static Node meter(String text) {
        return new ContainerTag("meter", text);
    }

    @NamedColor("html-dsl-tag")
    static Node meter(Node... nodes) {
        return new ContainerTag("meter", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node meter(Stream<Node> nodes) {
        return new ContainerTag("meter", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node meter(Attributes attributes) {
        return new ContainerTag("meter", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node meter(Attributes attributes, String text) {
        return new ContainerTag("meter", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node meter(Attributes attributes, Node... nodes) {
        return new ContainerTag("meter", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node meter(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("meter", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node meter(String className, String text) {
        return new ContainerTag("meter", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node meter(String className, Node... nodes) {
        return new ContainerTag("meter", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node meter(String className, Stream<Node> nodes) {
        return new ContainerTag("meter", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node meter(String className, Attributes attributes) {
        return new ContainerTag("meter", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node meter(String className, Attributes attributes, String text) {
        return new ContainerTag("meter", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node meter(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("meter", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node meter(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("meter", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node nav() {
        return new ContainerTag("nav");
    }

    @NamedColor("html-dsl-tag")
    static Node nav(String text) {
        return new ContainerTag("nav", text);
    }

    @NamedColor("html-dsl-tag")
    static Node nav(Node... nodes) {
        return new ContainerTag("nav", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node nav(Stream<Node> nodes) {
        return new ContainerTag("nav", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node nav(Attributes attributes) {
        return new ContainerTag("nav", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node nav(Attributes attributes, String text) {
        return new ContainerTag("nav", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node nav(Attributes attributes, Node... nodes) {
        return new ContainerTag("nav", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node nav(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("nav", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node nav(String className, String text) {
        return new ContainerTag("nav", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node nav(String className, Node... nodes) {
        return new ContainerTag("nav", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node nav(String className, Stream<Node> nodes) {
        return new ContainerTag("nav", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node nav(String className, Attributes attributes) {
        return new ContainerTag("nav", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node nav(String className, Attributes attributes, String text) {
        return new ContainerTag("nav", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node nav(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("nav", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node nav(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("nav", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node noscript() {
        return new ContainerTag("noscript");
    }

    @NamedColor("html-dsl-tag")
    static Node noscript(String text) {
        return new ContainerTag("noscript", text);
    }

    @NamedColor("html-dsl-tag")
    static Node noscript(Node... nodes) {
        return new ContainerTag("noscript", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node noscript(Stream<Node> nodes) {
        return new ContainerTag("noscript", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node noscript(Attributes attributes) {
        return new ContainerTag("noscript", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node noscript(Attributes attributes, String text) {
        return new ContainerTag("noscript", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node noscript(Attributes attributes, Node... nodes) {
        return new ContainerTag("noscript", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node noscript(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("noscript", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node noscript(String className, String text) {
        return new ContainerTag("noscript", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node noscript(String className, Node... nodes) {
        return new ContainerTag("noscript", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node noscript(String className, Stream<Node> nodes) {
        return new ContainerTag("noscript", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node noscript(String className, Attributes attributes) {
        return new ContainerTag("noscript", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node noscript(String className, Attributes attributes, String text) {
        return new ContainerTag("noscript", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node noscript(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("noscript", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node noscript(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("noscript", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node object() {
        return new ContainerTag("object");
    }

    @NamedColor("html-dsl-tag")
    static Node object(String text) {
        return new ContainerTag("object", text);
    }

    @NamedColor("html-dsl-tag")
    static Node object(Node... nodes) {
        return new ContainerTag("object", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node object(Stream<Node> nodes) {
        return new ContainerTag("object", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node object(Attributes attributes) {
        return new ContainerTag("object", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node object(Attributes attributes, String text) {
        return new ContainerTag("object", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node object(Attributes attributes, Node... nodes) {
        return new ContainerTag("object", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node object(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("object", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node object(String className, String text) {
        return new ContainerTag("object", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node object(String className, Node... nodes) {
        return new ContainerTag("object", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node object(String className, Stream<Node> nodes) {
        return new ContainerTag("object", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node object(String className, Attributes attributes) {
        return new ContainerTag("object", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node object(String className, Attributes attributes, String text) {
        return new ContainerTag("object", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node object(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("object", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node object(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("object", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ol() {
        return new ContainerTag("ol");
    }

    @NamedColor("html-dsl-tag")
    static Node ol(String text) {
        return new ContainerTag("ol", text);
    }

    @NamedColor("html-dsl-tag")
    static Node ol(Node... nodes) {
        return new ContainerTag("ol", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ol(Stream<Node> nodes) {
        return new ContainerTag("ol", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ol(Attributes attributes) {
        return new ContainerTag("ol", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node ol(Attributes attributes, String text) {
        return new ContainerTag("ol", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node ol(Attributes attributes, Node... nodes) {
        return new ContainerTag("ol", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ol(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("ol", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ol(String className, String text) {
        return new ContainerTag("ol", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node ol(String className, Node... nodes) {
        return new ContainerTag("ol", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ol(String className, Stream<Node> nodes) {
        return new ContainerTag("ol", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ol(String className, Attributes attributes) {
        return new ContainerTag("ol", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node ol(String className, Attributes attributes, String text) {
        return new ContainerTag("ol", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node ol(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("ol", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ol(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("ol", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node optgroup() {
        return new ContainerTag("optgroup");
    }

    @NamedColor("html-dsl-tag")
    static Node optgroup(String text) {
        return new ContainerTag("optgroup", text);
    }

    @NamedColor("html-dsl-tag")
    static Node optgroup(Node... nodes) {
        return new ContainerTag("optgroup", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node optgroup(Stream<Node> nodes) {
        return new ContainerTag("optgroup", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node optgroup(Attributes attributes) {
        return new ContainerTag("optgroup", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node optgroup(Attributes attributes, String text) {
        return new ContainerTag("optgroup", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node optgroup(Attributes attributes, Node... nodes) {
        return new ContainerTag("optgroup", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node optgroup(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("optgroup", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node optgroup(String className, String text) {
        return new ContainerTag("optgroup", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node optgroup(String className, Node... nodes) {
        return new ContainerTag("optgroup", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node optgroup(String className, Stream<Node> nodes) {
        return new ContainerTag("optgroup", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node optgroup(String className, Attributes attributes) {
        return new ContainerTag("optgroup", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node optgroup(String className, Attributes attributes, String text) {
        return new ContainerTag("optgroup", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node optgroup(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("optgroup", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node optgroup(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("optgroup", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node option() {
        return new ContainerTag("option");
    }

    @NamedColor("html-dsl-tag")
    static Node option(String text) {
        return new ContainerTag("option", text);
    }

    @NamedColor("html-dsl-tag")
    static Node option(Node... nodes) {
        return new ContainerTag("option", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node option(Stream<Node> nodes) {
        return new ContainerTag("option", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node option(Attributes attributes) {
        return new ContainerTag("option", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node option(Attributes attributes, String text) {
        return new ContainerTag("option", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node option(Attributes attributes, Node... nodes) {
        return new ContainerTag("option", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node option(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("option", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node option(String className, String text) {
        return new ContainerTag("option", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node option(String className, Node... nodes) {
        return new ContainerTag("option", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node option(String className, Stream<Node> nodes) {
        return new ContainerTag("option", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node option(String className, Attributes attributes) {
        return new ContainerTag("option", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node option(String className, Attributes attributes, String text) {
        return new ContainerTag("option", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node option(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("option", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node option(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("option", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node output() {
        return new ContainerTag("output");
    }

    @NamedColor("html-dsl-tag")
    static Node output(String text) {
        return new ContainerTag("output", text);
    }

    @NamedColor("html-dsl-tag")
    static Node output(Node... nodes) {
        return new ContainerTag("output", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node output(Stream<Node> nodes) {
        return new ContainerTag("output", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node output(Attributes attributes) {
        return new ContainerTag("output", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node output(Attributes attributes, String text) {
        return new ContainerTag("output", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node output(Attributes attributes, Node... nodes) {
        return new ContainerTag("output", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node output(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("output", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node output(String className, String text) {
        return new ContainerTag("output", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node output(String className, Node... nodes) {
        return new ContainerTag("output", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node output(String className, Stream<Node> nodes) {
        return new ContainerTag("output", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node output(String className, Attributes attributes) {
        return new ContainerTag("output", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node output(String className, Attributes attributes, String text) {
        return new ContainerTag("output", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node output(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("output", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node output(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("output", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node p() {
        return new ContainerTag("p");
    }

    @NamedColor("html-dsl-tag")
    static Node p(String text) {
        return new ContainerTag("p", text);
    }

    @NamedColor("html-dsl-tag")
    static Node p(Node... nodes) {
        return new ContainerTag("p", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node p(Stream<Node> nodes) {
        return new ContainerTag("p", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node p(Attributes attributes) {
        return new ContainerTag("p", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node p(Attributes attributes, String text) {
        return new ContainerTag("p", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node p(Attributes attributes, Node... nodes) {
        return new ContainerTag("p", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node p(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("p", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node p(String className, String text) {
        return new ContainerTag("p", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node p(String className, Node... nodes) {
        return new ContainerTag("p", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node p(String className, Stream<Node> nodes) {
        return new ContainerTag("p", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node p(String className, Attributes attributes) {
        return new ContainerTag("p", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node p(String className, Attributes attributes, String text) {
        return new ContainerTag("p", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node p(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("p", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node p(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("p", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node picture() {
        return new ContainerTag("picture");
    }

    @NamedColor("html-dsl-tag")
    static Node picture(String text) {
        return new ContainerTag("picture", text);
    }

    @NamedColor("html-dsl-tag")
    static Node picture(Node... nodes) {
        return new ContainerTag("picture", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node picture(Stream<Node> nodes) {
        return new ContainerTag("picture", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node picture(Attributes attributes) {
        return new ContainerTag("picture", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node picture(Attributes attributes, String text) {
        return new ContainerTag("picture", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node picture(Attributes attributes, Node... nodes) {
        return new ContainerTag("picture", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node picture(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("picture", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node picture(String className, String text) {
        return new ContainerTag("picture", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node picture(String className, Node... nodes) {
        return new ContainerTag("picture", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node picture(String className, Stream<Node> nodes) {
        return new ContainerTag("picture", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node picture(String className, Attributes attributes) {
        return new ContainerTag("picture", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node picture(String className, Attributes attributes, String text) {
        return new ContainerTag("picture", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node picture(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("picture", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node picture(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("picture", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node pre() {
        return new ContainerTag("pre");
    }

    @NamedColor("html-dsl-tag")
    static Node pre(String text) {
        return new ContainerTag("pre", text);
    }

    @NamedColor("html-dsl-tag")
    static Node pre(Node... nodes) {
        return new ContainerTag("pre", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node pre(Stream<Node> nodes) {
        return new ContainerTag("pre", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node pre(Attributes attributes) {
        return new ContainerTag("pre", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node pre(Attributes attributes, String text) {
        return new ContainerTag("pre", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node pre(Attributes attributes, Node... nodes) {
        return new ContainerTag("pre", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node pre(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("pre", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node pre(String className, String text) {
        return new ContainerTag("pre", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node pre(String className, Node... nodes) {
        return new ContainerTag("pre", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node pre(String className, Stream<Node> nodes) {
        return new ContainerTag("pre", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node pre(String className, Attributes attributes) {
        return new ContainerTag("pre", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node pre(String className, Attributes attributes, String text) {
        return new ContainerTag("pre", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node pre(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("pre", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node pre(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("pre", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node progress() {
        return new ContainerTag("progress");
    }

    @NamedColor("html-dsl-tag")
    static Node progress(String text) {
        return new ContainerTag("progress", text);
    }

    @NamedColor("html-dsl-tag")
    static Node progress(Node... nodes) {
        return new ContainerTag("progress", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node progress(Stream<Node> nodes) {
        return new ContainerTag("progress", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node progress(Attributes attributes) {
        return new ContainerTag("progress", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node progress(Attributes attributes, String text) {
        return new ContainerTag("progress", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node progress(Attributes attributes, Node... nodes) {
        return new ContainerTag("progress", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node progress(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("progress", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node progress(String className, String text) {
        return new ContainerTag("progress", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node progress(String className, Node... nodes) {
        return new ContainerTag("progress", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node progress(String className, Stream<Node> nodes) {
        return new ContainerTag("progress", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node progress(String className, Attributes attributes) {
        return new ContainerTag("progress", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node progress(String className, Attributes attributes, String text) {
        return new ContainerTag("progress", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node progress(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("progress", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node progress(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("progress", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node q() {
        return new ContainerTag("q");
    }

    @NamedColor("html-dsl-tag")
    static Node q(String text) {
        return new ContainerTag("q", text);
    }

    @NamedColor("html-dsl-tag")
    static Node q(Node... nodes) {
        return new ContainerTag("q", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node q(Stream<Node> nodes) {
        return new ContainerTag("q", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node q(Attributes attributes) {
        return new ContainerTag("q", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node q(Attributes attributes, String text) {
        return new ContainerTag("q", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node q(Attributes attributes, Node... nodes) {
        return new ContainerTag("q", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node q(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("q", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node q(String className, String text) {
        return new ContainerTag("q", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node q(String className, Node... nodes) {
        return new ContainerTag("q", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node q(String className, Stream<Node> nodes) {
        return new ContainerTag("q", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node q(String className, Attributes attributes) {
        return new ContainerTag("q", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node q(String className, Attributes attributes, String text) {
        return new ContainerTag("q", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node q(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("q", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node q(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("q", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node rp() {
        return new ContainerTag("rp");
    }

    @NamedColor("html-dsl-tag")
    static Node rp(String text) {
        return new ContainerTag("rp", text);
    }

    @NamedColor("html-dsl-tag")
    static Node rp(Node... nodes) {
        return new ContainerTag("rp", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node rp(Stream<Node> nodes) {
        return new ContainerTag("rp", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node rp(Attributes attributes) {
        return new ContainerTag("rp", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node rp(Attributes attributes, String text) {
        return new ContainerTag("rp", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node rp(Attributes attributes, Node... nodes) {
        return new ContainerTag("rp", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node rp(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("rp", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node rp(String className, String text) {
        return new ContainerTag("rp", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node rp(String className, Node... nodes) {
        return new ContainerTag("rp", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node rp(String className, Stream<Node> nodes) {
        return new ContainerTag("rp", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node rp(String className, Attributes attributes) {
        return new ContainerTag("rp", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node rp(String className, Attributes attributes, String text) {
        return new ContainerTag("rp", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node rp(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("rp", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node rp(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("rp", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node rt() {
        return new ContainerTag("rt");
    }

    @NamedColor("html-dsl-tag")
    static Node rt(String text) {
        return new ContainerTag("rt", text);
    }

    @NamedColor("html-dsl-tag")
    static Node rt(Node... nodes) {
        return new ContainerTag("rt", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node rt(Stream<Node> nodes) {
        return new ContainerTag("rt", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node rt(Attributes attributes) {
        return new ContainerTag("rt", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node rt(Attributes attributes, String text) {
        return new ContainerTag("rt", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node rt(Attributes attributes, Node... nodes) {
        return new ContainerTag("rt", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node rt(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("rt", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node rt(String className, String text) {
        return new ContainerTag("rt", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node rt(String className, Node... nodes) {
        return new ContainerTag("rt", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node rt(String className, Stream<Node> nodes) {
        return new ContainerTag("rt", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node rt(String className, Attributes attributes) {
        return new ContainerTag("rt", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node rt(String className, Attributes attributes, String text) {
        return new ContainerTag("rt", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node rt(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("rt", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node rt(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("rt", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ruby() {
        return new ContainerTag("ruby");
    }

    @NamedColor("html-dsl-tag")
    static Node ruby(String text) {
        return new ContainerTag("ruby", text);
    }

    @NamedColor("html-dsl-tag")
    static Node ruby(Node... nodes) {
        return new ContainerTag("ruby", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ruby(Stream<Node> nodes) {
        return new ContainerTag("ruby", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ruby(Attributes attributes) {
        return new ContainerTag("ruby", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node ruby(Attributes attributes, String text) {
        return new ContainerTag("ruby", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node ruby(Attributes attributes, Node... nodes) {
        return new ContainerTag("ruby", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ruby(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("ruby", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ruby(String className, String text) {
        return new ContainerTag("ruby", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node ruby(String className, Node... nodes) {
        return new ContainerTag("ruby", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ruby(String className, Stream<Node> nodes) {
        return new ContainerTag("ruby", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ruby(String className, Attributes attributes) {
        return new ContainerTag("ruby", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node ruby(String className, Attributes attributes, String text) {
        return new ContainerTag("ruby", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node ruby(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("ruby", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ruby(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("ruby", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node s() {
        return new ContainerTag("s");
    }

    @NamedColor("html-dsl-tag")
    static Node s(String text) {
        return new ContainerTag("s", text);
    }

    @NamedColor("html-dsl-tag")
    static Node s(Node... nodes) {
        return new ContainerTag("s", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node s(Stream<Node> nodes) {
        return new ContainerTag("s", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node s(Attributes attributes) {
        return new ContainerTag("s", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node s(Attributes attributes, String text) {
        return new ContainerTag("s", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node s(Attributes attributes, Node... nodes) {
        return new ContainerTag("s", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node s(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("s", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node s(String className, String text) {
        return new ContainerTag("s", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node s(String className, Node... nodes) {
        return new ContainerTag("s", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node s(String className, Stream<Node> nodes) {
        return new ContainerTag("s", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node s(String className, Attributes attributes) {
        return new ContainerTag("s", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node s(String className, Attributes attributes, String text) {
        return new ContainerTag("s", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node s(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("s", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node s(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("s", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node samp() {
        return new ContainerTag("samp");
    }

    @NamedColor("html-dsl-tag")
    static Node samp(String text) {
        return new ContainerTag("samp", text);
    }

    @NamedColor("html-dsl-tag")
    static Node samp(Node... nodes) {
        return new ContainerTag("samp", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node samp(Stream<Node> nodes) {
        return new ContainerTag("samp", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node samp(Attributes attributes) {
        return new ContainerTag("samp", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node samp(Attributes attributes, String text) {
        return new ContainerTag("samp", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node samp(Attributes attributes, Node... nodes) {
        return new ContainerTag("samp", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node samp(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("samp", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node samp(String className, String text) {
        return new ContainerTag("samp", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node samp(String className, Node... nodes) {
        return new ContainerTag("samp", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node samp(String className, Stream<Node> nodes) {
        return new ContainerTag("samp", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node samp(String className, Attributes attributes) {
        return new ContainerTag("samp", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node samp(String className, Attributes attributes, String text) {
        return new ContainerTag("samp", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node samp(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("samp", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node samp(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("samp", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node script() {
        return new ContainerTag("script");
    }

    @NamedColor("html-dsl-tag")
    static Node script(String text) {
        return new ContainerTag("script", text);
    }

    @NamedColor("html-dsl-tag")
    static Node script(Node... nodes) {
        return new ContainerTag("script", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node script(Stream<Node> nodes) {
        return new ContainerTag("script", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node script(Attributes attributes) {
        return new ContainerTag("script", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node script(Attributes attributes, String text) {
        return new ContainerTag("script", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node script(Attributes attributes, Node... nodes) {
        return new ContainerTag("script", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node script(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("script", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node script(String className, String text) {
        return new ContainerTag("script", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node script(String className, Node... nodes) {
        return new ContainerTag("script", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node script(String className, Stream<Node> nodes) {
        return new ContainerTag("script", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node script(String className, Attributes attributes) {
        return new ContainerTag("script", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node script(String className, Attributes attributes, String text) {
        return new ContainerTag("script", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node script(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("script", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node script(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("script", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node section() {
        return new ContainerTag("section");
    }

    @NamedColor("html-dsl-tag")
    static Node section(String text) {
        return new ContainerTag("section", text);
    }

    @NamedColor("html-dsl-tag")
    static Node section(Node... nodes) {
        return new ContainerTag("section", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node section(Stream<Node> nodes) {
        return new ContainerTag("section", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node section(Attributes attributes) {
        return new ContainerTag("section", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node section(Attributes attributes, String text) {
        return new ContainerTag("section", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node section(Attributes attributes, Node... nodes) {
        return new ContainerTag("section", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node section(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("section", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node section(String className, String text) {
        return new ContainerTag("section", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node section(String className, Node... nodes) {
        return new ContainerTag("section", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node section(String className, Stream<Node> nodes) {
        return new ContainerTag("section", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node section(String className, Attributes attributes) {
        return new ContainerTag("section", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node section(String className, Attributes attributes, String text) {
        return new ContainerTag("section", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node section(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("section", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node section(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("section", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node select() {
        return new ContainerTag("select");
    }

    @NamedColor("html-dsl-tag")
    static Node select(String text) {
        return new ContainerTag("select", text);
    }

    @NamedColor("html-dsl-tag")
    static Node select(Node... nodes) {
        return new ContainerTag("select", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node select(Stream<Node> nodes) {
        return new ContainerTag("select", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node select(Attributes attributes) {
        return new ContainerTag("select", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node select(Attributes attributes, String text) {
        return new ContainerTag("select", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node select(Attributes attributes, Node... nodes) {
        return new ContainerTag("select", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node select(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("select", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node select(String className, String text) {
        return new ContainerTag("select", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node select(String className, Node... nodes) {
        return new ContainerTag("select", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node select(String className, Stream<Node> nodes) {
        return new ContainerTag("select", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node select(String className, Attributes attributes) {
        return new ContainerTag("select", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node select(String className, Attributes attributes, String text) {
        return new ContainerTag("select", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node select(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("select", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node select(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("select", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node small() {
        return new ContainerTag("small");
    }

    @NamedColor("html-dsl-tag")
    static Node small(String text) {
        return new ContainerTag("small", text);
    }

    @NamedColor("html-dsl-tag")
    static Node small(Node... nodes) {
        return new ContainerTag("small", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node small(Stream<Node> nodes) {
        return new ContainerTag("small", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node small(Attributes attributes) {
        return new ContainerTag("small", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node small(Attributes attributes, String text) {
        return new ContainerTag("small", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node small(Attributes attributes, Node... nodes) {
        return new ContainerTag("small", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node small(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("small", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node small(String className, String text) {
        return new ContainerTag("small", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node small(String className, Node... nodes) {
        return new ContainerTag("small", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node small(String className, Stream<Node> nodes) {
        return new ContainerTag("small", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node small(String className, Attributes attributes) {
        return new ContainerTag("small", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node small(String className, Attributes attributes, String text) {
        return new ContainerTag("small", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node small(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("small", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node small(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("small", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node span() {
        return new ContainerTag("span");
    }

    @NamedColor("html-dsl-tag")
    static Node span(String text) {
        return new ContainerTag("span", text);
    }

    @NamedColor("html-dsl-tag")
    static Node span(Node... nodes) {
        return new ContainerTag("span", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node span(Stream<Node> nodes) {
        return new ContainerTag("span", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node span(Attributes attributes) {
        return new ContainerTag("span", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node span(Attributes attributes, String text) {
        return new ContainerTag("span", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node span(Attributes attributes, Node... nodes) {
        return new ContainerTag("span", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node span(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("span", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node span(String className, String text) {
        return new ContainerTag("span", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node span(String className, Node... nodes) {
        return new ContainerTag("span", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node span(String className, Stream<Node> nodes) {
        return new ContainerTag("span", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node span(String className, Attributes attributes) {
        return new ContainerTag("span", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node span(String className, Attributes attributes, String text) {
        return new ContainerTag("span", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node span(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("span", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node span(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("span", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node strong() {
        return new ContainerTag("strong");
    }

    @NamedColor("html-dsl-tag")
    static Node strong(String text) {
        return new ContainerTag("strong", text);
    }

    @NamedColor("html-dsl-tag")
    static Node strong(Node... nodes) {
        return new ContainerTag("strong", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node strong(Stream<Node> nodes) {
        return new ContainerTag("strong", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node strong(Attributes attributes) {
        return new ContainerTag("strong", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node strong(Attributes attributes, String text) {
        return new ContainerTag("strong", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node strong(Attributes attributes, Node... nodes) {
        return new ContainerTag("strong", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node strong(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("strong", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node strong(String className, String text) {
        return new ContainerTag("strong", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node strong(String className, Node... nodes) {
        return new ContainerTag("strong", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node strong(String className, Stream<Node> nodes) {
        return new ContainerTag("strong", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node strong(String className, Attributes attributes) {
        return new ContainerTag("strong", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node strong(String className, Attributes attributes, String text) {
        return new ContainerTag("strong", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node strong(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("strong", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node strong(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("strong", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node style() {
        return new ContainerTag("style");
    }

    @NamedColor("html-dsl-tag")
    static Node style(String text) {
        return new ContainerTag("style", text);
    }

    @NamedColor("html-dsl-tag")
    static Node style(Node... nodes) {
        return new ContainerTag("style", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node style(Stream<Node> nodes) {
        return new ContainerTag("style", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node style(Attributes attributes) {
        return new ContainerTag("style", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node style(Attributes attributes, String text) {
        return new ContainerTag("style", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node style(Attributes attributes, Node... nodes) {
        return new ContainerTag("style", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node style(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("style", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node style(String className, String text) {
        return new ContainerTag("style", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node style(String className, Node... nodes) {
        return new ContainerTag("style", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node style(String className, Stream<Node> nodes) {
        return new ContainerTag("style", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node style(String className, Attributes attributes) {
        return new ContainerTag("style", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node style(String className, Attributes attributes, String text) {
        return new ContainerTag("style", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node style(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("style", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node style(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("style", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node sub() {
        return new ContainerTag("sub");
    }

    @NamedColor("html-dsl-tag")
    static Node sub(String text) {
        return new ContainerTag("sub", text);
    }

    @NamedColor("html-dsl-tag")
    static Node sub(Node... nodes) {
        return new ContainerTag("sub", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node sub(Stream<Node> nodes) {
        return new ContainerTag("sub", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node sub(Attributes attributes) {
        return new ContainerTag("sub", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node sub(Attributes attributes, String text) {
        return new ContainerTag("sub", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node sub(Attributes attributes, Node... nodes) {
        return new ContainerTag("sub", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node sub(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("sub", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node sub(String className, String text) {
        return new ContainerTag("sub", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node sub(String className, Node... nodes) {
        return new ContainerTag("sub", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node sub(String className, Stream<Node> nodes) {
        return new ContainerTag("sub", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node sub(String className, Attributes attributes) {
        return new ContainerTag("sub", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node sub(String className, Attributes attributes, String text) {
        return new ContainerTag("sub", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node sub(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("sub", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node sub(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("sub", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node summary() {
        return new ContainerTag("summary");
    }

    @NamedColor("html-dsl-tag")
    static Node summary(String text) {
        return new ContainerTag("summary", text);
    }

    @NamedColor("html-dsl-tag")
    static Node summary(Node... nodes) {
        return new ContainerTag("summary", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node summary(Stream<Node> nodes) {
        return new ContainerTag("summary", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node summary(Attributes attributes) {
        return new ContainerTag("summary", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node summary(Attributes attributes, String text) {
        return new ContainerTag("summary", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node summary(Attributes attributes, Node... nodes) {
        return new ContainerTag("summary", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node summary(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("summary", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node summary(String className, String text) {
        return new ContainerTag("summary", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node summary(String className, Node... nodes) {
        return new ContainerTag("summary", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node summary(String className, Stream<Node> nodes) {
        return new ContainerTag("summary", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node summary(String className, Attributes attributes) {
        return new ContainerTag("summary", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node summary(String className, Attributes attributes, String text) {
        return new ContainerTag("summary", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node summary(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("summary", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node summary(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("summary", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node sup() {
        return new ContainerTag("sup");
    }

    @NamedColor("html-dsl-tag")
    static Node sup(String text) {
        return new ContainerTag("sup", text);
    }

    @NamedColor("html-dsl-tag")
    static Node sup(Node... nodes) {
        return new ContainerTag("sup", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node sup(Stream<Node> nodes) {
        return new ContainerTag("sup", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node sup(Attributes attributes) {
        return new ContainerTag("sup", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node sup(Attributes attributes, String text) {
        return new ContainerTag("sup", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node sup(Attributes attributes, Node... nodes) {
        return new ContainerTag("sup", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node sup(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("sup", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node sup(String className, String text) {
        return new ContainerTag("sup", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node sup(String className, Node... nodes) {
        return new ContainerTag("sup", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node sup(String className, Stream<Node> nodes) {
        return new ContainerTag("sup", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node sup(String className, Attributes attributes) {
        return new ContainerTag("sup", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node sup(String className, Attributes attributes, String text) {
        return new ContainerTag("sup", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node sup(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("sup", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node sup(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("sup", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node table() {
        return new ContainerTag("table");
    }

    @NamedColor("html-dsl-tag")
    static Node table(String text) {
        return new ContainerTag("table", text);
    }

    @NamedColor("html-dsl-tag")
    static Node table(Node... nodes) {
        return new ContainerTag("table", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node table(Stream<Node> nodes) {
        return new ContainerTag("table", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node table(Attributes attributes) {
        return new ContainerTag("table", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node table(Attributes attributes, String text) {
        return new ContainerTag("table", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node table(Attributes attributes, Node... nodes) {
        return new ContainerTag("table", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node table(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("table", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node table(String className, String text) {
        return new ContainerTag("table", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node table(String className, Node... nodes) {
        return new ContainerTag("table", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node table(String className, Stream<Node> nodes) {
        return new ContainerTag("table", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node table(String className, Attributes attributes) {
        return new ContainerTag("table", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node table(String className, Attributes attributes, String text) {
        return new ContainerTag("table", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node table(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("table", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node table(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("table", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tbody() {
        return new ContainerTag("tbody");
    }

    @NamedColor("html-dsl-tag")
    static Node tbody(String text) {
        return new ContainerTag("tbody", text);
    }

    @NamedColor("html-dsl-tag")
    static Node tbody(Node... nodes) {
        return new ContainerTag("tbody", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tbody(Stream<Node> nodes) {
        return new ContainerTag("tbody", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tbody(Attributes attributes) {
        return new ContainerTag("tbody", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node tbody(Attributes attributes, String text) {
        return new ContainerTag("tbody", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node tbody(Attributes attributes, Node... nodes) {
        return new ContainerTag("tbody", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tbody(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("tbody", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tbody(String className, String text) {
        return new ContainerTag("tbody", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node tbody(String className, Node... nodes) {
        return new ContainerTag("tbody", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tbody(String className, Stream<Node> nodes) {
        return new ContainerTag("tbody", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tbody(String className, Attributes attributes) {
        return new ContainerTag("tbody", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node tbody(String className, Attributes attributes, String text) {
        return new ContainerTag("tbody", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node tbody(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("tbody", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tbody(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("tbody", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node td() {
        return new ContainerTag("td");
    }

    @NamedColor("html-dsl-tag")
    static Node td(String text) {
        return new ContainerTag("td", text);
    }

    @NamedColor("html-dsl-tag")
    static Node td(Node... nodes) {
        return new ContainerTag("td", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node td(Stream<Node> nodes) {
        return new ContainerTag("td", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node td(Attributes attributes) {
        return new ContainerTag("td", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node td(Attributes attributes, String text) {
        return new ContainerTag("td", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node td(Attributes attributes, Node... nodes) {
        return new ContainerTag("td", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node td(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("td", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node td(String className, String text) {
        return new ContainerTag("td", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node td(String className, Node... nodes) {
        return new ContainerTag("td", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node td(String className, Stream<Node> nodes) {
        return new ContainerTag("td", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node td(String className, Attributes attributes) {
        return new ContainerTag("td", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node td(String className, Attributes attributes, String text) {
        return new ContainerTag("td", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node td(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("td", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node td(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("td", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node textarea() {
        return new ContainerTag("textarea");
    }

    @NamedColor("html-dsl-tag")
    static Node textarea(String text) {
        return new ContainerTag("textarea", text);
    }

    @NamedColor("html-dsl-tag")
    static Node textarea(Node... nodes) {
        return new ContainerTag("textarea", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node textarea(Stream<Node> nodes) {
        return new ContainerTag("textarea", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node textarea(Attributes attributes) {
        return new ContainerTag("textarea", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node textarea(Attributes attributes, String text) {
        return new ContainerTag("textarea", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node textarea(Attributes attributes, Node... nodes) {
        return new ContainerTag("textarea", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node textarea(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("textarea", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node textarea(String className, String text) {
        return new ContainerTag("textarea", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node textarea(String className, Node... nodes) {
        return new ContainerTag("textarea", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node textarea(String className, Stream<Node> nodes) {
        return new ContainerTag("textarea", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node textarea(String className, Attributes attributes) {
        return new ContainerTag("textarea", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node textarea(String className, Attributes attributes, String text) {
        return new ContainerTag("textarea", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node textarea(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("textarea", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node textarea(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("textarea", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tfoot() {
        return new ContainerTag("tfoot");
    }

    @NamedColor("html-dsl-tag")
    static Node tfoot(String text) {
        return new ContainerTag("tfoot", text);
    }

    @NamedColor("html-dsl-tag")
    static Node tfoot(Node... nodes) {
        return new ContainerTag("tfoot", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tfoot(Stream<Node> nodes) {
        return new ContainerTag("tfoot", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tfoot(Attributes attributes) {
        return new ContainerTag("tfoot", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node tfoot(Attributes attributes, String text) {
        return new ContainerTag("tfoot", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node tfoot(Attributes attributes, Node... nodes) {
        return new ContainerTag("tfoot", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tfoot(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("tfoot", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tfoot(String className, String text) {
        return new ContainerTag("tfoot", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node tfoot(String className, Node... nodes) {
        return new ContainerTag("tfoot", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tfoot(String className, Stream<Node> nodes) {
        return new ContainerTag("tfoot", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tfoot(String className, Attributes attributes) {
        return new ContainerTag("tfoot", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node tfoot(String className, Attributes attributes, String text) {
        return new ContainerTag("tfoot", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node tfoot(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("tfoot", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tfoot(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("tfoot", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node th() {
        return new ContainerTag("th");
    }

    @NamedColor("html-dsl-tag")
    static Node th(String text) {
        return new ContainerTag("th", text);
    }

    @NamedColor("html-dsl-tag")
    static Node th(Node... nodes) {
        return new ContainerTag("th", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node th(Stream<Node> nodes) {
        return new ContainerTag("th", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node th(Attributes attributes) {
        return new ContainerTag("th", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node th(Attributes attributes, String text) {
        return new ContainerTag("th", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node th(Attributes attributes, Node... nodes) {
        return new ContainerTag("th", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node th(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("th", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node th(String className, String text) {
        return new ContainerTag("th", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node th(String className, Node... nodes) {
        return new ContainerTag("th", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node th(String className, Stream<Node> nodes) {
        return new ContainerTag("th", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node th(String className, Attributes attributes) {
        return new ContainerTag("th", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node th(String className, Attributes attributes, String text) {
        return new ContainerTag("th", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node th(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("th", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node th(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("th", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node thead() {
        return new ContainerTag("thead");
    }

    @NamedColor("html-dsl-tag")
    static Node thead(String text) {
        return new ContainerTag("thead", text);
    }

    @NamedColor("html-dsl-tag")
    static Node thead(Node... nodes) {
        return new ContainerTag("thead", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node thead(Stream<Node> nodes) {
        return new ContainerTag("thead", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node thead(Attributes attributes) {
        return new ContainerTag("thead", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node thead(Attributes attributes, String text) {
        return new ContainerTag("thead", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node thead(Attributes attributes, Node... nodes) {
        return new ContainerTag("thead", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node thead(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("thead", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node thead(String className, String text) {
        return new ContainerTag("thead", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node thead(String className, Node... nodes) {
        return new ContainerTag("thead", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node thead(String className, Stream<Node> nodes) {
        return new ContainerTag("thead", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node thead(String className, Attributes attributes) {
        return new ContainerTag("thead", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node thead(String className, Attributes attributes, String text) {
        return new ContainerTag("thead", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node thead(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("thead", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node thead(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("thead", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node time() {
        return new ContainerTag("time");
    }

    @NamedColor("html-dsl-tag")
    static Node time(String text) {
        return new ContainerTag("time", text);
    }

    @NamedColor("html-dsl-tag")
    static Node time(Node... nodes) {
        return new ContainerTag("time", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node time(Stream<Node> nodes) {
        return new ContainerTag("time", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node time(Attributes attributes) {
        return new ContainerTag("time", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node time(Attributes attributes, String text) {
        return new ContainerTag("time", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node time(Attributes attributes, Node... nodes) {
        return new ContainerTag("time", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node time(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("time", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node time(String className, String text) {
        return new ContainerTag("time", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node time(String className, Node... nodes) {
        return new ContainerTag("time", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node time(String className, Stream<Node> nodes) {
        return new ContainerTag("time", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node time(String className, Attributes attributes) {
        return new ContainerTag("time", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node time(String className, Attributes attributes, String text) {
        return new ContainerTag("time", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node time(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("time", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node time(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("time", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node title() {
        return new ContainerTag("title");
    }

    @NamedColor("html-dsl-tag")
    static Node title(String text) {
        return new ContainerTag("title", text);
    }

    @NamedColor("html-dsl-tag")
    static Node title(Node... nodes) {
        return new ContainerTag("title", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node title(Stream<Node> nodes) {
        return new ContainerTag("title", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node title(Attributes attributes) {
        return new ContainerTag("title", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node title(Attributes attributes, String text) {
        return new ContainerTag("title", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node title(Attributes attributes, Node... nodes) {
        return new ContainerTag("title", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node title(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("title", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node title(String className, String text) {
        return new ContainerTag("title", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node title(String className, Node... nodes) {
        return new ContainerTag("title", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node title(String className, Stream<Node> nodes) {
        return new ContainerTag("title", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node title(String className, Attributes attributes) {
        return new ContainerTag("title", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node title(String className, Attributes attributes, String text) {
        return new ContainerTag("title", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node title(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("title", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node title(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("title", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tr() {
        return new ContainerTag("tr");
    }

    @NamedColor("html-dsl-tag")
    static Node tr(String text) {
        return new ContainerTag("tr", text);
    }

    @NamedColor("html-dsl-tag")
    static Node tr(Node... nodes) {
        return new ContainerTag("tr", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tr(Stream<Node> nodes) {
        return new ContainerTag("tr", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tr(Attributes attributes) {
        return new ContainerTag("tr", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node tr(Attributes attributes, String text) {
        return new ContainerTag("tr", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node tr(Attributes attributes, Node... nodes) {
        return new ContainerTag("tr", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tr(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("tr", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tr(String className, String text) {
        return new ContainerTag("tr", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node tr(String className, Node... nodes) {
        return new ContainerTag("tr", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tr(String className, Stream<Node> nodes) {
        return new ContainerTag("tr", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tr(String className, Attributes attributes) {
        return new ContainerTag("tr", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node tr(String className, Attributes attributes, String text) {
        return new ContainerTag("tr", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node tr(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("tr", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node tr(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("tr", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node u() {
        return new ContainerTag("u");
    }

    @NamedColor("html-dsl-tag")
    static Node u(String text) {
        return new ContainerTag("u", text);
    }

    @NamedColor("html-dsl-tag")
    static Node u(Node... nodes) {
        return new ContainerTag("u", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node u(Stream<Node> nodes) {
        return new ContainerTag("u", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node u(Attributes attributes) {
        return new ContainerTag("u", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node u(Attributes attributes, String text) {
        return new ContainerTag("u", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node u(Attributes attributes, Node... nodes) {
        return new ContainerTag("u", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node u(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("u", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node u(String className, String text) {
        return new ContainerTag("u", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node u(String className, Node... nodes) {
        return new ContainerTag("u", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node u(String className, Stream<Node> nodes) {
        return new ContainerTag("u", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node u(String className, Attributes attributes) {
        return new ContainerTag("u", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node u(String className, Attributes attributes, String text) {
        return new ContainerTag("u", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node u(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("u", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node u(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("u", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ul() {
        return new ContainerTag("ul");
    }

    @NamedColor("html-dsl-tag")
    static Node ul(String text) {
        return new ContainerTag("ul", text);
    }

    @NamedColor("html-dsl-tag")
    static Node ul(Node... nodes) {
        return new ContainerTag("ul", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ul(Stream<Node> nodes) {
        return new ContainerTag("ul", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ul(Attributes attributes) {
        return new ContainerTag("ul", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node ul(Attributes attributes, String text) {
        return new ContainerTag("ul", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node ul(Attributes attributes, Node... nodes) {
        return new ContainerTag("ul", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ul(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("ul", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ul(String className, String text) {
        return new ContainerTag("ul", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node ul(String className, Node... nodes) {
        return new ContainerTag("ul", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ul(String className, Stream<Node> nodes) {
        return new ContainerTag("ul", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ul(String className, Attributes attributes) {
        return new ContainerTag("ul", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node ul(String className, Attributes attributes, String text) {
        return new ContainerTag("ul", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node ul(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("ul", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node ul(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("ul", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node var() {
        return new ContainerTag("var");
    }

    @NamedColor("html-dsl-tag")
    static Node var(String text) {
        return new ContainerTag("var", text);
    }

    @NamedColor("html-dsl-tag")
    static Node var(Node... nodes) {
        return new ContainerTag("var", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node var(Stream<Node> nodes) {
        return new ContainerTag("var", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node var(Attributes attributes) {
        return new ContainerTag("var", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node var(Attributes attributes, String text) {
        return new ContainerTag("var", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node var(Attributes attributes, Node... nodes) {
        return new ContainerTag("var", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node var(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("var", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node var(String className, String text) {
        return new ContainerTag("var", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node var(String className, Node... nodes) {
        return new ContainerTag("var", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node var(String className, Stream<Node> nodes) {
        return new ContainerTag("var", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node var(String className, Attributes attributes) {
        return new ContainerTag("var", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node var(String className, Attributes attributes, String text) {
        return new ContainerTag("var", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node var(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("var", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node var(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("var", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node video() {
        return new ContainerTag("video");
    }

    @NamedColor("html-dsl-tag")
    static Node video(String text) {
        return new ContainerTag("video", text);
    }

    @NamedColor("html-dsl-tag")
    static Node video(Node... nodes) {
        return new ContainerTag("video", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node video(Stream<Node> nodes) {
        return new ContainerTag("video", nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node video(Attributes attributes) {
        return new ContainerTag("video", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node video(Attributes attributes, String text) {
        return new ContainerTag("video", attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node video(Attributes attributes, Node... nodes) {
        return new ContainerTag("video", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node video(Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("video", attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node video(String className, String text) {
        return new ContainerTag("video", className, text);
    }

    @NamedColor("html-dsl-tag")
    static Node video(String className, Node... nodes) {
        return new ContainerTag("video", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node video(String className, Stream<Node> nodes) {
        return new ContainerTag("video", className, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node video(String className, Attributes attributes) {
        return new ContainerTag("video", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node video(String className, Attributes attributes, String text) {
        return new ContainerTag("video", className, attributes, text);
    }

    @NamedColor("html-dsl-tag")
    static Node video(String className, Attributes attributes, Node... nodes) {
        return new ContainerTag("video", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node video(String className, Attributes attributes, Stream<Node> nodes) {
        return new ContainerTag("video", className, attributes, nodes);
    }

    @NamedColor("html-dsl-tag")
    static Node area() {
        return new EmptyTag("area");
    }

    @NamedColor("html-dsl-tag")
    static Node area(Attributes attributes) {
        return new EmptyTag("area", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node area(String className) {
        return new EmptyTag("area", className);
    }

    @NamedColor("html-dsl-tag")
    static Node area(String className, Attributes attributes) {
        return new EmptyTag("area", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node base() {
        return new EmptyTag("base");
    }

    @NamedColor("html-dsl-tag")
    static Node base(Attributes attributes) {
        return new EmptyTag("base", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node base(String className) {
        return new EmptyTag("base", className);
    }

    @NamedColor("html-dsl-tag")
    static Node base(String className, Attributes attributes) {
        return new EmptyTag("base", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node br() {
        return new EmptyTag("br");
    }

    @NamedColor("html-dsl-tag")
    static Node br(Attributes attributes) {
        return new EmptyTag("br", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node br(String className) {
        return new EmptyTag("br", className);
    }

    @NamedColor("html-dsl-tag")
    static Node br(String className, Attributes attributes) {
        return new EmptyTag("br", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node col() {
        return new EmptyTag("col");
    }

    @NamedColor("html-dsl-tag")
    static Node col(Attributes attributes) {
        return new EmptyTag("col", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node col(String className) {
        return new EmptyTag("col", className);
    }

    @NamedColor("html-dsl-tag")
    static Node col(String className, Attributes attributes) {
        return new EmptyTag("col", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node embed() {
        return new EmptyTag("embed");
    }

    @NamedColor("html-dsl-tag")
    static Node embed(Attributes attributes) {
        return new EmptyTag("embed", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node embed(String className) {
        return new EmptyTag("embed", className);
    }

    @NamedColor("html-dsl-tag")
    static Node embed(String className, Attributes attributes) {
        return new EmptyTag("embed", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node hr() {
        return new EmptyTag("hr");
    }

    @NamedColor("html-dsl-tag")
    static Node hr(Attributes attributes) {
        return new EmptyTag("hr", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node hr(String className) {
        return new EmptyTag("hr", className);
    }

    @NamedColor("html-dsl-tag")
    static Node hr(String className, Attributes attributes) {
        return new EmptyTag("hr", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node img() {
        return new EmptyTag("img");
    }

    @NamedColor("html-dsl-tag")
    static Node img(Attributes attributes) {
        return new EmptyTag("img", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node img(String className) {
        return new EmptyTag("img", className);
    }

    @NamedColor("html-dsl-tag")
    static Node img(String className, Attributes attributes) {
        return new EmptyTag("img", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node input() {
        return new EmptyTag("input");
    }

    @NamedColor("html-dsl-tag")
    static Node input(Attributes attributes) {
        return new EmptyTag("input", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node input(String className) {
        return new EmptyTag("input", className);
    }

    @NamedColor("html-dsl-tag")
    static Node input(String className, Attributes attributes) {
        return new EmptyTag("input", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node keygen() {
        return new EmptyTag("keygen");
    }

    @NamedColor("html-dsl-tag")
    static Node keygen(Attributes attributes) {
        return new EmptyTag("keygen", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node keygen(String className) {
        return new EmptyTag("keygen", className);
    }

    @NamedColor("html-dsl-tag")
    static Node keygen(String className, Attributes attributes) {
        return new EmptyTag("keygen", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node link() {
        return new EmptyTag("link");
    }

    @NamedColor("html-dsl-tag")
    static Node link(Attributes attributes) {
        return new EmptyTag("link", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node link(String className) {
        return new EmptyTag("link", className);
    }

    @NamedColor("html-dsl-tag")
    static Node link(String className, Attributes attributes) {
        return new EmptyTag("link", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node meta() {
        return new EmptyTag("meta");
    }

    @NamedColor("html-dsl-tag")
    static Node meta(Attributes attributes) {
        return new EmptyTag("meta", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node meta(String className) {
        return new EmptyTag("meta", className);
    }

    @NamedColor("html-dsl-tag")
    static Node meta(String className, Attributes attributes) {
        return new EmptyTag("meta", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node param() {
        return new EmptyTag("param");
    }

    @NamedColor("html-dsl-tag")
    static Node param(Attributes attributes) {
        return new EmptyTag("param", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node param(String className) {
        return new EmptyTag("param", className);
    }

    @NamedColor("html-dsl-tag")
    static Node param(String className, Attributes attributes) {
        return new EmptyTag("param", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node source() {
        return new EmptyTag("source");
    }

    @NamedColor("html-dsl-tag")
    static Node source(Attributes attributes) {
        return new EmptyTag("source", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node source(String className) {
        return new EmptyTag("source", className);
    }

    @NamedColor("html-dsl-tag")
    static Node source(String className, Attributes attributes) {
        return new EmptyTag("source", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node track() {
        return new EmptyTag("track");
    }

    @NamedColor("html-dsl-tag")
    static Node track(Attributes attributes) {
        return new EmptyTag("track", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node track(String className) {
        return new EmptyTag("track", className);
    }

    @NamedColor("html-dsl-tag")
    static Node track(String className, Attributes attributes) {
        return new EmptyTag("track", className, attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node wbr() {
        return new EmptyTag("wbr");
    }

    @NamedColor("html-dsl-tag")
    static Node wbr(Attributes attributes) {
        return new EmptyTag("wbr", attributes);
    }

    @NamedColor("html-dsl-tag")
    static Node wbr(String className) {
        return new EmptyTag("wbr", className);
    }

    @NamedColor("html-dsl-tag")
    static Node wbr(String className, Attributes attributes) {
        return new EmptyTag("wbr", className, attributes);
    }
}
