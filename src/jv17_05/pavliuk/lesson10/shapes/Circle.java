package jv17_05.pavliuk.lesson10.shapes;

import java.util.Arrays;

public class Circle extends Shape {
    private int[] center;
    private int radius;

    public Circle(String color, int[] center, int diameter) {
        super(color);
        this.center = center;
        this.radius = diameter;
    }

    @Override
    public String toString() {
        return color + " circle{" +
                "center=" + Arrays.toString(center) +
                ", radius=" + radius + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (!color.equals(circle.color)) return false;
        if (radius != circle.radius) return false;
        return Arrays.equals(center, circle.center);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(center);
        result = 31 * result + radius;
        return result;
    }

    public void setCenter(int[] center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int[] getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw " + this);
    }
}
