package com.zy.streams;

import java.util.*;
import java.util.stream.Stream;

public class RandomsGenerators {
    public static <T> void show(Stream<T> s) {
        s.limit(4).forEach(System.out::println);
        System.out.println("+++++++++++++++");
    }
    public static void main(String[] args) {
        Random rand = new Random(47);
        show(rand.ints().boxed());
        show(rand.longs().boxed());
        show(rand.doubles().boxed());
        // control the lower and upper bounds
        show(rand.ints(10, 20).boxed());
        show(rand.longs(10, 20).boxed());
        show(rand.doubles(10, 20).boxed());
        //control the stream size
        show(rand.ints(2).boxed());
        show(rand.longs(2).boxed());
        show(rand.doubles(2).boxed());
        // control the stream size and bounds
        show(rand.ints(3, 10, 20).boxed());
        show(rand.longs(3, 10, 20).boxed());
        show(rand.doubles(3, 10, 20).boxed());
    }
}
