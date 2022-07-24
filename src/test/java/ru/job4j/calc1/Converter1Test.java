package ru.job4j.calc1;

import org.junit.Assert;
import org.junit.Test;

public class Converter1Test {

    @Test
    public void  whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter1.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180RblThen3Dollar() {
        float in = 180;
        float expected = 3;
        float out = Converter1.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert0RblThen0Dollar() {
        float in = 0;
        float expected = 0;
        float out = Converter1.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}