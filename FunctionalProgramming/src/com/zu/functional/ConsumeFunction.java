package com.zu.functional;

import java.util.function.*;

class One{}
class Two{}

public class ConsumeFunction {
    static Two consume(Function<One, Two> oneTwo) {
        return oneTwo.apply(new One());
    }
    public static void main(String[] args) {
        consume(one->new Two());
    }
}
