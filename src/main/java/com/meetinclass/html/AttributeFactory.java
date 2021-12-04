package com.meetinclass.html;

import java.lang.IllegalArgumentException;
import java.lang.String;

public interface AttributeFactory {
    static Attributes attr(Attribute... attributes) {
        return new Attributes(attributes);
    }

    static Attribute _attr(String name, String value) {
        if (TagsAndAttributes.ATTRIBUTES.contains(name)) {
            throw new IllegalArgumentException("Illegal use of _attr(\"%s\"). Use _%s() instead".formatted(name, name));
        }
        return new Attribute(name, value);
    }

    static Attribute _accept(String value) {
        return new Attribute("accept", value);
    }

    static Attribute _accept() {
        return new Attribute("accept", null);
    }

    static Attribute _acceptCharset(String value) {
        return new Attribute("accept-charset", value);
    }

    static Attribute _acceptCharset() {
        return new Attribute("accept-charset", null);
    }

    static Attribute _accesskey(String value) {
        return new Attribute("accesskey", value);
    }

    static Attribute _accesskey() {
        return new Attribute("accesskey", null);
    }

    static Attribute _action(String value) {
        return new Attribute("action", value);
    }

    static Attribute _action() {
        return new Attribute("action", null);
    }

    static Attribute _align(String value) {
        return new Attribute("align", value);
    }

    static Attribute _align() {
        return new Attribute("align", null);
    }

    static Attribute _alt(String value) {
        return new Attribute("alt", value);
    }

    static Attribute _alt() {
        return new Attribute("alt", null);
    }

    static Attribute _async(String value) {
        return new Attribute("async", value);
    }

    static Attribute _async() {
        return new Attribute("async", null);
    }

    static Attribute _autocomplete(String value) {
        return new Attribute("autocomplete", value);
    }

    static Attribute _autocomplete() {
        return new Attribute("autocomplete", null);
    }

    static Attribute _autofocus(String value) {
        return new Attribute("autofocus", value);
    }

    static Attribute _autofocus() {
        return new Attribute("autofocus", null);
    }

    static Attribute _autoplay(String value) {
        return new Attribute("autoplay", value);
    }

    static Attribute _autoplay() {
        return new Attribute("autoplay", null);
    }

    static Attribute _autosave(String value) {
        return new Attribute("autosave", value);
    }

    static Attribute _autosave() {
        return new Attribute("autosave", null);
    }

    static Attribute _border(String value) {
        return new Attribute("border", value);
    }

    static Attribute _border() {
        return new Attribute("border", null);
    }

    static Attribute _buffered(String value) {
        return new Attribute("buffered", value);
    }

    static Attribute _buffered() {
        return new Attribute("buffered", null);
    }

    static Attribute _challenge(String value) {
        return new Attribute("challenge", value);
    }

    static Attribute _challenge() {
        return new Attribute("challenge", null);
    }

    static Attribute _charset(String value) {
        return new Attribute("charset", value);
    }

    static Attribute _charset() {
        return new Attribute("charset", null);
    }

    static Attribute _checked(String value) {
        return new Attribute("checked", value);
    }

    static Attribute _checked() {
        return new Attribute("checked", null);
    }

    static Attribute _cite(String value) {
        return new Attribute("cite", value);
    }

    static Attribute _cite() {
        return new Attribute("cite", null);
    }

    static Attribute _color(String value) {
        return new Attribute("color", value);
    }

    static Attribute _color() {
        return new Attribute("color", null);
    }

    static Attribute _cols(String value) {
        return new Attribute("cols", value);
    }

    static Attribute _cols() {
        return new Attribute("cols", null);
    }

    static Attribute _colspan(String value) {
        return new Attribute("colspan", value);
    }

    static Attribute _colspan() {
        return new Attribute("colspan", null);
    }

    static Attribute _content(String value) {
        return new Attribute("content", value);
    }

    static Attribute _content() {
        return new Attribute("content", null);
    }

    static Attribute _contenteditable(String value) {
        return new Attribute("contenteditable", value);
    }

    static Attribute _contenteditable() {
        return new Attribute("contenteditable", null);
    }

    static Attribute _contextmenu(String value) {
        return new Attribute("contextmenu", value);
    }

    static Attribute _contextmenu() {
        return new Attribute("contextmenu", null);
    }

    static Attribute _controls(String value) {
        return new Attribute("controls", value);
    }

    static Attribute _controls() {
        return new Attribute("controls", null);
    }

