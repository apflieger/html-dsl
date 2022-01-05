package com.meetinclass.html;

import com.meetinclass.dslincolor.annotations.NamedColor;
import java.lang.IllegalArgumentException;
import java.lang.String;

public interface AttributeFactory {
    static Attributes attr(Attribute... attributes) {
        return Attributes.of(attributes);
    }

    @NamedColor("html-attribute")
    static Attribute _attr(String name, String value) {
        if (TagsAndAttributes.ATTRIBUTES.contains(name)) {
            throw new IllegalArgumentException("Illegal use of _attr(\"%s\"). Use _%s() instead".formatted(name, name));
        }
        return new Attribute(name, value);
    }

    @NamedColor("html-attribute")
    static Attribute _accept(@NamedColor("html-attribute") String value) {
        return new Attribute("accept", value);
    }

    static Attribute _accept() {
        return new Attribute("accept", null);
    }

    @NamedColor("html-attribute")
    static Attribute _acceptCharset(@NamedColor("html-attribute") String value) {
        return new Attribute("accept-charset", value);
    }

    static Attribute _acceptCharset() {
        return new Attribute("accept-charset", null);
    }

    @NamedColor("html-attribute")
    static Attribute _accesskey(@NamedColor("html-attribute") String value) {
        return new Attribute("accesskey", value);
    }

    static Attribute _accesskey() {
        return new Attribute("accesskey", null);
    }

    @NamedColor("html-attribute")
    static Attribute _action(@NamedColor("html-attribute") String value) {
        return new Attribute("action", value);
    }

    static Attribute _action() {
        return new Attribute("action", null);
    }

    @NamedColor("html-attribute")
    static Attribute _align(@NamedColor("html-attribute") String value) {
        return new Attribute("align", value);
    }

    static Attribute _align() {
        return new Attribute("align", null);
    }

    @NamedColor("html-attribute")
    static Attribute _alt(@NamedColor("html-attribute") String value) {
        return new Attribute("alt", value);
    }

    static Attribute _alt() {
        return new Attribute("alt", null);
    }

    @NamedColor("html-attribute")
    static Attribute _async(@NamedColor("html-attribute") String value) {
        return new Attribute("async", value);
    }

    static Attribute _async() {
        return new Attribute("async", null);
    }

    @NamedColor("html-attribute")
    static Attribute _autocomplete(@NamedColor("html-attribute") String value) {
        return new Attribute("autocomplete", value);
    }

    static Attribute _autocomplete() {
        return new Attribute("autocomplete", null);
    }

    @NamedColor("html-attribute")
    static Attribute _autofocus(@NamedColor("html-attribute") String value) {
        return new Attribute("autofocus", value);
    }

    static Attribute _autofocus() {
        return new Attribute("autofocus", null);
    }

    @NamedColor("html-attribute")
    static Attribute _autoplay(@NamedColor("html-attribute") String value) {
        return new Attribute("autoplay", value);
    }

    static Attribute _autoplay() {
        return new Attribute("autoplay", null);
    }

    @NamedColor("html-attribute")
    static Attribute _autosave(@NamedColor("html-attribute") String value) {
        return new Attribute("autosave", value);
    }

    static Attribute _autosave() {
        return new Attribute("autosave", null);
    }

    @NamedColor("html-attribute")
    static Attribute _border(@NamedColor("html-attribute") String value) {
        return new Attribute("border", value);
    }

    static Attribute _border() {
        return new Attribute("border", null);
    }

    @NamedColor("html-attribute")
    static Attribute _buffered(@NamedColor("html-attribute") String value) {
        return new Attribute("buffered", value);
    }

    static Attribute _buffered() {
        return new Attribute("buffered", null);
    }

    @NamedColor("html-attribute")
    static Attribute _challenge(@NamedColor("html-attribute") String value) {
        return new Attribute("challenge", value);
    }

    static Attribute _challenge() {
        return new Attribute("challenge", null);
    }

    @NamedColor("html-attribute")
    static Attribute _charset(@NamedColor("html-attribute") String value) {
        return new Attribute("charset", value);
    }

    static Attribute _charset() {
        return new Attribute("charset", null);
    }

    @NamedColor("html-attribute")
    static Attribute _checked(@NamedColor("html-attribute") String value) {
        return new Attribute("checked", value);
    }

