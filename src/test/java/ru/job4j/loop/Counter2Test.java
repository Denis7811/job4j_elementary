package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class Counter2Test {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter2.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenSumEvenNumbersFrom0To4Then6y() {
        int start = 0;
        int finish = 4;
        int result = Counter2.sumByEven(start, finish);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }
}