package com.zy.inner;

public class DotThis {
    public void f() {
        System.out.println("DotThis.f()");
    }
    class Inner {
        DotThis outer() {
            return DotThis.this;
        }
    }
    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        Inner inner = dotThis.inner();
        inner.outer().f();
        System.out.println(inner.outer().inner());
        System.out.println(inner);
    }
}
