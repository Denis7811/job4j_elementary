package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int result = Factorial.calc(n);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int result = Factorial.calc(n);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int n = 1;
        int result = Factorial.calc(n);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForTwoThenTwo() {
        int n = 2;
        int result = Factorial.calc(n);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForThreThenSix() {
        int n = 3;
        int result = Factorial.calc(n);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }
}