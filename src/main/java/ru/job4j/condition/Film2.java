package ru.job4j.condition;

public class Film2 {
    public static String permission(int age) {
        String label=age>=18?"Please enjoy":"You can't watch it";
        return label;
    }
    public static void main(String[] args){
        String msg=Film2.permission(20);
        System.out.println(msg);
        msg=Film2.permission(10);
        System.out.println(msg);
    }
}
