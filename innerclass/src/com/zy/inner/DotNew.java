package com.zy.inner;

public class DotNew {
    public class Inner {}

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        Inner inner = dotNew.new Inner();
    }
}
