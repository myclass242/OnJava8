package com.zy.streams;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import static com.zy.streams.RandomInts.*;

interface Matcher extends BiPredicate<Stream<Integer>, Predicate<Integer>>
{}

public class Maching {
    static void show(Matcher matcher, int val) {
        System.out.println(
                matcher.test(IntStream.rangeClosed(1, 9)
                .boxed()
                .peek(n->System.out.format("%d ", n)),
                n->n<val)
        );
    }

    public static void main(String[] args) {
        show(Stream::allMatch, 10);
        show(Stream::allMatch, 4);
        show(Stream::anyMatch, 2);
        show(Stream::anyMatch, 0);
        show(Stream::noneMatch, 5);
        show(Stream::noneMatch, 0);
    }
}
