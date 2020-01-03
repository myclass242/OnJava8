package com.zy.collections;

import java.util.*;
import java.nio.file.*;

public class ReadAllWords {
    public static void main(String[]args) throws Exception {
        List<String> lines = Files.readAllLines(Paths.get("E:\\GIT\\OnJava8\\collections\\src\\com\\zy\\collections\\AddGroups.java"));
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for (String line : lines) {
            for (String word : line.split("\\W+")) {
                if (word.trim().length() > 0) {
                    words.add(word);
//                    System.out.println(word);
                }
            }
        }
        System.out.println(words);
    }
}
