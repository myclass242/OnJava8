package com.zy.hiding.dessert;

class Test {
    public Test() {
        System.out.println("Test()");
    }
    public static void main(String[] args) {
        new Cookie(1);
        new Cookie(3.14);
        new Cookie(3.14f);
        new Test();
    }
}
