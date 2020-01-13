package com.zy.streams;

import java.util.stream.*;

public class Bubble {
    private final int id;
    private static int count = 0;
    Bubble(int i) {
        id = i;
    }
    @Override
    public String toString() {
        return "Bubble(" + id + ")";
    }
    public static Bubble bubble() {
        return new Bubble(count++);
    }

    public static void main(String[] args) {
        Stream.generate(Bubble::bubble)
                .limit(30)
                .forEach(System.out::println);

        Stream.generate(()->Bubble.bubble())
                .limit(30)
                .forEach(b->System.out.println(b));
    }
}
