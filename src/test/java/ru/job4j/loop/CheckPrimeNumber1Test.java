package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CheckPrimeNumber1Test {

    @Test
    public void when5() {
        int number = 5;
        boolean result = CheckPrimeNumber1.check(number);
        Assert.assertTrue(result);
    }

    @Test
    public void when4() {
        int number = 4;
        boolean result = CheckPrimeNumber1.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when1() {
        int number = 1;
        boolean result = CheckPrimeNumber1.check(number);
        Assert.assertFalse(result);
    }
    @Test
    public void when0() {
        int number = 0;
        boolean result = CheckPrimeNumber1.check(number);
        Assert.assertFalse(result);
    }
    public void when17() {
        int number = 17;
        boolean result = CheckPrimeNumber1.check(number);
        Assert.assertTrue(result);
    }
}