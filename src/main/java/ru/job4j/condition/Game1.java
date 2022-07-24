package ru.job4j.condition;

public class Game1 {
    public static void menu(String name) {
        if ("super mario".equals(name)) {
            System.out.println("Start - super mario");
        }
        if ("tanks".equals(name)) {
            System.out.println("Start - tanks!");
        }
        if ("WarCraft".equals(name)) {
            System.out.println("Start - WarCraft");
        }
    }
    public static void main(String[] args) {
        Game1.menu("WarCraft");
    }
}
