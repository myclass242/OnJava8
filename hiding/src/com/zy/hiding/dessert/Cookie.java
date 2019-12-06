package com.zy.hiding.dessert;

public class Cookie {
    private Cookie() {
        System.out.println("Cookie()");
    }
    protected Cookie(int i) {
        System.out.println("Cookie(int)");
    }
    public Cookie(double d) {
        System.out.println("Cookie(double)");
    }
    Cookie(float f) {
        System.out.println("Cookie(float");
    }
    void bite() {
        System.out.println("Cookie.bite()");
    }
    protected void bite(int i) {
        System.out.println("bite(int)");
    }
}
