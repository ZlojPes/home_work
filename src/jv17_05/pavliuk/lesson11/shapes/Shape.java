package jv17_05.pavliuk.lesson11.shapes;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract void draw();
}
