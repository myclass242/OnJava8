package com.zy.inner;

public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private final int id = 11;
            @Override
            public int value() {
                return id;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        System.out.println(p.contents().value());
    }
}
