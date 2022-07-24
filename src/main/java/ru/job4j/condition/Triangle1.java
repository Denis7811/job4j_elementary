package ru.job4j.condition;

public class Triangle1 {
        public static boolean exist(double ab, double ac, double bc) {
            return ab+ac>bc&&ab+bc>ac&&bc+ac>ab;
        }
    public static void main(String[] args) {
        int index = 10;
        System.out.println("Использование префиксной формы записи!");
        System.out.println("Результат вычисления: " + ++index);
        System.out.println("Значение переменной: " + index);
        System.out.println();
        System.out.println("Использование постфиксной формы записи!");
        System.out.println("Результат вычисления: " + index++);
        System.out.println("Значение переменной: " + index);
    }
}
