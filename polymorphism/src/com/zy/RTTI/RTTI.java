package com.zy.RTTI;

class UseFul {
    public void f() {}
    public void g() {}
}

class MoreUseFul extends UseFul {
    @Override
    public void f() {}
    @Override
    public void g() {}
    public void u() {}
    public void v() {}
    public void w() {}
}

public class RTTI {
    public static void main(String[] args) {
        UseFul[] x = {new UseFul(), new MoreUseFul()};
        x[0].f();
        x[1].g();

//        x[0].u();
        ((MoreUseFul) x[1]).u();
        ((MoreUseFul)x[0]).u();
        MoreUseFul moreUseFul = (MoreUseFul)x[0];
    }
}
