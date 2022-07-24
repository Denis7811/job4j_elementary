package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class Point1Test {
    @Test
    public void when01to01then0() {
        double expected = 0;
        int x1 = 0;
        int y1 = 1;
        int x2 = 0;
        int y2 = 1;
        double out = Point1.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when01to00then1() {
        double expected = 1;
        int x1 = 0;
        int y1 = 1;
        int x2 = 0;
        int y2 = 0;
        double out = Point1.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when11to00then141() {
        double expected = 1.41;
        int x1 = 1;
        int y1 = 1;
        int x2 = 0;
        int y2 = 0;
        double out = Point1.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}


