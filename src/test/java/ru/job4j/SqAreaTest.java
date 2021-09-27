package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
            public void whenP6K2Square2() {
            double expected = 2;
            double p = 6;
            double k = 2;
            double out = SqArea.square(p, k);
            Assert.assertEquals(expected, out, 0.01);
        }

    @Test//1
    public void whenP1K1Square00625() {
        double expected = 0.0625;
        double p = 1;
        double k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test//2
    public void whenP2K2Square02222() {
        double expected = 0.2222;
        double p = 2;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}