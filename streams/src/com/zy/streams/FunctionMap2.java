package com.zy.streams;

import java.util.function.*;
import java.util.stream.*;

class Numbered {
    final int n;
    Numbered(int n) {
        this.n = n;
    }
    @Override
    public String toString() {
        return "Numbered(" + n + ")";
    }
}

public class FunctionMap2 {
    public static void main(String[] args) {
        Stream.of(1, 3, 5, 7, 9, 11)
//                .map(Numbered::new)
                .map(i->new Numbered(i))
                .forEach(System.out::println);
    }
}
