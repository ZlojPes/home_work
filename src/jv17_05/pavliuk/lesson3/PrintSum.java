package jv17_05.pavliuk.lesson3;

import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = getUserInput(scanner);
        int i2 = getUserInput(scanner);
        System.out.print("" + i1 + "+" + i2 + "=" + (i1 + i2));
    }

    private static int getUserInput(Scanner scanner) {
        while (true) {
            System.out.print("Введите слагаемое (целое число)");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.print("Вы ввели не целое число!");
                scanner.nextLine();
            }
        }
    }
}