    static Attribute _checked() {
        return new Attribute("checked", null);
    }

    @NamedColor("html-attribute")
    static Attribute _cite(@NamedColor("html-attribute") String value) {
        return new Attribute("cite", value);
    }

    static Attribute _cite() {
        return new Attribute("cite", null);
    }

    @NamedColor("html-attribute")
    static Attribute _color(@NamedColor("html-attribute") String value) {
        return new Attribute("color", value);
    }

    static Attribute _color() {
        return new Attribute("color", null);
    }

    @NamedColor("html-attribute")
    static Attribute _cols(@NamedColor("html-attribute") String value) {
        return new Attribute("cols", value);
    }

    static Attribute _cols() {
        return new Attribute("cols", null);
    }

    @NamedColor("html-attribute")
    static Attribute _colspan(@NamedColor("html-attribute") String value) {
        return new Attribute("colspan", value);
    }

    static Attribute _colspan() {
        return new Attribute("colspan", null);
    }

    @NamedColor("html-attribute")
    static Attribute _content(@NamedColor("html-attribute") String value) {
        return new Attribute("content", value);
    }

    static Attribute _content() {
        return new Attribute("content", null);
    }

    @NamedColor("html-attribute")
    static Attribute _contenteditable(@NamedColor("html-attribute") String value) {
        return new Attribute("contenteditable", value);
    }

    static Attribute _contenteditable() {
        return new Attribute("contenteditable", null);
    }

    @NamedColor("html-attribute")
    static Attribute _contextmenu(@NamedColor("html-attribute") String value) {
        return new Attribute("contextmenu", value);
    }

    static Attribute _contextmenu() {
        return new Attribute("contextmenu", null);
    }

    @NamedColor("html-attribute")
    static Attribute _controls(@NamedColor("html-attribute") String value) {
        return new Attribute("controls", value);
    }

    static Attribute _controls() {
        return new Attribute("controls", null);
    }

    @NamedColor("html-attribute")
    static Attribute _coords(@NamedColor("html-attribute") String value) {
        return new Attribute("coords", value);
    }

    static Attribute _coords() {
        return new Attribute("coords", null);
    }

    @NamedColor("html-attribute")
    static Attribute _data(@NamedColor("html-attribute") String value) {
        return new Attribute("data", value);
    }

    static Attribute _data() {
        return new Attribute("data", null);
    }

    @NamedColor("html-attribute")
    static Attribute _datetime(@NamedColor("html-attribute") String value) {
        return new Attribute("datetime", value);
    }

    static Attribute _datetime() {
        return new Attribute("datetime", null);
    }

    @NamedColor("html-attribute")
    static Attribute _default(@NamedColor("html-attribute") String value) {
        return new Attribute("default", value);
    }

    static Attribute _default() {
        return new Attribute("default", null);
    }

    @NamedColor("html-attribute")
    static Attribute _defer(@NamedColor("html-attribute") String value) {
        return new Attribute("defer", value);
    }

    static Attribute _defer() {
        return new Attribute("defer", null);
    }

    @NamedColor("html-attribute")
    static Attribute _dir(@NamedColor("html-attribute") String value) {
        return new Attribute("dir", value);
    }

    static Attribute _dir() {
        return new Attribute("dir", null);
    }

    @NamedColor("html-attribute")
    static Attribute _dirname(@NamedColor("html-attribute") String value) {
        return new Attribute("dirname", value);
    }

    static Attribute _dirname() {
        return new Attribute("dirname", null);
    }

    @NamedColor("html-attribute")
    static Attribute _disabled(@NamedColor("html-attribute") String value) {
        return new Attribute("disabled", value);
    }

    static Attribute _disabled() {
        return new Attribute("disabled", null);
    }

    @NamedColor("html-attribute")
    static Attribute _download(@NamedColor("html-attribute") String value) {
        return new Attribute("download", value);
    }

    static Attribute _download() {
        return new Attribute("download", null);
    }

    @NamedColor("html-attribute")
    static Attribute _draggable(@NamedColor("html-attribute") String value) {
        return new Attribute("draggable", value);
    }

    static Attribute _draggable() {
        return new Attribute("draggable", null);
    }

    @NamedColor("html-attribute")
    static Attribute _dropzone(@NamedColor("html-attribute") String value) {
        return new Attribute("dropzone", value);
    }

