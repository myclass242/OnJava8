package com.zy.privateoverride;

public class PrivateOverride {
    private void f() {
        System.out.println("Private PrivateOverride.f()");
    }
    public static void main(String[] args) {
        PrivateOverride privateOverride = new Drived();
        privateOverride.f();
    }
}

class Drived extends PrivateOverride {
//    @Override
    public void f() {
        System.out.println("public Drived.f()");
    }
}
