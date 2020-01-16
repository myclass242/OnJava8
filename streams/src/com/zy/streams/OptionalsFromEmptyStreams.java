package com.zy.streams;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptionalsFromEmptyStreams {
    static <T> void optionTest(Optional<T> opt) {
        if (opt.isPresent()) {
            System.out.println(opt.get());
        } else {
            System.out.println("Nothing inside");
        }
    }

    public static void main(String[] args) {
        System.out.println(Stream.<String>empty().findFirst());
        System.out.println(Stream.<String>empty().findAny());
        System.out.println(Stream.<String>empty().max(String.CASE_INSENSITIVE_ORDER));
        System.out.println(Stream.<String>empty().min(String.CASE_INSENSITIVE_ORDER));
        System.out.println(Stream.<String>empty().reduce((s1, s2) -> s1 + s2));
        System.out.println(IntStream.empty().average());

        optionTest(Stream.of("Hello").findFirst());
        optionTest(Stream.<String>empty().findAny());
    }
}
