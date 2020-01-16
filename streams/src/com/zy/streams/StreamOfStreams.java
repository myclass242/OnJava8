package com.zy.streams;

import java.util.stream.*;

public class StreamOfStreams {
    public static void main(String[] args) {
        Stream.of(1,2,3,4)
                .map(i->Stream.of("Hello", "World", "!"))
                .forEach(e->System.out.println(e.getClass().getName()));
    }
}
