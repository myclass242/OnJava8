package com.zy.collections;

import java.util.*;

public class AddGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInt = {6,7,8,9};
        collection.addAll(Arrays.asList(moreInt));

        // Runs significantly faster, but you can't
        // construct a Collection this way
        Collections.addAll(collection, 11,12,13,14,15);
        Collections.addAll(collection, moreInt);

        // produces a list "backed by" an array
        List<Integer> list = Arrays.asList(16,17,18,19,20);
        list.set(1, 99);
//        list.add(21);

        HashMap<String,String> ss = new HashMap<>();
        LinkedHashMap<String,String> lss = new LinkedHashMap<>();
        LinkedList<String> ls = new LinkedList<>();
        ls.remove("HelloWorld");
//        ls.remove(2);
    }
}
