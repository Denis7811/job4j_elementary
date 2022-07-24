package ru.job4j.calculator;

public class Fit1 {
    public static double manWeight(short height) {
        double rsl = (height-100)*1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height-110)*1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = Fit1.manWeight(height);
        System.out.println("Man 180 is " + man);
        double woman = Fit1.womanWeight(height);
        System.out.println("Woman 180 is " + woman);
    }
}
