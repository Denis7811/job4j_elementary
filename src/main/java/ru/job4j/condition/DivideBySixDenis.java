package ru.job4j.condition;

public class DivideBySixDenis {
    public static String checkNumberD(int number) {
        String rsl;
        if (number % 3 ==0) {
            if (number % 2 ==0) {
                rsl = "Исходное число делится на 6.";
            } else {
                rsl = "Исходное число делится на 3, но не является четным.";
            }
        } else {
            if (number % 2 ==0) {
                rsl = "Исходное число не делится на 3, но является четным.";
            } else {
                rsl = "Исходное число не делится на 3 и не является четным.";
            }
        }
        return rsl;
    }
    public static void main(String[] args) {
        String checkNumberSix = checkNumberD(18);
        System.out.println(checkNumberSix);
        checkNumberSix = checkNumberD(21);
        System.out.println(checkNumberSix);
        checkNumberSix = checkNumberD(34);
        System.out.println(checkNumberSix);
        checkNumberSix = checkNumberD(27);
        System.out.println(checkNumberSix);
    }
}
