package com.zy.streams;

import java.util.*;
import java.util.stream.*;
import java.nio.file.*;

public class TreeSetOfWords {
    public static void main(String[] args) throws Exception {
        Set<String> words = Files.lines(Path.of("./src/com/zy/streams/TreeSetOfWords.java"))
                .flatMap(line->Arrays.stream(line.split("\\W+")))
                .filter(w->!w.matches("\\d+"))  // no numbers
                .map(String::trim)
                .filter(w->w.length()>2)
                .limit(100)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(words);
    }
}
