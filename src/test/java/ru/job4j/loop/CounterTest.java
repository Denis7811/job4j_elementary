package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = CounterEven.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToForThenSix() {
        int start = 1;
        int finish = 4;
        int result = CounterEven.sumByEven(start, finish);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }
}