package com.meetinclass.html;

import java.util.stream.Stream;

import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;

import static com.meetinclass.html.AttributeFactory.*;
import static com.meetinclass.html.HtmlFactory.*;

public class HtmlFactoryTest {

    @Test
    public void renderDiv() {
        assertThat(div().render()).isEqualTo("<div></div>");
    }

    @Test
    public void renderDivText() {
        assertThat(div("Texte").render()).isEqualTo("<div>Texte</div>");
    }

    @Test
    public void renderText() {
        assertThat(text("Texte").render()).isEqualTo("Texte");
    }

    @Test
    public void renderDivChild() {
        assertThat(
                div(
                        div()
                ).render()).isEqualTo("""
                <div>
                    <div></div>
                </div>""");
    }

    @Test
    public void renderDivChildren() {
        assertThat(
                div(
                        div("Premier texte"),
                        div("Deuxieme texte")
                ).render()).isEqualTo("""
                <div>
                    <div>Premier texte</div>
                    <div>Deuxieme texte</div>
                </div>""");
    }

    @Test
    public void renderDivStream() {
        assertThat(
                div(Stream.of(
                        div("Premier texte"),
                        div("Deuxieme texte"))
                ).render()).isEqualTo("""
                <div>
                    <div>Premier texte</div>
                    <div>Deuxieme texte</div>
                </div>""");
    }

    @Test
    public void renderDivAttribute_id() {
        assertThat(
                div(attr(_id("a-nice-id"))).render()).isEqualTo("<div id=\"a-nice-id\"></div>");
    }

    @Test
    public void renderDivAttributeIdHref() {
        assertThat(
                div(attr(
                        _id("a-nice-id"),
                        _href("https://www.example.com")))
                        .render()).isEqualTo("<div id=\"a-nice-id\" href=\"https://www.example.com\"></div>");
    }

    @Test
    public void renderDivClassText() {
        assertThat(
                div("class-name", "Texte").render()).isEqualTo("<div class=\"class-name\">Texte</div>");
    }

    @Test
    public void renderDivAttributeText() {
        assertThat(
                div(attr(_id("some-id")), "Texte").render()).isEqualTo("<div id=\"some-id\">Texte</div>");
    }

    @Test
    public void renderDivAttributeChild() {
        assertThat(
                div(attr(_id("some-id")),
                        div()).render()).isEqualTo("""
                <div id="some-id">
                    <div></div>
                </div>""");
    }

    @Test
    public void renderDivAttributeStream() {
        assertThat(
                div(attr(_id("some-id")),
                        Stream.of(div())).render()).isEqualTo("""
                <div id="some-id">
                    <div></div>
                </div>""");
    }

    @Test
    public void renderDivClassChild() {
        assertThat(
                div("pretty-class-name",
                        div()).render()).isEqualTo("""
                <div class="pretty-class-name">
                    <div></div>
                </div>""");
    }

    @Test
    public void renderDivClassStream() {
        assertThat(
                div("pretty-class-name",
                        Stream.of(div())).render()).isEqualTo("""
                <div class="pretty-class-name">
                    <div></div>
                </div>""");
    }

    @Test
    public void renderDivClassAttribute() {
        assertThat(
                div("pretty-class-name", attr(_id("my-id"))).render()).isEqualTo("<div class=\"pretty-class-name\" id=\"my-id\"></div>");
    }

    @Test
    public void renderDivClassAttributeText() {
        assertThat(
                div("pretty-class-name", attr(_id("my-id")), "Lorem ipsum").render()).isEqualTo(
                "<div class=\"pretty-class-name\" id=\"my-id\">Lorem ipsum</div>");
    }

    @Test
    public void renderDivClassAttributeChild() {
        assertThat(
                div("pretty-class-name", attr(_id("my-id")), div()).render()).isEqualTo("""
                <div class="pretty-class-name" id="my-id">
                    <div></div>
                </div>""");
    }

    @Test
    public void renderDivClassAttributeStream() {
        assertThat(
                div("pretty-class-name", attr(_id("my-id")),
                        Stream.of(div())).render()).isEqualTo("""
                <div class="pretty-class-name" id="my-id">
                    <div></div>
                </div>""");
    }

