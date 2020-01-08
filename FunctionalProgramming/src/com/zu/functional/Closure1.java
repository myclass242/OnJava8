package com.zu.functional;

import java.util.function.*;

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

    public static void main(String[] args) {
        Closure1 c1 = new Closure1();
        IntSupplier is = c1.makeFunc(5);
        System.out.println(is.getAsInt());
        System.out.println(c1.i);

        IntSupplier c2 = c1.makeFuncUseLocal(5);
        System.out.println(c2.getAsInt());
    }
}
