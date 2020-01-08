package com.zu.functional;

import java.util.function.*;
import java.util.*;

public class Closure9 {
    public Supplier<List<Integer>> makeFunc() {
        List<Integer> li = new ArrayList<>();
//        li.add(11);
//        li = new LinkedList<>();
//        li.add(12);

        return ()->li;
    }
}
