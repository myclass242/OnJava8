package com.zy.basic;

interface AnInterface {
    void method1();
    void method2();
    default void method3() {
        System.out.println("method3()");
    }
}

public class AnImplementation implements AnInterface {
    @Override
    public void method1() {
        System.out.println("method1()");
    }
    @Override
    public void method2() {
        System.out.println("method2()");
    }

    public static void main(String[] args) {
        AnInterface anInterface = new AnImplementation();
        anInterface.method1();
        anInterface.method2();
        anInterface.method3();
    }
}
