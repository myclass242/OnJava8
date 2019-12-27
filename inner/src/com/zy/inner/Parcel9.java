package com.zy.inner;

public class Parcel9 {
    public Destination destination(final String whereTo) {
        return new Destination() {
            private String label = whereTo;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        System.out.println(p.destination("sz").readLabel());
    }
}
