package com.zy.inner;

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private Object[] items;
    private int next;
    public Sequence(int size) {
        items = new Object[size];
        next = 0;
    }
    public void add(Object o) {
        if (next < items.length) {
            items[next++] = o;
        }
    }
    private class SequenceSelector implements Selector {
        private int index = 0;
        @Override
        public boolean end() {
            return index == items.length;
        }
        @Override
        public Object current() {
            return items[index];
        }
        @Override
        public void next() {
            if (index < items.length) {
                ++index;
            }
        }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
//    public static Selector static_selector() {
//        return new SequenceSelector();
//    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int k = 0; k < 10; ++k) {
            sequence.add(Integer.toString(k));
        }
        Selector selector1 = sequence.selector();
        while (!selector1.end()) {
            System.out.println((String)selector1.current());
            selector1.next();
        }
        Selector selector2 = sequence.selector();
        while (!selector2.end()) {
            System.out.println((String)selector2.current());
            selector2.next();
        }
    }
}
