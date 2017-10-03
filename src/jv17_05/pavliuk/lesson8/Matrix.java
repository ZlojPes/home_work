package jv17_05.pavliuk.lesson8;

import java.util.Arrays;

public class Matrix {
    private double array[][];
    private int rows, columns;

    public Matrix(double array[][]) {
        this.array = array;
        rows = array.length;
        columns = array[0].length;
    }

    public double[][] sum(Matrix anotherMatrix) {
        double array[][] = anotherMatrix.getMatrixArray();
        if (array.length != this.array.length) {
            throw new UnsupportedOperationException("Складываемые матрицы должны быть равны!");
        }
        double[][] resultArray = new double[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != this.array[i].length) {
                throw new UnsupportedOperationException("Складываемые матрицы должны быть равны!");
            }
            for (int j = 0; j < array[i].length; j++) {
                resultArray[i][j] = array[i][j] + this.array[i][j];
            }
        }
        return resultArray;
    }

    public double[][] getMatrixArray() {
        return array;
    }

    public int getRowsNumber() {
        return rows;
    }

    public int getColumnsNumber() {
        return columns;
    }

    void print(double[][] array) {
        System.out.println(Arrays.deepToString(array));
    }

    void print() {
        System.out.println(Arrays.deepToString(array));
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix(new double[][]{{1.5, 2.5, 3.5}, {2.5, 3.5, 4.5}});
        Matrix anotherMatrix = new Matrix(new double[][]{{2.5, 3.5, 4.5}, {3.5, 4.5, 5.5}});
        double[][] resultArray = matrix.sum(anotherMatrix);
        matrix.print();
        System.out.println("+");
        anotherMatrix.print();
        System.out.println("__________________________________");
        matrix.print(resultArray);
    }
}