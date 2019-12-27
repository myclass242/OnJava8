package com.zy.inner;

class Parcel4 {
    private class PContents implements Contents {
        private final int i = 11;
        @Override
        public int value() {
            return i;
        }
    }
    protected final class PDestination implements Destination {
        private String label;
        private PDestination(String whereTo) {
            label = whereTo;
        }
        PDestination() {
            label = "shenzhen";
        }
        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String whereTo) {
        return new PDestination(whereTo);
    }
    public Contents contents() {
        return new PContents();
    }
}

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("shenzhen");
//        Contents c2 = p.new Parcel4.PContents();
        Destination d2 = p.new PDestination();
    }
}