    static Attribute _coords(String value) {
        return new Attribute("coords", value);
    }

    static Attribute _coords() {
        return new Attribute("coords", null);
    }

    static Attribute _data(String value) {
        return new Attribute("data", value);
    }

    static Attribute _data() {
        return new Attribute("data", null);
    }

    static Attribute _datetime(String value) {
        return new Attribute("datetime", value);
    }

    static Attribute _datetime() {
        return new Attribute("datetime", null);
    }

    static Attribute _default(String value) {
        return new Attribute("default", value);
    }

    static Attribute _default() {
        return new Attribute("default", null);
    }

    static Attribute _defer(String value) {
        return new Attribute("defer", value);
    }

    static Attribute _defer() {
        return new Attribute("defer", null);
    }

    static Attribute _dir(String value) {
        return new Attribute("dir", value);
    }

    static Attribute _dir() {
        return new Attribute("dir", null);
    }

    static Attribute _dirname(String value) {
        return new Attribute("dirname", value);
    }

    static Attribute _dirname() {
        return new Attribute("dirname", null);
    }

    static Attribute _disabled(String value) {
        return new Attribute("disabled", value);
    }

    static Attribute _disabled() {
        return new Attribute("disabled", null);
    }

    static Attribute _download(String value) {
        return new Attribute("download", value);
    }

    static Attribute _download() {
        return new Attribute("download", null);
    }

    static Attribute _draggable(String value) {
        return new Attribute("draggable", value);
    }

    static Attribute _draggable() {
        return new Attribute("draggable", null);
    }

    static Attribute _dropzone(String value) {
        return new Attribute("dropzone", value);
    }

    static Attribute _dropzone() {
        return new Attribute("dropzone", null);
    }

    static Attribute _enctype(String value) {
        return new Attribute("enctype", value);
    }

    static Attribute _enctype() {
        return new Attribute("enctype", null);
    }

    static Attribute _for(String value) {
        return new Attribute("for", value);
    }

    static Attribute _for() {
        return new Attribute("for", null);
    }

    static Attribute _form(String value) {
        return new Attribute("form", value);
    }

    static Attribute _form() {
        return new Attribute("form", null);
    }

    static Attribute _formaction(String value) {
        return new Attribute("formaction", value);
    }

    static Attribute _formaction() {
        return new Attribute("formaction", null);
    }

    static Attribute _headers(String value) {
        return new Attribute("headers", value);
    }

    static Attribute _headers() {
        return new Attribute("headers", null);
    }

    static Attribute _height(String value) {
        return new Attribute("height", value);
    }

    static Attribute _height() {
        return new Attribute("height", null);
    }

    static Attribute _hidden(String value) {
        return new Attribute("hidden", value);
    }

    static Attribute _hidden() {
        return new Attribute("hidden", null);
    }

    static Attribute _high(String value) {
        return new Attribute("high", value);
    }

    static Attribute _high() {
        return new Attribute("high", null);
    }

    static Attribute _href(String value) {
        return new Attribute("href", value);
    }

    static Attribute _href() {
        return new Attribute("href", null);
    }

    static Attribute _hreflang(String value) {
        return new Attribute("hreflang", value);
    }

    static Attribute _hreflang() {
        return new Attribute("hreflang", null);
    }

    static Attribute _httpEquiv(String value) {
        return new Attribute("http-equiv", value);
    }

    static Attribute _httpEquiv() {
        return new Attribute("http-equiv", null);
    }

    static Attribute _icon(String value) {
        return new Attribute("icon", value);
    }

    static Attribute _icon() {
        return new Attribute("icon", null);
    }

    static Attribute _id(String value) {
        return new Attribute("id", value);
    }

    static Attribute _id() {
        return new Attribute("id", null);
    }

    static Attribute _ismap(String value) {
        return new Attribute("ismap", value);
    }

    static Attribute _ismap() {
        return new Attribute("ismap", null);
    }

    static Attribute _itemprop(String value) {
        return new Attribute("itemprop", value);
    }

    static Attribute _itemprop() {
        return new Attribute("itemprop", null);
    }

    static Attribute _keytype(String value) {
        return new Attribute("keytype", value);
    }

    static Attribute _keytype() {
        return new Attribute("keytype", null);
    }

    static Attribute _kind(String value) {
        return new Attribute("kind", value);
    }

    static Attribute _kind() {
        return new Attribute("kind", null);
    }

    static Attribute _label(String value) {
        return new Attribute("label", value);
    }

