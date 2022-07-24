package ru.job4j.condition;

public class MultipleSwitchWeek1 {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Manday" -> 1;
            case "Вторник","Thuesday" -> 2;
            default -> -100;
        };
    }
    public static void main(String[] args) {
        System.out.println(numberOfDay("Manday1"));
    }
}

