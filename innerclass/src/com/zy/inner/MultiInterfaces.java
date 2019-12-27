package com.zy.inner;

interface A {}
interface B {}

class X implements A,B {}
class Y implements A {
    public B makeB() {
        return new B() {};
    }
}

public class MultiInterfaces {
    public static void takeA(A a) {}
    public static void takeB(B b) {}
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takeA(x);
        takeA(y);
        takeB(x);
        takeB(y.makeB());
    }
}
