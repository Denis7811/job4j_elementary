package ru.job4j.loop;

public class Factorial1 {
    public static int calc(int n) {
        int calc = 1;
        for (int i = 1; i <= n; i++) {
            calc = calc * i;
        }
        return calc;
    }
}
