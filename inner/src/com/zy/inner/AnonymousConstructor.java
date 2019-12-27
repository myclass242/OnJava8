package com.zy.inner;

abstract class Base {
    public Base() {
        System.out.println("Base constructor");
    }
    public abstract void f();
}

public class AnonymousConstructor {
    public Base base() {
        return new Base() {
            {
                System.out.println("inside anonymous instance initialization");
            }
            @Override
            public void f() {
                System.out.println("anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        AnonymousConstructor a = new AnonymousConstructor();
        Base b = a.base();
        b.f();
    }
}
