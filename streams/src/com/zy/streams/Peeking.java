package com.zy.streams;

public class Peeking {
    public static void main(String[] args) throws Exception {
        new FileToWordsBuilder("./src/com/zy/streams/Cheese.dat").stream()
//                .skip(21)
//                .limit(4)
                .map(w->w + " ")
                .peek(System.out::print)
//                .peek(w->{System.out.println(w);})
                .map(String::toUpperCase)
                .peek(System.out::print)
                .map(String::toLowerCase)
                .forEach(System.out::print);
    }
}
