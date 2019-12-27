package com.zy.inner;

public class Parcel8 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            @Override
            public int value() {
                return super.value()*47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        System.out.println(p.wrapping(11).value());
        final StringBuilder fs = new StringBuilder("sz");
        System.out.println(fs);
        fs.append(",cs");
        System.out.println(fs);
//        fs = new StringBuilder("xy");
    }
}
