package jv17_05.pavliuk.lesson11.shapes;

import java.util.Arrays;

public class Rectangle extends Shape {
    private int[] a, b, c, d;
    public Rectangle(String color){
        super(color);
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
        System.out.println("фигура квадрат с координатами а:"+ Arrays.toString(a)+" b:"+ Arrays.toString(b)+" c:"+
                Arrays.toString(c)+" d:"+ Arrays.toString(a));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (!Arrays.equals(a, rectangle.getA())) return false;
        if (!Arrays.equals(b, rectangle.getB())) return false;
        if (!Arrays.equals(c, rectangle.getC())) return false;
        return Arrays.equals(d, rectangle.getD());

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
