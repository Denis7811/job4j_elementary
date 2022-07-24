package ru.job4j.calculator;
import ru.job4j.math.*;
import static ru.job4j.math.MathFunction1.*;

public class MathCalculator1 {
    public static double sumAndMultiply1(double first, double second) {
        return ru.job4j.math.MathFunction1.sum(first, second)
                + ru.job4j.math.MathFunction1.multiply(first, second);
    }
    public static double sumAndMultiply2(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }
    public static double sumAndMultiply3(double first, double second) {
        return  MathFunction1.sum(first, second)
                +  multiply(first, second);
    }
    public static double sumDifferenceAndDivision(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }
    public static double sumDifferenceAndDivisionAndSumAndMultiply(double first, double second) {
        return difference(first, second) + division(first, second)
                +sum(first, second)+ multiply(first, second);
    }

    public static void main(String[] args) {
                System.out.println("Результат расчета равен : " + sumDifferenceAndDivision(100, 20));
                System.out.println("Результат расчета равен 2: " + sumDifferenceAndDivisionAndSumAndMultiply(10, 2));
    }
}
