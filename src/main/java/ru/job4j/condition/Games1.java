package ru.job4j.condition;

public class Games1 {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if ( allowByParent||hasMoney) {
            System.out.println("I can go to the computer club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Games1.permission(true, true);
        Games1.permission(true, false);
        Games1.permission(false, false);
        Games1.permission(false, true);
    }
}