    static Attribute _dropzone() {
        return new Attribute("dropzone", null);
    }

    @NamedColor("html-attribute")
    static Attribute _enctype(@NamedColor("html-attribute") String value) {
        return new Attribute("enctype", value);
    }

    static Attribute _enctype() {
        return new Attribute("enctype", null);
    }

    @NamedColor("html-attribute")
    static Attribute _for(@NamedColor("html-attribute") String value) {
        return new Attribute("for", value);
    }

    static Attribute _for() {
        return new Attribute("for", null);
    }

    @NamedColor("html-attribute")
    static Attribute _form(@NamedColor("html-attribute") String value) {
        return new Attribute("form", value);
    }

    static Attribute _form() {
        return new Attribute("form", null);
    }

    @NamedColor("html-attribute")
    static Attribute _formaction(@NamedColor("html-attribute") String value) {
        return new Attribute("formaction", value);
    }

    static Attribute _formaction() {
        return new Attribute("formaction", null);
    }

    @NamedColor("html-attribute")
    static Attribute _headers(@NamedColor("html-attribute") String value) {
        return new Attribute("headers", value);
    }

    static Attribute _headers() {
        return new Attribute("headers", null);
    }

    @NamedColor("html-attribute")
    static Attribute _height(@NamedColor("html-attribute") String value) {
        return new Attribute("height", value);
    }

    static Attribute _height() {
        return new Attribute("height", null);
    }

    @NamedColor("html-attribute")
    static Attribute _hidden(@NamedColor("html-attribute") String value) {
        return new Attribute("hidden", value);
    }

    static Attribute _hidden() {
        return new Attribute("hidden", null);
    }

    @NamedColor("html-attribute")
    static Attribute _high(@NamedColor("html-attribute") String value) {
        return new Attribute("high", value);
    }

    static Attribute _high() {
        return new Attribute("high", null);
    }

    @NamedColor("html-attribute")
    static Attribute _href(@NamedColor("html-attribute") String value) {
        return new Attribute("href", value);
    }

    static Attribute _href() {
        return new Attribute("href", null);
    }

    @NamedColor("html-attribute")
    static Attribute _hreflang(@NamedColor("html-attribute") String value) {
        return new Attribute("hreflang", value);
    }

    static Attribute _hreflang() {
        return new Attribute("hreflang", null);
    }

    @NamedColor("html-attribute")
    static Attribute _httpEquiv(@NamedColor("html-attribute") String value) {
        return new Attribute("http-equiv", value);
    }

    static Attribute _httpEquiv() {
        return new Attribute("http-equiv", null);
    }

    @NamedColor("html-attribute")
    static Attribute _icon(@NamedColor("html-attribute") String value) {
        return new Attribute("icon", value);
    }

    static Attribute _icon() {
        return new Attribute("icon", null);
    }

    @NamedColor("html-attribute")
    static Attribute _id(@NamedColor("html-attribute") String value) {
        return new Attribute("id", value);
    }

    static Attribute _id() {
        return new Attribute("id", null);
    }

    @NamedColor("html-attribute")
    static Attribute _ismap(@NamedColor("html-attribute") String value) {
        return new Attribute("ismap", value);
    }

    static Attribute _ismap() {
        return new Attribute("ismap", null);
    }

    @NamedColor("html-attribute")
    static Attribute _itemprop(@NamedColor("html-attribute") String value) {
        return new Attribute("itemprop", value);
    }

    static Attribute _itemprop() {
        return new Attribute("itemprop", null);
    }

    @NamedColor("html-attribute")
    static Attribute _keytype(@NamedColor("html-attribute") String value) {
        return new Attribute("keytype", value);
    }

    static Attribute _keytype() {
        return new Attribute("keytype", null);
    }

    @NamedColor("html-attribute")
    static Attribute _kind(@NamedColor("html-attribute") String value) {
        return new Attribute("kind", value);
    }

    static Attribute _kind() {
        return new Attribute("kind", null);
    }

    @NamedColor("html-attribute")
    static Attribute _label(@NamedColor("html-attribute") String value) {
        return new Attribute("label", value);
    }

    static Attribute _label() {
        return new Attribute("label", null);
    }

