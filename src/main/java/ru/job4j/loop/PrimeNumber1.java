package ru.job4j.loop;

public class PrimeNumber1 {
    public static int calc(int finish) {
        int count = 0;
        for (int number =2; number<=finish;number++ ) {
            if (CheckPrimeNumber1.check(number)) {
                count+=1;
            }
        }
        return count;
    }
}
