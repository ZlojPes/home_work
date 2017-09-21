package jv17_05.pavliuk.lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayGarland {
    private static int[] garland;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            garland = getRandomGarland();
            System.out.println("Имеется гирлянда с 32 лампами, вот она:");
            System.out.println(Arrays.toString(garland));
            System.out.println("Выберите действие:\n1. Сменить (инвертировать) состояние лампочек (введите 1,n где n - количество инверсий)");
            System.out.println("2. Запустить бегущие огни влево (введите 2,n где n - количество смещений влево)");
            System.out.println("3. Запустить бегущие огни вправо (введите 3,n где n - количество смещений вправо)");
            System.out.println("4. Проверить, включена ли нужная лампа (введите 4,n где n - номер проверяемой лампы, нумерация справа налево)");

            String[] input = scanner.nextLine().split(",");
            int param;
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
                        if (param <= 32 && param >= 1) {
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
        System.out.println(Arrays.toString(garland));
        String pointer = "^";
        while (pointer.length() != 98 - num * 3) {
            pointer = " " + pointer;
        }
        System.out.println(pointer);
        if (garland[32 - num] == 1) {
            System.out.println("Лампа №" + num + " светится");
        } else {
            System.out.println("Лампа №" + num + " не светится");
        }
    }

    private static void runLights(boolean toLeft, int num) {
        System.out.println(Arrays.toString(garland));
        for (int i = 0; i < num; i++) {
            if (toLeft) {
                System.arraycopy(garland, 1, garland, 0, 31);
                garland[31] = 0;
            } else {
                System.arraycopy(garland, 0, garland, 1, 31);
                garland[0] = 0;
            }
            System.out.println(Arrays.toString(garland));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void blink(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < garland.length; j++) {
                garland[j] = Math.abs(garland[j] - 1);
            }
            System.out.println(Arrays.toString(garland));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    private static int[] getRandomGarland() {
        int[] garland = new int[32];
        for (int i = 0; i < garland.length; i++) {
            if (Math.random() > .5) {
                garland[i] = 1;
            }
        }
        return garland;
    }
}
