package ru.job4j.calc1;

public class Mfan1 {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;

    }
    public static int func2(int x) {
        int y = 1 / x;
        return y;

    }

    public static void main(String[] args) {
        int result1 = Mfan1.func1(100);
        int result2 = Mfan1.func2(5);
        int total = result1 + result2;
        System.out.println(total);
    }
}
