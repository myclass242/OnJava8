package com.zu.functional;

import java.util.function.*;

@FunctionalInterface
interface FuncSS extends Function<String, String> {
}

public class ProduceFunction {
    static FuncSS produce() {
        return s->s.toLowerCase();
    }

    public static void main(String[] args) {
        Function<String, String> f = produce();
        System.out.println(f.apply("HELLO"));
    }
}
