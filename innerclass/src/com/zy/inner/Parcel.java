package com.zy.inner;

public class Parcel {
    class Content {
        private int value;
        Content() {
            value = 11;
        }
        public int f() {
            return value;
        }
    }
    public void ship() {
        Content content = new Content();
        System.out.println(content.f());
    }
    private Content content() {
        return new Content();
    }

    public static void main(String[] args) {
        Parcel p = new Parcel();
        p.ship();
        Content c = p.content();
        System.out.println(c.f());
    }
}
