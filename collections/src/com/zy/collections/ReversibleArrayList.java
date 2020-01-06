package com.zy.collections;

import java.util.*;

public class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c) {
        super(c);
    }
    public Iterable<T> reversed() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    private int current = size() - 1;
                    @Override
                    public boolean hasNext() {
                        return current >= 0;
                    }
                    @Override
                    public T next() {
                        return get(current--);
                    }
                };
            }
        };
    }

    public static void main(String[] args) {
        ReversibleArrayList<String> rls = new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
        for (String s : rls) {
            System.out.println(s);
        }
        for (String s : rls.reversed()) {
            System.out.println(s);
        }
    }
}
