package ru.job4j;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = k * h;
        double rsl = l * h;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(2, 2);
        System.out.println(" p = 1, k = 1, s = 2, real = " + result1);
    }
}
