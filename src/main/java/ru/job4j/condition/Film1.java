package ru.job4j.condition;

public class Film1 {
    public static String permission(int age) {
        String label="";
        if(age>=18){
            label="Please enjoy";
        }else{
            label="You can't watch it.";
        }
        return label;
    }
    public static void main(String[] args){
    String msg=Film1.permission(20);
        System.out.println(msg);
    msg=Film1.permission(10);
    System.out.println(msg);
    }
}
