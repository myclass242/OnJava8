package com.zy.basic;

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {}
}

class Hero extends ActionCharacter
implements CanFight, CanFly, CanSwim {
    @Override
    public void fly() {}
    @Override
    public void swim() {}
}

public class Adventure {
    public static void t(CanFight t) {t.fight();}
    public static void m(CanSwim m) {m.swim();}
    public static void y(CanFly y) {y.fly();}
    public static void a(ActionCharacter a) {a.fight();}

    public static void main(String[] args) {
        t(new Hero());
        m(new Hero());
        y(new Hero());
        a(new Hero());
    }
}
