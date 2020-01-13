package com.zy.streams;

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class FileToWordsBuilder {
    private Stream.Builder<String> builder = Stream.builder();
    public FileToWordsBuilder(String fname) throws Exception {
        Files.lines(Path.of(fname))
                .skip(1)
                .forEach(line->{
                    for (String w : line.split("[.?,]+]")) {
                        builder.add(w);
                    }
                });
    }
    public void add(String word) {
        builder.add(word);
    }
    public Stream<String> stream() {
        return builder.build();
    }

    public static void main(String[] args) throws Exception {
        new FileToWordsBuilder("./src/com/zy/streams/Cheese.dat").stream()
                .limit(7)
                .map(w->w+" ")
                .forEach(System.out::println);
    }
}
