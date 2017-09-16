package jv17_05.pavliuk.lesson5;

public class IfElseWeek {
    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);
        if (day == 1) {
            System.out.println("Понедельник");
        } else if (day == 2) {
            System.out.println("Вторник");
        } else if (day == 3) {
            System.out.println("Среда");
        } else if (day == 4) {
            System.out.println("Четверг");
        } else if (day == 5) {
            System.out.println("Пятница");
        } else if (day == 6 || day == 7) {
            System.out.println("Выходной");
        } else {
            System.out.println("Нет такого дня недели");
        }
    }
}