    @NamedColor("html-attribute")
    static Attribute _lang(@NamedColor("html-attribute") String value) {
        return new Attribute("lang", value);
    }

    static Attribute _lang() {
        return new Attribute("lang", null);
    }

    @NamedColor("html-attribute")
    static Attribute _language(@NamedColor("html-attribute") String value) {
        return new Attribute("language", value);
    }

    static Attribute _language() {
        return new Attribute("language", null);
    }

    @NamedColor("html-attribute")
    static Attribute _list(@NamedColor("html-attribute") String value) {
        return new Attribute("list", value);
    }

    static Attribute _list() {
        return new Attribute("list", null);
    }

    @NamedColor("html-attribute")
    static Attribute _loop(@NamedColor("html-attribute") String value) {
        return new Attribute("loop", value);
    }

    static Attribute _loop() {
        return new Attribute("loop", null);
    }

    @NamedColor("html-attribute")
    static Attribute _low(@NamedColor("html-attribute") String value) {
        return new Attribute("low", value);
    }

    static Attribute _low() {
        return new Attribute("low", null);
    }

    @NamedColor("html-attribute")
    static Attribute _manifest(@NamedColor("html-attribute") String value) {
        return new Attribute("manifest", value);
    }

    static Attribute _manifest() {
        return new Attribute("manifest", null);
    }

    @NamedColor("html-attribute")
    static Attribute _max(@NamedColor("html-attribute") String value) {
        return new Attribute("max", value);
    }

    static Attribute _max() {
        return new Attribute("max", null);
    }

    @NamedColor("html-attribute")
    static Attribute _maxlength(@NamedColor("html-attribute") String value) {
        return new Attribute("maxlength", value);
    }

    static Attribute _maxlength() {
        return new Attribute("maxlength", null);
    }

    @NamedColor("html-attribute")
    static Attribute _media(@NamedColor("html-attribute") String value) {
        return new Attribute("media", value);
    }

    static Attribute _media() {
        return new Attribute("media", null);
    }

    @NamedColor("html-attribute")
    static Attribute _method(@NamedColor("html-attribute") String value) {
        return new Attribute("method", value);
    }

    static Attribute _method() {
        return new Attribute("method", null);
    }

    @NamedColor("html-attribute")
    static Attribute _min(@NamedColor("html-attribute") String value) {
        return new Attribute("min", value);
    }

    static Attribute _min() {
        return new Attribute("min", null);
    }

    @NamedColor("html-attribute")
    static Attribute _multiple(@NamedColor("html-attribute") String value) {
        return new Attribute("multiple", value);
    }

    static Attribute _multiple() {
        return new Attribute("multiple", null);
    }

    @NamedColor("html-attribute")
    static Attribute _name(@NamedColor("html-attribute") String value) {
        return new Attribute("name", value);
    }

    static Attribute _name() {
        return new Attribute("name", null);
    }

    @NamedColor("html-attribute")
    static Attribute _novalidate(@NamedColor("html-attribute") String value) {
        return new Attribute("novalidate", value);
    }

    static Attribute _novalidate() {
        return new Attribute("novalidate", null);
    }

    @NamedColor("html-attribute")
    static Attribute _open(@NamedColor("html-attribute") String value) {
        return new Attribute("open", value);
    }

    static Attribute _open() {
        return new Attribute("open", null);
    }

    @NamedColor("html-attribute")
    static Attribute _optimum(@NamedColor("html-attribute") String value) {
        return new Attribute("optimum", value);
    }

    static Attribute _optimum() {
        return new Attribute("optimum", null);
    }

    @NamedColor("html-attribute")
    static Attribute _pattern(@NamedColor("html-attribute") String value) {
        return new Attribute("pattern", value);
    }

    static Attribute _pattern() {
        return new Attribute("pattern", null);
    }

    @NamedColor("html-attribute")
    static Attribute _ping(@NamedColor("html-attribute") String value) {
        return new Attribute("ping", value);
    }

    static Attribute _ping() {
        return new Attribute("ping", null);
    }

    @NamedColor("html-attribute")
    static Attribute _placeholder(@NamedColor("html-attribute") String value) {
        return new Attribute("placeholder", value);
    }

    static Attribute _placeholder() {
        return new Attribute("placeholder", null);
    }

    @NamedColor("html-attribute")
    static Attribute _poster(@NamedColor("html-attribute") String value) {
        return new Attribute("poster", value);
    }

