package array;

import org.junit.Assert;
import org.junit.Test;

public class Square1Test {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] result = Square1.calculate(bound);
        int[] expected = new int[] {0, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }
    @Test
    public void whenBound2Then01() {
        int bound = 2;
        int[] result = Square1.calculate(bound);
        int[] expected = new int[] {0, 1};
        Assert.assertArrayEquals(expected, result);
    }
}