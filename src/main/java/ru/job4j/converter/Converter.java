package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(420);

                System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(420);

        System.out.println("140 rubles are " + dollar + " dollar.");
        float in = 420;
        float expectedEuro = 6;
        float outEuro = Converter.rubleToEuro(in);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("420 rubles are 6 Euro. Test result : " + passedEuro);
        float expectedDollar = (float) 7;
        float outDollar = Converter.rubleToDollar(in);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 7 Dollar. Test result : " + passedDollar);

    }
}
