package com.zu.functional;

import java.util.function.*;

class Dog {
    String name;
    int age = -1;
    Dog() {
        name = "stray";
    }
    Dog(String name) {
        this.name = name;
    }
    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

@FunctionalInterface
interface MakeNoArgs {
    Dog make();
}

@FunctionalInterface
interface MakeOneArgs {
    Dog make(String name);
}

@FunctionalInterface
interface MakeTwoArgs {
    Dog make(String name, int age);
}

public class CtorReferences {
    public static void main(String[] args) {
        MakeNoArgs makeNoArgs = Dog::new;
        MakeOneArgs makeOneArgs = Dog::new;
        MakeTwoArgs makeTwoArgs = (name, age) -> new Dog(name, age);
        Dog dn = makeNoArgs.make();
        Dog d1 = makeOneArgs.make("Coment");
        Dog d2 = makeTwoArgs.make("Ralph", 4);
    }
}
