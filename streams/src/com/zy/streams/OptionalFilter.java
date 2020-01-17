package com.zy.streams;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class OptionalFilter {
    private String[] elements =
            {"Foo", "", "Bar", "Baz", "Bingo"};
    public Stream<String> stream() {
        return Arrays.stream(elements);
    }
    public void test(String desc, Predicate<String> pred) {
        System.out.println("---(" + desc + ")---");
        for (int i = 0; i <= elements.length; ++i) {
            System.out.println(
                    stream()
                    .skip(i)
                    .findFirst()
                    .filter(pred)
            );
        }
    }

    public static void main(String[] args) {
        OptionalFilter optionalFilter = new OptionalFilter();
        optionalFilter.test("true", s->true);
        optionalFilter.test("false", s->false);
        optionalFilter.test("str != \"\"", s->s!="");
        optionalFilter.test("str.length() == 3", s->s.length()==3);
        optionalFilter.test("startsWith(\"B\")",s->s.startsWith("B"));

    }
}
