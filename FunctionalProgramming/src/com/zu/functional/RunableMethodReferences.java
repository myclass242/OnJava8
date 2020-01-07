package com.zu.functional;

class Go {
    static void go() {
        System.out.println("Go::go");
    }
}

public class RunableMethodReferences {
    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Anomymous");
            }
        }).start();

        new Thread(()->System.out.println("Lambda")).start();
        new Thread(Go::go).start();
    }
}
