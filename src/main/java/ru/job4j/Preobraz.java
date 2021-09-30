package ru.job4j;

    public class Preobraz {
    public static void main(String[] args) {
        long l = 129;
        byte b = (byte) l;
        System.out.println(b);

        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println(rsl);

        char c = 45000;
        float z = c;
        System.out.println(z);

        double d = 121.19;
        byte bz1 = (byte) d;
        System.out.println(bz1);

        short s = 1500;
        char cc = (char) s;
        double dd = cc;

        System.out.println(dd);
    }
}
