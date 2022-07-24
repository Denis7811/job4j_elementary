package ru.job4j.condition;

public class Cinema1 {
    public static void acces(int age){
        System.out.println("The age of the customer is : " + age);
        if(age>16){
            System.out.println("Welcome to the cinema");
        }else{
            System.out.println("It is not for you");
        }
    }
    public static void main(String[] args){
        Cinema1.acces(10);
        Cinema1.acces(20);
    }
}
