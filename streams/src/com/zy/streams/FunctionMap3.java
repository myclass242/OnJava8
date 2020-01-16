package com.zy.streams;

import java.util.stream.*;

public class FunctionMap3 {
    public static void main(String[] args) {
        Stream.of("5", "7", "9")
                .mapToInt(Integer::parseInt)
                .forEach(i->System.out.format("%d ", i));
        System.out.println();
    }
}
