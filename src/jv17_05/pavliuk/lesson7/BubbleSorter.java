package jv17_05.pavliuk.lesson7;

import java.util.Arrays;

public class BubbleSorter {
    public static void main(String[] args) {
        int[] array = {4, 2, 8, 45, 3, 23, 1};
        System.out.println("Орининальный массив:" + Arrays.toString(array));
        sort(array);
        System.out.println("Отсортированный массив:" + Arrays.toString(array));
    }

    private static void sort(int[] array) {
        for (int i = array.length - 1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j + 1] > array[j]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
