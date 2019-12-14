package com.zy.finall;

class Poppet {
    private int i;
    Poppet(int i) {
        this.i = i;
    }
}

public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet p;

    public BlankFinal() {
        j = 1;
        p = new Poppet(j);
        System.out.println(j);
    }
    public BlankFinal(int x) {
        j = x;
        p = new Poppet(j);
        System.out.println(j);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}
