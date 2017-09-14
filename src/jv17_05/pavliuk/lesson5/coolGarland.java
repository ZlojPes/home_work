package jv17_05.pavliuk.lesson5;

import java.util.Scanner;

public class coolGarland {
    private static int garland;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            garland = (int) (Math.random() * Integer.MAX_VALUE);
            System.out.println("Имеется гирлянда с 32 лампами, вот она:");
            System.out.println(getNormalizedGarland());
            System.out.println("Выберите действие:\n1. Сменить (инвертировать) состояние лампочек (введите 1,n где n - количество инверсий)");
            System.out.println("2. Запустить бегущие огни влево (введите 2,n где n - количество смещений влево)");
            System.out.println("3. Запустить бегущие огни вправо (введите 3,n где n - количество смещений вправо)");
            System.out.println("4. Проверить, включена ли нужная лампа (введите 4,n где n - номер проверяемой лампы, нумерация справа налево)");

            String[] input = scanner.nextLine().split(",");
            int param = 0;
            if (input.length >= 2) {
                try {
                    param = Integer.parseInt(input[1]);
                } catch (NumberFormatException ex) {
                    System.out.println("Ошибочный ввод, попробуйте снова.\n\n");
                    continue;
                }
                if (param < 0) {
                    param = -param;
                }
                switch (input[0]) {
                    case "1":
                        blink(param);
                        break;
                    case "2":
                        runLights(true, param);
                        break;
                    case "3":
                        runLights(false, param);
                        break;
                    case "4":
                        if (param < 33) {
                            checkLamp(param);
                        } else {
                            System.out.println("Ламп всего 32, попробуйте снова.\n\n");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Ошибочный ввод, попробуйте снова.\n\n");
                        continue;
                }
            } else {
                System.out.println("Ошибочный ввод, попробуйте снова.\n\n");
                continue;
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\n\n\n");
        }
    }

    private static void checkLamp(int num) {
        int mask = (int) Math.pow(2, num - 1);
        System.out.println(getNormalizedGarland());
        String cursor = "^";
        while (cursor.length() != 33 - num) {
            cursor = " " + cursor;
        }
        System.out.println(cursor);
        if ((mask & garland) == mask) {
            System.out.println("Лампа №" + num + " светится");
        } else {
            System.out.println("Лампа №" + num + " не светится");
        }
    }

    private static void runLights(boolean toLeft, int num) {
        System.out.println(getNormalizedGarland());
        for (int i = 0; i < num; i++) {
            if (toLeft) {
                garland <<= 1;
            } else {
                garland >>= 1;
            }
            System.out.println(getNormalizedGarland());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void blink(int num) {
        for (int i = 0; i < num; i++) {
            garland = ~garland;
            System.out.println(getNormalizedGarland());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static String getNormalizedGarland() {
        String output = Integer.toBinaryString(garland);
        while (output.length() != 32) {
            output = "0" + output;
        }
        return output;
    }
}
