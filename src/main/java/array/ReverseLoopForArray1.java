package ru.job4j.array;

public class ReverseLoopForArray1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int i = numbers.length - 1; i >=0 ; i--) {
            System.out.println("с конца: " + numbers[i]);
        }
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("прямой: " + numbers[numbers.length - 1-i]);
        }
    }
}