    static Attribute _poster() {
        return new Attribute("poster", null);
    }

    @NamedColor("html-attribute")
    static Attribute _preload(@NamedColor("html-attribute") String value) {
        return new Attribute("preload", value);
    }

    static Attribute _preload() {
        return new Attribute("preload", null);
    }

    @NamedColor("html-attribute")
    static Attribute _pubdate(@NamedColor("html-attribute") String value) {
        return new Attribute("pubdate", value);
    }

    static Attribute _pubdate() {
        return new Attribute("pubdate", null);
    }

    @NamedColor("html-attribute")
    static Attribute _radiogroup(@NamedColor("html-attribute") String value) {
        return new Attribute("radiogroup", value);
    }

    static Attribute _radiogroup() {
        return new Attribute("radiogroup", null);
    }

    @NamedColor("html-attribute")
    static Attribute _readonly(@NamedColor("html-attribute") String value) {
        return new Attribute("readonly", value);
    }

    static Attribute _readonly() {
        return new Attribute("readonly", null);
    }

    @NamedColor("html-attribute")
    static Attribute _rel(@NamedColor("html-attribute") String value) {
        return new Attribute("rel", value);
    }

    static Attribute _rel() {
        return new Attribute("rel", null);
    }

    @NamedColor("html-attribute")
    static Attribute _required(@NamedColor("html-attribute") String value) {
        return new Attribute("required", value);
    }

    static Attribute _required() {
        return new Attribute("required", null);
    }

    @NamedColor("html-attribute")
    static Attribute _reversed(@NamedColor("html-attribute") String value) {
        return new Attribute("reversed", value);
    }

    static Attribute _reversed() {
        return new Attribute("reversed", null);
    }

    @NamedColor("html-attribute")
    static Attribute _role(@NamedColor("html-attribute") String value) {
        return new Attribute("role", value);
    }

    static Attribute _role() {
        return new Attribute("role", null);
    }

    @NamedColor("html-attribute")
    static Attribute _rows(@NamedColor("html-attribute") String value) {
        return new Attribute("rows", value);
    }

    static Attribute _rows() {
        return new Attribute("rows", null);
    }

    @NamedColor("html-attribute")
    static Attribute _rowspan(@NamedColor("html-attribute") String value) {
        return new Attribute("rowspan", value);
    }

    static Attribute _rowspan() {
        return new Attribute("rowspan", null);
    }

    @NamedColor("html-attribute")
    static Attribute _sandbox(@NamedColor("html-attribute") String value) {
        return new Attribute("sandbox", value);
    }

    static Attribute _sandbox() {
        return new Attribute("sandbox", null);
    }

    @NamedColor("html-attribute")
    static Attribute _scope(@NamedColor("html-attribute") String value) {
        return new Attribute("scope", value);
    }

    static Attribute _scope() {
        return new Attribute("scope", null);
    }

    @NamedColor("html-attribute")
    static Attribute _scoped(@NamedColor("html-attribute") String value) {
        return new Attribute("scoped", value);
    }

    static Attribute _scoped() {
        return new Attribute("scoped", null);
    }

    @NamedColor("html-attribute")
    static Attribute _seamless(@NamedColor("html-attribute") String value) {
        return new Attribute("seamless", value);
    }

    static Attribute _seamless() {
        return new Attribute("seamless", null);
    }

    @NamedColor("html-attribute")
    static Attribute _selected(@NamedColor("html-attribute") String value) {
        return new Attribute("selected", value);
    }

    static Attribute _selected() {
        return new Attribute("selected", null);
    }

    @NamedColor("html-attribute")
    static Attribute _shape(@NamedColor("html-attribute") String value) {
        return new Attribute("shape", value);
    }

    static Attribute _shape() {
        return new Attribute("shape", null);
    }

    @NamedColor("html-attribute")
    static Attribute _size(@NamedColor("html-attribute") String value) {
        return new Attribute("size", value);
    }

    static Attribute _size() {
        return new Attribute("size", null);
    }

    @NamedColor("html-attribute")
    static Attribute _sizes(@NamedColor("html-attribute") String value) {
        return new Attribute("sizes", value);
    }

    static Attribute _sizes() {
        return new Attribute("sizes", null);
    }