    static Attribute _label() {
        return new Attribute("label", null);
    }

    static Attribute _lang(String value) {
        return new Attribute("lang", value);
    }

    static Attribute _lang() {
        return new Attribute("lang", null);
    }

    static Attribute _language(String value) {
        return new Attribute("language", value);
    }

    static Attribute _language() {
        return new Attribute("language", null);
    }

    static Attribute _list(String value) {
        return new Attribute("list", value);
    }

    static Attribute _list() {
        return new Attribute("list", null);
    }

    static Attribute _loop(String value) {
        return new Attribute("loop", value);
    }

    static Attribute _loop() {
        return new Attribute("loop", null);
    }

    static Attribute _low(String value) {
        return new Attribute("low", value);
    }

    static Attribute _low() {
        return new Attribute("low", null);
    }

    static Attribute _manifest(String value) {
        return new Attribute("manifest", value);
    }

    static Attribute _manifest() {
        return new Attribute("manifest", null);
    }

    static Attribute _max(String value) {
        return new Attribute("max", value);
    }

    static Attribute _max() {
        return new Attribute("max", null);
    }

    static Attribute _maxlength(String value) {
        return new Attribute("maxlength", value);
    }

    static Attribute _maxlength() {
        return new Attribute("maxlength", null);
    }

    static Attribute _media(String value) {
        return new Attribute("media", value);
    }

    static Attribute _media() {
        return new Attribute("media", null);
    }

    static Attribute _method(String value) {
        return new Attribute("method", value);
    }

    static Attribute _method() {
        return new Attribute("method", null);
    }

    static Attribute _min(String value) {
        return new Attribute("min", value);
    }

    static Attribute _min() {
        return new Attribute("min", null);
    }

    static Attribute _multiple(String value) {
        return new Attribute("multiple", value);
    }

    static Attribute _multiple() {
        return new Attribute("multiple", null);
    }

    static Attribute _name(String value) {
        return new Attribute("name", value);
    }

    static Attribute _name() {
        return new Attribute("name", null);
    }

    static Attribute _novalidate(String value) {
        return new Attribute("novalidate", value);
    }

    static Attribute _novalidate() {
        return new Attribute("novalidate", null);
    }

    static Attribute _open(String value) {
        return new Attribute("open", value);
    }

    static Attribute _open() {
        return new Attribute("open", null);
    }

    static Attribute _optimum(String value) {
        return new Attribute("optimum", value);
    }

    static Attribute _optimum() {
        return new Attribute("optimum", null);
    }

    static Attribute _pattern(String value) {
        return new Attribute("pattern", value);
    }

    static Attribute _pattern() {
        return new Attribute("pattern", null);
    }

    static Attribute _ping(String value) {
        return new Attribute("ping", value);
    }

    static Attribute _ping() {
        return new Attribute("ping", null);
    }

    static Attribute _placeholder(String value) {
        return new Attribute("placeholder", value);
    }

    static Attribute _placeholder() {
        return new Attribute("placeholder", null);
    }

    static Attribute _poster(String value) {
        return new Attribute("poster", value);
    }

    static Attribute _poster() {
        return new Attribute("poster", null);
    }

    static Attribute _preload(String value) {
        return new Attribute("preload", value);
    }

    static Attribute _preload() {
        return new Attribute("preload", null);
    }

    static Attribute _pubdate(String value) {
        return new Attribute("pubdate", value);
    }

    static Attribute _pubdate() {
        return new Attribute("pubdate", null);
    }

    static Attribute _radiogroup(String value) {
        return new Attribute("radiogroup", value);
    }

    static Attribute _radiogroup() {
        return new Attribute("radiogroup", null);
    }

    static Attribute _readonly(String value) {
        return new Attribute("readonly", value);
    }

    static Attribute _readonly() {
        return new Attribute("readonly", null);
    }

    static Attribute _rel(String value) {
        return new Attribute("rel", value);
    }

    static Attribute _rel() {
        return new Attribute("rel", null);
    }

    static Attribute _required(String value) {
        return new Attribute("required", value);
    }

    static Attribute _required() {
        return new Attribute("required", null);
    }

    static Attribute _reversed(String value) {
        return new Attribute("reversed", value);
    }

    static Attribute _reversed() {
        return new Attribute("reversed", null);
    }

    static Attribute _role(String value) {
        return new Attribute("role", value);
    }

    static Attribute _role() {
        return new Attribute("role", null);
    }

    static Attribute _rows(String value) {
        return new Attribute("rows", value);
    }

