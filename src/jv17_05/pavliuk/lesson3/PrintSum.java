package jv17_05.pavliuk.lesson3;

import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = 0, i2 = 0;
        System.out.print("Введите первое слагаемое (целое число)");
        if (scanner.hasNextInt()) {
            i1 = scanner.nextInt();
        } else {
            System.out.print("Вы ввели не целое число!");
            System.exit(1);
        }
        System.out.print("Введите второе слагаемое (целое число)");
        if (scanner.hasNextInt()) {
            i2 = scanner.nextInt();
        } else {
            System.out.print("Вы ввели не целое число!");
            System.exit(1);
        }
        System.out.print("" + i1 + "+" + i2 + "=" + (i1 + i2));
    }
}
