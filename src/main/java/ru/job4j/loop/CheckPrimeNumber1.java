package ru.job4j.loop;

public class CheckPrimeNumber1 {
    public static boolean check(int number) {
        boolean prime = true;
        if (number ==1||number ==0) {
            prime = false;
                   }
        for (int i = 2; i < number; i++) {
            if (number % i ==0) {
                prime = false;
                break;
            }
        }
            return prime;
        }
    }
