package ru.job4j.calculator;


import org.junit.Assert;
import org.junit.Test;

public class Fit1Test {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit1.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman180Then80dot5() {
        short in = 180;
        double expected = 80.5;
        double out = Fit1.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}