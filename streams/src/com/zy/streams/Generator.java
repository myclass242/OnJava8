package com.zy.streams;

import java.util.stream.*;
import java.util.function.*;
import java.util.*;

public class Generator implements Supplier<String> {
    private Random rand = new Random(47);
    private char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    @Override
    public String get() {
        return "" + letters[rand.nextInt(letters.length)];
    }

    public static void main(String[] args) {
        String words = Stream.generate(new Generator())
                .limit(30)
                .map(s->s.toLowerCase())
                .collect(Collectors.joining(""));
        System.out.println(words);

        Stream.generate(()->"duplicate")
                .limit(3)
                .forEach(System.out::println);
    }
}
