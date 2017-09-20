package jv17_05.pavliuk.lesson7;

import java.util.Arrays;

public class Table {
    public static void main(String[] args) {
        int[] array = {6, 9, 2, 7, 0};
        System.out.println("Оригинальный массив:" + Arrays.toString(array));
        System.out.println("#################################");
        System.out.println("# i # j #    Массив     #  if?  #");
        System.out.println("#################################");
        sort(array);
        System.out.println("#################################");
        System.out.println("P.S. В таблице не отображена последняя итерация внешнего цикла (при i=" + (array.length - 1) + "),");
        System.out.println("т.к. вутренний цикл гарантированно не выполняется и массив не изменяется");
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                boolean isChanged = false;
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    isChanged = true;
                }
                print(i, j, array, isChanged);
            }
        }
    }

    private static void print(int i, int j, int[] array, boolean ifBlock) {
        System.out.println("# " + i + " # " + j + " #" + Arrays.toString(array) + "# " + ifBlock + (ifBlock ? "  #" : " #"));
    }
}
