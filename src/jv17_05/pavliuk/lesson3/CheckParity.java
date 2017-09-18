package jv17_05.pavliuk.lesson3;

import java.util.Scanner;

public class CheckParity {
    public static void main(String[] args) {
        System.out.print("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            if (input % 2 == 0) {
                System.out.print("Ваше число чётное");
            } else {
                System.out.print("Ваше число нечётное");
            }
        } else {
            System.out.print("Вы ввели не целое число!");
        }
    }
}
