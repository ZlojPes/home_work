package jv17_05.pavliuk.lesson16;

import java.util.Arrays;

public class MinMax<T extends Number> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T getMax() {
        double max = 0;
        T maxValue = null;
        for (T t : array) {
            double current = t.doubleValue();
            if (maxValue == null || current > max) {
                max = current;
                maxValue = t;
            }
        }
        return maxValue;
    }

    public T getMin() {
        double min = 0;
        T minValue = null;
        for (T t : array) {
            double current = t.doubleValue();
            if (minValue == null || current < min) {
                min = current;
                minValue = t;
            }
        }
        return minValue;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MinMax<?> minMax = (MinMax<?>) o;
        return Arrays.equals(array, minMax.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "MinMax{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public static void main(String[] args) {
        MinMax<Byte> test = new MinMax<>(new Byte[]{50, 20, 10, -100, 127});
        System.out.println(test.getMin());
        System.out.println(test.getMax());
    }
}
