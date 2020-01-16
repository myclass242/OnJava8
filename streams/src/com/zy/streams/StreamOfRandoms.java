package com.zy.streams;

import java.util.*;
import java.util.stream.*;

public class StreamOfRandoms {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Stream.of(1,2,3,4,5)
                .flatMapToInt(i->IntStream.concat(rand.ints(0, 100).limit(i), IntStream.of(-1)))
                .forEach(n->System.out.format("%d ", n));
    }
}
