package com.zu.functional;

import java.util.function.*;

public class AnonymousClosure {
    public IntSupplier makeFun(int x) {
//        x++;
        int i = 0;
//        ++i;
        return new IntSupplier() {
            @Override
            public int getAsInt() {
                return x + i;
            }
        };
    }
}
