package com.zu.functional;

public class RecursiveFibonacci {
    IntCall fib;
    RecursiveFibonacci() {
        fib = n->{
            if (n <= 1) {
                return n;
            }
            return fib.call(n - 1) + fib.call(n - 2);
        };
    }
    int fibnacci(int n) {
        return fib.call(n);
    }

    public static void main(String[] args) {
        RecursiveFibonacci recursiveFibonacci = new RecursiveFibonacci();
        for (int i = 0; i < 10; ++i) {
            System.out.println(recursiveFibonacci.fibnacci(i));
        }
    }
}
