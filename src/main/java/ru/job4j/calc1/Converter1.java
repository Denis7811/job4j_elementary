package ru.job4j.calc1;

public class Converter1 {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl1 = value / 60;
        return rsl1;
    }

    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void main(String[] args) {
        float euro = Converter1.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter1.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");
        float inEv = 140;
        float expectedEv = 2;
        float outEv = Converter1.rubleToEuro(inEv);
        boolean passedEv = expectedEv == outEv;
        System.out.println("140 rubles are 2Euro. Test result : " + passedEv);
        float inDol = 180;
        float expectedDol = 3;
        float outDol = Converter1.rubleToDollar(inDol);
        boolean passedDol = expectedDol == outDol;
        System.out.println("180 rubles are 3 Dol. Test result : " + passedDol);
        float a = 1.23f;
        double b = 4.56f;
        System.out.printf("%.15f%n", a);
        System.out.printf("%.15f%n", b);
    }
}
