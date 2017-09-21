package jv17_05.pavliuk.lesson7;

import java.util.Arrays;

public class MinMaxSelection {

    public static void main(String[] args) {
        int[][] original = {{4, 56, 34, 2, 53, 1, 45, 15}, {7, 45, 68, 98, 5, 2, 9, 0}, {2, 6, 4, 9, 2, 1, 3, 5}, {11, 56, 84, 76, 35, 42, 15, 97}, {8, 75, 4, 36, 98, 52, 9, 1}};
        int[][] minMax = new int[5][2];
        for (int i = 0; i < original.length; i++) {
            int[] sortedRow = new int[original[i].length];
            System.arraycopy(original[i], 0, sortedRow, 0, original[i].length);
            SelectionSorter.sort(sortedRow);
            minMax[i][0] = sortedRow[0];
            minMax[i][1] = sortedRow[7];
        }
        print(original, minMax);
    }

    static void print(int[][] ar1, int[][] ar2) {
        for (int i = 0; i < ar1.length; i++) {
            String str = Arrays.toString(ar1[i]);
            while (str.length() != 37) {
                str += " ";
            }
            System.out.print(str);
            System.out.println(Arrays.toString(ar2[i]));
        }
    }
}
