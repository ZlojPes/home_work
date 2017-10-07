package jv17_05.pavliuk.lesson9;

public class Circle {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return Math.PI * radius * 2;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(5);
        System.out.println("Длина окружности при радиусе R=" + circle1.getRadius() + " составляет " + circle1.getCircumference() + " условных единиц длины");
        System.out.println("Площадь круга при радиусе R=" + circle2.getRadius() + " составляет " + circle2.getArea() + " квадратных условных единиц длины");
    }
}
