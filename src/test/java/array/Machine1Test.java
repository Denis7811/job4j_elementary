package array;

import org.junit.Assert;
import org.junit.Test;

public class Machine1Test {

    @Test
    public void whenEquals() {
        int money = 100;
        int price = 100;
        int[] result = Machine1.change(money, price);
        int[] expected = {};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when50by35() {
        int money = 50;
        int price = 35;
        int[] result = Machine1.change(money, price);
        int[] expected = {10, 5};
        Assert.assertArrayEquals(expected, result);
    }
}