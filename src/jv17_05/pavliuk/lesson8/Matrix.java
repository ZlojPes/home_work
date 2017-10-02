package jv17_05.pavliuk.lesson8;

public class Matrix {
    double array[][];
    int rows, columns;

    public Matrix(double array[][]) {
        this.array = array;
        rows = array.length;
        columns = array[0].length;
    }

    public void sum(double array[][]) {
        int maxRowLength = Math.max(this.array.length, array.length);
        double[][] tempArray = new double[maxRowLength][];
        for (int i = 0; i < maxRowLength; i++) {

        }
    }
}
