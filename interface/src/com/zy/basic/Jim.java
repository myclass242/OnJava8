package com.zy.basic;

interface Jim1 {
    default void jim() {
        System.out.println("Jim1.jim()");
    }
}

interface Jim2 {
    default void jim() {
        System.out.println("Jim2.jim()");
    }
}

public class Jim implements Jim1, Jim2 {
    public static void main(String[] args) {
        Jim jim = new Jim();
        jim.jim();
    }

    @Override
    public void jim() {
        System.out.println("Jim.jim()");
        Jim2.super.jim();
    }
}
