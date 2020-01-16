package com.zy.streams;

import java.util.stream.*;

public class FlatMap {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .flatMap(i->Stream.of("Hello", "World"))
                .forEach(e->System.out.println(e));
    }
}
