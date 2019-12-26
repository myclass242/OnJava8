package com.zy.basic;

public abstract class Basic {
    abstract void g();
//    void k();

    public static void main(String[] args) {
//        new Basic2();
//        new Basic3();
    }
}

abstract class Basic2 extends Basic {
    int f() { return 111; }
//    @Override
//    void g() {}
}

abstract class Basic3 {
    int f() { return 111; }
}