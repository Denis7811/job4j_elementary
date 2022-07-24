package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelected1Test {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected1.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf5elements11125() {
        int[] data = new int[] {1, 1, 1, 2, 5};
        int[] result = SortSelected1.sort(data);
        int[] expected = new int[] {1, 1, 1, 2, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements11125() {
        int[] data = new int[] {10, 1, 5};
        int[] result = SortSelected1.sort(data);
        int[] expected = new int[] {1, 5, 10};
        Assert.assertArrayEquals(expected, result);
    }
}