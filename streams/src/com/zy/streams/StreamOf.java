package com.zy.streams;

import java.util.*;
import java.util.stream.Stream;

public class StreamOf {
    public static void main(String[] args) {
        Stream.of("It's", "a", "wonderful", "day", "for", "pie")
                .map(s->s + " ")
                .forEach(System.out::print);

        Stream.of(3.1, 4.2, 5.3).forEach(i->System.out.println(i));
    }
}
