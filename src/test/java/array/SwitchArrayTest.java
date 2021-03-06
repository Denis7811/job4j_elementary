package array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenStringSwap0to2() {
        String[] input = {"I", null, "wanna"};
        int source = 0;
        int dest = 1;
        String[] result = SwitchArray.swapString(input, source, dest);
        String[] expected = {null, "I", "wanna"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to2() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {3, 2, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap4to3() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 4;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 5, 4};
        Assert.assertArrayEquals(expected, result);
    }
}