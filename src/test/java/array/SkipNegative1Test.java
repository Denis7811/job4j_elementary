package array;

import org.junit.Test;

import org.junit.Assert;

public class SkipNegative1Test {

    @Test
    public void whenArrayRowAndColumnEquals() {
        int[][] array = {
                {1, -2},
                {1, 2}
        };
        int[][] result = SkipNegative1.skip(array);
        int[][] expected = {
                {1, 100},
                {1, 2}
        };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenArrayRow4AndColumnNotEquals() {
        int[][] array = {
                {1, -2},
                {1, 2, -3},
                {1, -2, 3, -4},
                {1, 2, -3, -4, 5}
        };
        int[][] result = SkipNegative1.skip(array);
        int[][] expected = {
                {1, 100},
                {1, 2, 100},
                {1, 100, 3, 100},
                {1, 2, 100, 100, 5}
        };
        Assert.assertArrayEquals(expected, result);
    }
}