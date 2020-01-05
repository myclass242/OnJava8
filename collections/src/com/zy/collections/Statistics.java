package com.zy.collections;

import java.util.*;

public class Statistics {
    public static void main(String[] args) {
        Random r = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for (int k = 0; k < 100000; ++k) {
            int key = r.nextInt(20);
            Integer freq = m.get(key);
            m.put(key, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
        Collections.reverseOrder();
    }
}
