package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;


public class DummyBot1Test {

    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот.";
        String result = DummyBot1.answer(in);
        String expected = "Привет, умник.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenByeBot() {
        String in = "Пока.";
        String result = DummyBot1.answer(in);
        String expected = "До скорой встречи.";
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenUnknowBot() {
        String in = "Как чего?";
        String result = DummyBot1.answer(in);
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        Assert.assertEquals(expected, result);
    }
}