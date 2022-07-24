package ru.job4j.array;

import array.ArrayChar1;
import org.junit.Assert;
import org.junit.Test;

public class ArrayChar1Test {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar1.startsWith(word, pref);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar1.startsWith(word, pref);
        Assert.assertFalse(result);
    }
}