package jv17_05.pavliuk.lesson4;

import java.util.Scanner;

public class SmallestDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ar = new double[3];
        for (int i = 0; i < 3; i++) {
            ar[i] = getUserInputPositive(sc, i+1);
        }
        double result;
        if (ar[0] < ar[1] && ar[0] < ar[2]) {
            result = ar[0];
        } else if (ar[1] < ar[2]) {
            result = ar[1];
        } else {
            result = ar[2];
        }
        System.out.println("Наименьшим числом по модулю является " + result);
    }

    private static double getUserInputPositive(Scanner sc,int counter) {
        while (true) {
            System.out.println("Введите " + counter + "-е вещественное число:");
            if (sc.hasNextDouble()) {
                double out = sc.nextDouble();
                sc.nextLine();
                return out > 0 ? out : -out;
            } else {
                sc.nextLine();
                System.out.println("Вы ввели не вещественное число, соберитесь и попробуйте снова:");
            }
        }
    }
}
