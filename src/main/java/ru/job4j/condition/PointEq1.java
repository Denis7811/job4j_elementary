package ru.job4j.condition;

public class PointEq1 {
    public static boolean eq(int x1, int y1, int x2, int y2) {
                return x1-x2==0&&y1-y2==0;
    }

    public static void main(String[] args) {
        System.out.println(eq(1, 5, 1, 5));
        System.out.println(eq(10, 1, 10, 10));
    }
}

