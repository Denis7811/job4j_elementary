package ru.job4j.loop;


import org.junit.Assert;
import org.junit.Test;

public class Factorial1Test {
    @Test
    public void whenFactorialFor5Then120() {
        int in = 5;
        int result = Factorial1.calc(in);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenFactorialFor0Then1() {
        int in = 0;
        int result = Factorial1.calc(in);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenFactorialFor0Then3() {
        int in = 3;
        int result = Factorial1.calc(in);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }
}
