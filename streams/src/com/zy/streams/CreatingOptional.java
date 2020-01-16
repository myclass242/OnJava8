package com.zy.streams;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class CreatingOptional {
    static void test(String testName, Optional<String> optString) {
        System.out.println("=== " + testName + " ===");
        System.out.println(optString.orElse("null"));
    }

    public static void main(String[] args) {
        test("empty", Optional.empty());
        test("of", Optional.of("Howdy"));
        try {
            test("of", Optional.of(null));
        } catch (Exception e) {
            System.out.println(e);
        }
        test("ofNullable", Optional.ofNullable("Hi"));
        test("ofNullable", Optional.ofNullable(null));
    }
}
