package com.zy.streams;

import java.util.*;

public class Ramdoms {
    public static void useStream() {
        new Random(47)
                .ints(5,20)
                .distinct()
                .limit(7)
                .sorted()
//                .forEach(i->System.out.println(i));
                .sum();
    }
    public static void useOld() {
        SortedSet<Integer> rints = new TreeSet<>();
        Random r = new Random(47);
        int sum = 0;
        while (rints.size() < 7) {
            int i = r.nextInt(20);
            if (i < 5) {
                continue;
            }
            rints.add(i);
        }
        for (int i : rints) {
            sum += i;
        }
    }
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        final int times = 100000;
        for (int k = 0; k < times; ++k) {
            useStream();
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        startTime = System.nanoTime();
        for (int k = 0; k < times; ++k) {
            useOld();
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }
}
