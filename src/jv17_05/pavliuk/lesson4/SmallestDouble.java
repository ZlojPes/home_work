package jv17_05.pavliuk.lesson4;

import java.util.Scanner;

public class SmallestDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ar = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите " + (i + 1) + "-е вещественное число:");
            ar[i] = getUserInputPositive(sc);
        }
        double result;
        if (ar[0] < ar[1] && ar[0] < ar[2]) {
            result = ar[0];
        } else if (ar[1] < ar[2]) {
            result = ar[1];
        } else result = ar[2];
        System.out.println("Наименьшим числом по модулю является " + result);
    }

    private static double getUserInputPositive(Scanner sc) {
        while (true) {
            if (sc.hasNextDouble()) {
                double out = sc.nextDouble();
                return out > 0 ? out : -out;
            } else {
                System.out.println("Вы ввели не вещественное число, соберитесь и попробуйте снова:");
            }
        }
    }
}
