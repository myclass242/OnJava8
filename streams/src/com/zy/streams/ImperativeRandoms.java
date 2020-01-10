package com.zy.streams;

import java.util.*;

public class ImperativeRandoms {
    public static void main(String[] args) {
        SortedSet<Integer> rints = new TreeSet<>();
        Random r = new Random(47);
        while (rints.size() < 7) {
            int i = r.nextInt(20);
            if (i < 5) {
                continue;
            }
            rints.add(i);
        }
        for (int i : rints) {
            System.out.println(i);
        }
    }
}
