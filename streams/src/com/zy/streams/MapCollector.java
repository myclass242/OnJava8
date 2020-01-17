package com.zy.streams;

import java.util.*;
import java.util.stream.*;

class Pair {
    private final Character c;
    private final Integer i;
    public Pair(Character c, Integer i) {
        this.c = c;
        this.i = i;
    }
    public Character getC() {
        return c;
    }
    public Integer getI() {
        return i;
    }
    @Override
    public String toString() {
        return "Pair(" + c + "," + i + ")";
    }
}

class RandomPair {
    Random rand = new Random(47);
    // An infinite iterator of random capital letters
    Iterator<Character> capChars = rand.ints(65, 91)
            .mapToObj(i->(char)i)
            .iterator();

    public Stream<Pair> stream() {
        return rand.ints(100, 1000).distinct()
                .mapToObj(i->new Pair(capChars.next(), i));
    }
}

public class MapCollector {
    public static void main(String[] args) {
        Map<Integer, Character> map = new RandomPair().stream()
                .limit(8)
                .collect(Collectors.toMap(pair->pair.getI(), Pair::getC));
        System.out.println(map);
    }
}
