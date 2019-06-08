package com.asela.fibonacci.logic;

public class FibonacciLogic {

    public  int fibonacci(int n) {
        if (n < 1)
            throw new IllegalArgumentException("Fibonacci is not defined for Natural numbers. (" + n + ") is not Natural");
        if (n < 3)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
