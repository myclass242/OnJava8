package com.zu.functional;

interface Description {
    String brief();
}

interface Body {
    String detailed(String head);
}

interface Multi {
    String twoArgs(String head, Double d);
}

public class LambdaExpression {
    static Body body1 = h->h + "No Parens!";
    static Body body2 = (h)->h + "More details";
    static Description desc = ()->"Short info";
    static Multi multi = (h, d)->h + d;
    static Description moreLines = ()->{
        System.out.println("moreLines()");
        return "from moreLines()";
    };

    public static void main(String[] args) {
        System.out.println(body1.detailed("Oh!"));
        System.out.println(body2.detailed("Hi!"));
        System.out.println(desc.brief());
        System.out.println(multi.twoArgs("Pi!", 3.1415926));
        System.out.println(moreLines.brief());
    }
}
