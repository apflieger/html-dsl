package com.meetinclass.html;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Attributes {

    List<Attribute> attributes;

    Attributes(Attribute... attributes) {
        this.attributes = Stream.of(attributes).filter(Objects::nonNull).toList();
    }

    Attributes withClassName(String className) {
        if (className.contains(".") || className.contains("#"))
            // Migrating from j2html to this package, we might forget to rewrite classnames that are prefixed with dots in j2html
            throw new RuntimeException("Class names should not contain '.' or '#'");
        var attrs = new ArrayList<Attribute>();
        attrs.add(new Attribute("class", className));
        attrs.addAll(attributes);
        this.attributes = attrs;
        return this;
    }
}
