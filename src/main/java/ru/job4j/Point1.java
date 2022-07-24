package ru.job4j;

public class Point1 {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point1.distance(1, 1, 0, 0);
        System.out.println("result  " + result);
        int first=1;
        int second = 2;
        boolean result1=first!=second;
        System.out.println("сравнение "+result1);
    }
}
