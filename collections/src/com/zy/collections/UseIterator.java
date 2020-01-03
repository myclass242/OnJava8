package com.zy.collections;

import java.util.*;

public class UseIterator {
    public static void display(Iterator<Integer> iter) {
        while (iter.hasNext()) {
            System.out.print(iter.next());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5};
        List<Integer> al = new ArrayList<>(Arrays.asList(array));
        display(al.iterator());
        al.listIterator();
        List<Integer> ll = new LinkedList<>(Arrays.asList(array));
        display(ll.iterator());
        Set<Integer> hs = new HashSet<>(Arrays.asList(array));
        display(hs.iterator());
        Set<Integer> ts = new TreeSet<>(Arrays.asList(array));
        display(ts.iterator());
    }
}
