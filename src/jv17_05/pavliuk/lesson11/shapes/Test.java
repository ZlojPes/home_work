package jv17_05.pavliuk.lesson11.shapes;

public class Test {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("Red", new int[]{1, 1}, new int[]{1, 2}, new int[]{2, 1}, new int[]{2, 2});
        Rectangle r2 = new Rectangle("Green", new int[]{3, 1}, new int[]{3, 2}, new int[]{4, 1}, new int[]{4, 2});
        Circle c1 = new Circle("Blue", new int[]{5, 5}, 3);
        Shape[] shapes = {r1, r2, c1};
        for (Shape current : shapes) {
            current.draw();
        }
        System.out.println("Rectangles are equals: " + r1.equals(r2));
    }
}
