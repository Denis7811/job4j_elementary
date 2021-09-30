package ru.job4j;

import java.util.Scanner;
public class Scan {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Введите 3 любых целых числа: ");
        int number1 = k.nextInt();
        int number2 = k.nextInt();
        int number3 = k.nextInt();
        System.out.print(number1 + number2 - number3);
    }
}
