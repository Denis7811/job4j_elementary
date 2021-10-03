package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        int i;
        for (i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum1 = 0;
        int i;
        for (i = start; i <= finish; i++) {
            if ((i % 2) == 0) {
                sum1 = sum1 + i;
            }
        }
        return sum1;
    }
}
