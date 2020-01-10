package com.zu.functional;

interface Callable {
    void call(String s);
}

class Describe {
    void show(String msg) {
        System.out.println(msg);
    }
}

public class MethodReferences {
    static void hello(String name) {
        System.out.println("Hello " + name);
    }
    static class Description {
        String about;
        Description(String about) {
            this.about = about;
        }
        void help(String msg) {
            System.out.println(about + " " + msg);
        }
    }
    static class Helper {
        static void assist(String msg) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        Callable c = new Describe()::show;
        c.call("call()");
        Describe d = new Describe();
        c = d::show;
        c.call("call()");
        c = MethodReferences::hello;
        c.call("bob");
        {
            c = new Description("valuable")::help;
        }
        c.call("information");
        c = Helper::assist;
        c.call("Help");
    }
}