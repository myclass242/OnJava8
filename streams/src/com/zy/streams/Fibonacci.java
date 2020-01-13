package com.zy.streams;

import java.util.stream.*;

public class Fibonacci {
    int x = 1;
    Stream<Integer> numbers() {
        return Stream.iterate(0, i->{
            int result = x + i;
            x = i;
            return result;
        });
    }

    public static void main(String[] args) {
        new Fibonacci().numbers()
                .skip(20)   // don't use the first 20
                .limit(10)  // then take 10 of them
                .forEach(System.out::println);
    }
}