    @NamedColor("html-attribute")
    static Attribute _span(@NamedColor("html-attribute") String value) {
        return new Attribute("span", value);
    }

    static Attribute _span() {
        return new Attribute("span", null);
    }

    @NamedColor("html-attribute")
    static Attribute _spellcheck(@NamedColor("html-attribute") String value) {
        return new Attribute("spellcheck", value);
    }

    static Attribute _spellcheck() {
        return new Attribute("spellcheck", null);
    }

    @NamedColor("html-attribute")
    static Attribute _src(@NamedColor("html-attribute") String value) {
        return new Attribute("src", value);
    }

    static Attribute _src() {
        return new Attribute("src", null);
    }

    @NamedColor("html-attribute")
    static Attribute _srcdoc(@NamedColor("html-attribute") String value) {
        return new Attribute("srcdoc", value);
    }

    static Attribute _srcdoc() {
        return new Attribute("srcdoc", null);
    }

    @NamedColor("html-attribute")
    static Attribute _srclang(@NamedColor("html-attribute") String value) {
        return new Attribute("srclang", value);
    }

    static Attribute _srclang() {
        return new Attribute("srclang", null);
    }

    @NamedColor("html-attribute")
    static Attribute _srcset(@NamedColor("html-attribute") String value) {
        return new Attribute("srcset", value);
    }

    static Attribute _srcset() {
        return new Attribute("srcset", null);
    }

    @NamedColor("html-attribute")
    static Attribute _start(@NamedColor("html-attribute") String value) {
        return new Attribute("start", value);
    }

    static Attribute _start() {
        return new Attribute("start", null);
    }

    @NamedColor("html-attribute")
    static Attribute _step(@NamedColor("html-attribute") String value) {
        return new Attribute("step", value);
    }

    static Attribute _step() {
        return new Attribute("step", null);
    }

    @NamedColor("html-attribute")
    static Attribute _style(@NamedColor("html-attribute") String value) {
        return new Attribute("style", value);
    }

    static Attribute _style() {
        return new Attribute("style", null);
    }

    @NamedColor("html-attribute")
    static Attribute _summary(@NamedColor("html-attribute") String value) {
        return new Attribute("summary", value);
    }

    static Attribute _summary() {
        return new Attribute("summary", null);
    }

    @NamedColor("html-attribute")
    static Attribute _tabindex(@NamedColor("html-attribute") String value) {
        return new Attribute("tabindex", value);
    }

    static Attribute _tabindex() {
        return new Attribute("tabindex", null);
    }

    @NamedColor("html-attribute")
    static Attribute _target(@NamedColor("html-attribute") String value) {
        return new Attribute("target", value);
    }

    static Attribute _target() {
        return new Attribute("target", null);
    }

    @NamedColor("html-attribute")
    static Attribute _title(@NamedColor("html-attribute") String value) {
        return new Attribute("title", value);
    }

    static Attribute _title() {
        return new Attribute("title", null);
    }

    @NamedColor("html-attribute")
    static Attribute _type(@NamedColor("html-attribute") String value) {
        return new Attribute("type", value);
    }

    static Attribute _type() {
        return new Attribute("type", null);
    }

    @NamedColor("html-attribute")
    static Attribute _usemap(@NamedColor("html-attribute") String value) {
        return new Attribute("usemap", value);
    }

    static Attribute _usemap() {
        return new Attribute("usemap", null);
    }

    @NamedColor("html-attribute")
    static Attribute _value(@NamedColor("html-attribute") String value) {
        return new Attribute("value", value);
    }

    static Attribute _value() {
        return new Attribute("value", null);
    }

    @NamedColor("html-attribute")
    static Attribute _width(@NamedColor("html-attribute") String value) {
        return new Attribute("width", value);
    }

    static Attribute _width() {
        return new Attribute("width", null);
    }

    @NamedColor("html-attribute")
    static Attribute _wrap(@NamedColor("html-attribute") String value) {
        return new Attribute("wrap", value);
    }

    static Attribute _wrap() {
        return new Attribute("wrap", null);
    }

    @NamedColor("html-attribute")
    static Attribute _translate(@NamedColor("html-attribute") String value) {
        return new Attribute("translate", value);
    }

    static Attribute _translate() {
        return new Attribute("translate", null);
    }
}
