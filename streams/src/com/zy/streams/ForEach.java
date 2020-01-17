package com.zy.streams;

import java.util.*;

public class ForEach {
    private static final int SZ = 14;

    public static void main(String[] args) {
        RandomInts.rands().limit(SZ)
                .forEach(i->System.out.format("%d ", i));
        System.out.println();

        RandomInts.rands().limit(SZ)
                .parallel()
                .forEach(i->System.out.format("%d ", i));
        System.out.println();

        RandomInts.rands().limit(SZ)
                .parallel()
                .forEachOrdered(i->System.out.format("%d ", i));
        System.out.println();
    }
}
