package com.zy.streams;

import java.util.stream.*;
import java.util.*;

public class LastElement {
    public static void main(String[] args) {
        OptionalInt optionalInt = IntStream.range(10, 20)
                .reduce((n1, n2)->n2);
        System.out.println(optionalInt.orElse(-1));

        Optional<String> optionalS = Stream.of("one", "two", "three")
                .reduce((s1, s2)->s2);
        System.out.println(optionalS.orElse("Nothing there"));
    }
}
