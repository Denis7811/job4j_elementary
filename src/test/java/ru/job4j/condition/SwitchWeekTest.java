package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void oneMond() {
        int day = 1;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Понедельник";
        Assert.assertEquals(expected, result);
        }

    @Test
    public void eigh() {
        int day = 8;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }
}