package ru.job4j.calc1;

public class CalcMet {
    public static void plus(int first, int second){
        int result=first+second;
        System.out.println(result);
    }
    public static void main(String[] args){
        CalcMet.plus(100,500);
        CalcMet.plus(4,2);
        CalcMet.plus(3, 5);
    }
}
