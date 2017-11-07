package jv17_05.pavliuk.lesson10.shapes;

import java.util.Arrays;

public class Rectangle extends Shape {
    private int[] a, b, c, d;

    public Rectangle(String color, int[] a, int[] b, int[] c, int[] d) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int[] getA() {
        return a;
    }

    public int[] getB() {
        return b;
    }

    public int[] getC() {
        return c;
    }

    public int[] getD() {
        return d;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public void setB(int[] b) {
        this.b = b;
    }

    public void setC(int[] c) {
        this.c = c;
    }

    public void setD(int[] d) {
        this.d = d;
    }

    @Override
    public void draw() {
        System.out.println("Draw " + this);
    }

    @Override
    public String toString() {
        return color + " rectangle{" +
                "a=" + Arrays.toString(a) +
                ", b=" + Arrays.toString(b) +
                ", c=" + Arrays.toString(c) +
                ", d=" + Arrays.toString(d) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (!color.equals(rectangle.color)) return false;
        if (!Arrays.equals(a, rectangle.a)) return false;
        if (!Arrays.equals(b, rectangle.b)) return false;
        if (!Arrays.equals(c, rectangle.c)) return false;
        return Arrays.equals(d, rectangle.d);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(a);
        result = 31 * result + Arrays.hashCode(b);
        result = 31 * result + Arrays.hashCode(c);
        result = 31 * result + Arrays.hashCode(d);
        return result;
    }
}
