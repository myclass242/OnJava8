package com.zy.streams;

import java.nio.file.*;
import java.util.stream.*;
import java.util.regex.Pattern;

public class FileToWords {
    public static Stream<String> stream(String filePath) throws Exception {
        return Files.lines(Path.of(filePath))
                .flatMap(line->Pattern.compile("\\W+").splitAsStream(line));
    }

    public static void main(String[] args) throws Exception {
        FileToWords.stream("./src/com/zy/streams/Cheese.dat")
                .limit(7)
                .forEach(w->System.out.format("%s ", w));
        System.out.println();

        FileToWords.stream("./src/com/zy/streams/Cheese.dat")
                .skip(7)
                .limit(2)
                .forEach(w->System.out.format("%s ", w));
        System.out.println();
    }
}