    @Test
    public void renderBr() {
        assertThat(br().render()).isEqualTo("<br>");
    }

    @Test
    public void renderDivBr() {
        assertThat(div(
                br()).render()).isEqualTo("""
                <div>
                    <br>
                </div>""");
    }

    @Test
    public void renderImgAttribute() {
        assertThat(img(attr(
                _src("https://www.example.com/ma-belle-image"))).render()).isEqualTo("<img src=\"https://www.example.com/ma-belle-image\">");
    }

    @Test
    public void renderInputClassname() {
        assertThat(img("css-class").render()).isEqualTo("<img class=\"css-class\">");
    }

    @Test
    public void renderImgClassnameAttribute() {
        assertThat(img("css-class", attr(
                _src("https://www.example.com/ma-belle-image"))).render()).isEqualTo(
                "<img class=\"css-class\" src=\"https://www.example.com/ma-belle-image\">");
    }

    @Test
    public void renderEach() {
        assertThat(
                each(
                        div(),
                        div()
                ).render()).isEqualTo("""
                <div></div>
                <div></div>
                """);
    }

    @Test
    public void renderEachStream() {
        assertThat(
                each(Stream.of(
                        div(),
                        div())
                ).render()).isEqualTo("""
                <div></div>
                <div></div>
                """);
    }

    @Test
    public void renderEachNull() {
        assertThat(
                each(div(), null).render()).isEqualTo("<div></div>\n");
    }

    @Test
    public void renderDivEscapedHtml() {
        assertThat(div("->").render()).isEqualTo("<div>-&gt;</div>");
    }

    @Test
    public void renderTextEscapedHtml() {
        assertThat(text("Premier -> Deuxième").render()).isEqualTo("Premier -&gt; Deuxi&egrave;me");
    }

    @Test
    public void renderDivEscaptedAttribute() {
        assertThat(
                div(attr(
                        _content("1 -> 2"))).render()).isEqualTo("<div content=\"1 -&gt; 2\"></div>");
    }

    @Test
    public void renderMetaEscaptedAttribute() {
        assertThat(
                meta(attr(
                        _content("1 -> 2"))).render()).isEqualTo("<meta content=\"1 -&gt; 2\">");
    }

    @Test
    public void renderRawHtml() {
        assertThat(rawHtml("<script></script>").render()).isEqualTo("<script></script>\n");
    }

    @Test
    public void renderDivRequired() {
        assertThat(div(attr(
                _required())).render()).isEqualTo("<div required></div>");
    }

    @Test
    public void renderInputRequired() {
        assertThat(input(attr(
                _required())).render()).isEqualTo("<input required>");
    }

    @Test
    public void renderNullNode() {
        assertThat(div((Node) null).render()).isEqualTo("<div></div>");
    }

    @Test
    public void renderContainerTagNullAttribute() {
        assertThat(div(attr((Attribute) null)).render()).isEqualTo("<div></div>");
    }

    @Test
    public void renderEmptyTagNullAttribute() {
        assertThat(input(attr((Attribute) null)).render()).isEqualTo("<input>");
    }

    @Test
    public void renderTextNoSpace() {
        assertThat(each(
                text("Texte"),
                text(".")).render()).isEqualTo("Texte.");
    }

    @Test
    public void renderTextElementsNoSpace() {
        assertThat(div(
                text("Texte "),
                b("important"),
                text(".")).render())
                .isEqualTo("<div>Texte <b>important</b>.</div>");
    }

    @Test
    public void renderCustomAttributes() {
        assertThat(div(attr(_attr("onclick", "someFunction()"))).render())
                .isEqualTo("""
                        <div onclick="someFunction()"></div>""");

        assertThat(div(attr(_attr("data-stuff", "some-data"))).render())
                .isEqualTo("""
                        <div data-stuff="some-data"></div>""");
    }

    @Test(expected = IllegalArgumentException.class)
    public void renderCustomAttributeNotAllowed() {
        div(attr(_attr("id", "some-id")));
    }
}
