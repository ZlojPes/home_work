package jv17_05.pavliuk.lesson16;

import java.util.Arrays;

public class Matrix<T extends Number> {
    private T array[][];
    private int rows, columns;

    public Matrix(T array[][]) {
        this.array = array;
        rows = array.length;
        columns = array[0].length;
    }

    public Matrix sum(Matrix anotherMatrix) {
        Double array[][] = anotherMatrix.getMatrixArray();
        if (array.length != this.array.length) {
            throw new UnsupportedOperationException("Складываемые матрицы должны быть равны!");
        }
        Double[][] resultArray = new Double[rows][columns];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != this.array[i].length) {
                throw new UnsupportedOperationException("Складываемые матрицы должны быть равны!");
            }
            for (int j = 0; j < array[i].length; j++) {
                resultArray[i][j] = array[i][j] + this.array[i][j].doubleValue();
            }
        }
        return new Matrix(resultArray);
    }

    public void multiply(int multiplier) {
        print(array);
        System.out.println("*\n" + multiplier);
        System.out.print("__________________________________\n[");
        for (T[] i : array) {
            System.out.print("[");
            for (T j : i) {
                System.out.print(j.doubleValue() * multiplier + ", ");
            }
            System.out.print("]");
        }
        System.out.println("]");
    }

    public Double[][] getMatrixArray() {
        int l = array.length, m = array[0].length;
        Double out[][] = new Double[l][m];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < m; j++) {
                out[i][j] = array[i][j].doubleValue();
            }
        }
        return out;
    }

    public int getRowsNumber() {
        return rows;
    }

    public int getColumnsNumber() {
        return columns;
    }

    void print(T[][] array) {
        System.out.println(Arrays.deepToString(array));
    }

    void print() {
        System.out.println(Arrays.deepToString(array));
    }

    public static void main(String[] args) {
        Matrix<Integer> matrix = new Matrix(new Integer[][]{{1, 2, 3}, {2, 3, 4}});
        Matrix<Integer> anotherMatrix = new Matrix(new Integer[][]{{2, 3, 4}, {3, 4, 5}});
        matrix.print();
        System.out.println("+");
        anotherMatrix.print();
        System.out.println("__________________________________");
        matrix.sum(anotherMatrix).print();
        System.out.println("***********************************************");
        matrix.multiply(10);
    }
}