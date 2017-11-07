package jv17_05.pavliuk.lesson16;

public class Calc {
    public static <T extends Number, V extends Number> void sum(T t, V v) {
        System.out.println(t + " + " + v + " = " + (t.doubleValue() + v.doubleValue()));
    }

    public static <T extends Number, V extends Number> void subtraction(T t, V v) {
        System.out.println(t + " - " + v + " = " + (t.doubleValue() - v.doubleValue()));
    }

    public static <T extends Number, V extends Number> void multiply(T t, V v) {
        System.out.println(t + " * " + v + " = " + (t.doubleValue() * v.doubleValue()));
    }

    public static <T extends Number, V extends Number> void divide(T t, V v) {
        System.out.println(t + " : " + v + " = " + (t.doubleValue() / v.doubleValue()));
    }

    public static void main(String[] args) {
        multiply(100L, (byte) 2);
    }
}
