package ru.job4j.array;

import array.EndsWith1;
import org.junit.Assert;
import org.junit.Test;

public class EndsWith1Test {
    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith1.endsWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith1.endsWith(word, post);
        Assert.assertFalse(result);
    }
}