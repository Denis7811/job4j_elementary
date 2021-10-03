package ru.job4j.loop;

public class Counter1 {
    public static int sum1(int start, int finish) {
        int sum = 0;
        int i;
        for (i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum1(0, 10));
        System.out.println(sum1(3, 8));
        System.out.println(sum1(1, 1));
    }
}
