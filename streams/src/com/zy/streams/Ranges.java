package com.zy.streams;

import static java.util.stream.IntStream.*;


public class Ranges {
    public static void repeat(int n, Runnable action) {
        range(0, n).forEach(i->action.run());
    }
    public static void hi() {
        System.out.println("hi!");
    }
    public static void main(String[] args) {
        // Thr traditional way
        int result = 0;
        for (int i = 10; i < 20; ++i) {
            result += i;
        }
        System.out.println(result);

        // for-in with range
        result = 0;
        for (int i : range(10, 20).toArray()) {
            result += i;
        }
        System.out.println(result);

        // Use streams
        System.out.println(range(10, 20).sum());

        repeat(3, Ranges::hi);
        repeat(3, ()->System.out.println("HI!"));
    }
}