    static Attribute _rows() {
        return new Attribute("rows", null);
    }

    static Attribute _rowspan(String value) {
        return new Attribute("rowspan", value);
    }

    static Attribute _rowspan() {
        return new Attribute("rowspan", null);
    }

    static Attribute _sandbox(String value) {
        return new Attribute("sandbox", value);
    }

    static Attribute _sandbox() {
        return new Attribute("sandbox", null);
    }

    static Attribute _scope(String value) {
        return new Attribute("scope", value);
    }

    static Attribute _scope() {
        return new Attribute("scope", null);
    }

    static Attribute _scoped(String value) {
        return new Attribute("scoped", value);
    }

    static Attribute _scoped() {
        return new Attribute("scoped", null);
    }

    static Attribute _seamless(String value) {
        return new Attribute("seamless", value);
    }

    static Attribute _seamless() {
        return new Attribute("seamless", null);
    }

    static Attribute _selected(String value) {
        return new Attribute("selected", value);
    }

    static Attribute _selected() {
        return new Attribute("selected", null);
    }

    static Attribute _shape(String value) {
        return new Attribute("shape", value);
    }

    static Attribute _shape() {
        return new Attribute("shape", null);
    }

    static Attribute _size(String value) {
        return new Attribute("size", value);
    }

    static Attribute _size() {
        return new Attribute("size", null);
    }

    static Attribute _sizes(String value) {
        return new Attribute("sizes", value);
    }

    static Attribute _sizes() {
        return new Attribute("sizes", null);
    }

    static Attribute _span(String value) {
        return new Attribute("span", value);
    }

    static Attribute _span() {
        return new Attribute("span", null);
    }

    static Attribute _spellcheck(String value) {
        return new Attribute("spellcheck", value);
    }

    static Attribute _spellcheck() {
        return new Attribute("spellcheck", null);
    }

    static Attribute _src(String value) {
        return new Attribute("src", value);
    }

    static Attribute _src() {
        return new Attribute("src", null);
    }

    static Attribute _srcdoc(String value) {
        return new Attribute("srcdoc", value);
    }

    static Attribute _srcdoc() {
        return new Attribute("srcdoc", null);
    }

    static Attribute _srclang(String value) {
        return new Attribute("srclang", value);
    }

    static Attribute _srclang() {
        return new Attribute("srclang", null);
    }

    static Attribute _srcset(String value) {
        return new Attribute("srcset", value);
    }

    static Attribute _srcset() {
        return new Attribute("srcset", null);
    }

    static Attribute _start(String value) {
        return new Attribute("start", value);
    }

    static Attribute _start() {
        return new Attribute("start", null);
    }

    static Attribute _step(String value) {
        return new Attribute("step", value);
    }

    static Attribute _step() {
        return new Attribute("step", null);
    }

    static Attribute _style(String value) {
        return new Attribute("style", value);
    }

    static Attribute _style() {
        return new Attribute("style", null);
    }

    static Attribute _summary(String value) {
        return new Attribute("summary", value);
    }

    static Attribute _summary() {
        return new Attribute("summary", null);
    }

    static Attribute _tabindex(String value) {
        return new Attribute("tabindex", value);
    }

    static Attribute _tabindex() {
        return new Attribute("tabindex", null);
    }

    static Attribute _target(String value) {
        return new Attribute("target", value);
    }

    static Attribute _target() {
        return new Attribute("target", null);
    }

    static Attribute _title(String value) {
        return new Attribute("title", value);
    }

    static Attribute _title() {
        return new Attribute("title", null);
    }

    static Attribute _type(String value) {
        return new Attribute("type", value);
    }

    static Attribute _type() {
        return new Attribute("type", null);
    }

    static Attribute _usemap(String value) {
        return new Attribute("usemap", value);
    }

    static Attribute _usemap() {
        return new Attribute("usemap", null);
    }

    static Attribute _value(String value) {
        return new Attribute("value", value);
    }

    static Attribute _value() {
        return new Attribute("value", null);
    }

    static Attribute _width(String value) {
        return new Attribute("width", value);
    }

    static Attribute _width() {
        return new Attribute("width", null);
    }

    static Attribute _wrap(String value) {
        return new Attribute("wrap", value);
    }

    static Attribute _wrap() {
        return new Attribute("wrap", null);
    }

    static Attribute _translate(String value) {
        return new Attribute("translate", value);
    }

    static Attribute _translate() {
        return new Attribute("translate", null);
    }
}
