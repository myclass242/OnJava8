package com.zy.basic;

public interface PureInterface {
    int m1();
    void m2();
    double m3();
}

interface Concept {
    void idea1();
    void idea2();
}

class Implementation implements PureInterface, Concept {
    @Override
    public int m1() { return 111; }
    @Override
    public void m2() {}
    @Override
    public double m3() { return 3.14; }

    @Override
    public void idea1() {}
    @Override
    public void idea2() {}
}