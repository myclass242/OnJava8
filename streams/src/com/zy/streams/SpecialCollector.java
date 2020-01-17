package com.zy.streams;

import java.util.*;
import java.util.stream.*;

public class SpecialCollector {
    public static void main(String[] args) throws Exception {
        ArrayList<String> words =
                FileToWords.stream("./src/com/zy/streams/Cheese.dat")
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        words.stream()
                .filter(w->w.equals("cheese"))
                .forEach(System.out::println);
    }
}
