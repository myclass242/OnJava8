/*
*  Template method design pattern
* */

package com.zy.basic;

interface Operations {
    void execute();
    static void runOps(Operations... ops) {
        for (Operations operations : ops) {
            operations.execute();
        }
    }
    static void show(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Operations.runOps(new Bing(), new Crack(), new Twist());
        Operations.runOps(new Crack(), new Twist());
    }
}

class Bing implements Operations {
    @Override
    public void execute() {
        System.out.println("bing");
    }
}

class Crack implements Operations {
    @Override
    public void execute() {
        System.out.println("crack");
    }
}

class Twist implements Operations {
    @Override
    public void execute() {
        System.out.println("twist");
    }
}
