package com.asela.fibonacci.logic;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciLogicTest {

    private FibonacciLogic logic;

    @Before
    public void init() {
        logic = new FibonacciLogic();
    }

    @Test
    public void testBruteForceFibonacci() {
        int[] expectedFibonacci = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        for (int i = 1; i <= expectedFibonacci.length; i++) {
            Assert.assertEquals(expectedFibonacci[i - 1], logic.fibonacci(i));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBruteForceFibonacci_forNumbersLessThan1ShouldThrowException() {
        logic.fibonacci(0);
    }

}
