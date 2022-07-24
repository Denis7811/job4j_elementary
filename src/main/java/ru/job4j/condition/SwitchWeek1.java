package ru.job4j.condition;

public class SwitchWeek1 {
    public static String nameOfDay(int day) {
        String name;
        switch(day){
            case 1:
                name="Ponedelnik";
                break;
            case 2:
                name="Vtornik";
                break;
            default:
                name="Oshibka";
                break;
        }
        return name;
    }
    public static void main(String[] args) {
                System.out.println(SwitchWeek1.nameOfDay(1));
    }
}
