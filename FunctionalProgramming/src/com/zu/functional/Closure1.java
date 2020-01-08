package com.zu.functional;

import java.util.function.*;
import java.util.*;

public class Closure1 {
    int i;
    public IntSupplier makeFunc(int x) {
        return ()->x+i++;
    }
    public IntSupplier makeFuncUseLocal(int x) {
        int i = 47;
        System.out.println(i);
//        System.out.println();
        return ()->x + i;
    }
    public IntSupplier makeFuncUseRefference(int x) {
        Integer i = 0;
//        i++;
        return ()->x + i;
    }
    public Supplier<List<Integer>> makeFuncList() {
        final List<Integer> li = new ArrayList<>();
        li.add(1);
        return ()->{
            li.add(2);
            return li;
        };
    }

    public static void main(String[] args) {
        Closure1 c1 = new Closure1();
        IntSupplier is = c1.makeFunc(5);
        System.out.println(is.getAsInt());
        System.out.println(c1.i);

        IntSupplier c2 = c1.makeFuncUseLocal(5);
        System.out.println(c2.getAsInt());

//        final List<Integer> fli = new LinkedList<>();
//        fli = new LinkedList<>();
    }
}
