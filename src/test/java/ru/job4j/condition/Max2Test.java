package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class Max2Test {

    @Test
    public void whenL1R2To2() {
        int left=1;
        int right=2;
        int exp=2;
        int out=Max2.max(left,right);
        Assert.assertEquals(exp,out);
    }
    @Test
    public void whenL10R2To10() {
        int left=10;
        int right=2;
        int exp=10;
        int out=Max2.max(left,right);
        Assert.assertEquals(exp,out);
    }
    @Test
    public void whenL10R10To10() {
        int left=10;
        int right=10;
        int exp=10;
        int out=Max2.max(left,right);
        Assert.assertEquals(exp,out);
    }
}