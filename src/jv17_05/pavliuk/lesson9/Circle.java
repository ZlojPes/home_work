package jv17_05.pavliuk.lesson9;

public class Circle {
    private int radius;
    public static final double PI=3.1415926;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getCircumference() {
        return PI * radius * 2;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(5);
        System.out.println("Длина окружности при радиусе R=" + circle1.getRadius() + " составляет " + circle1.getCircumference() + " условных единиц длины");
        System.out.println("Площадь круга при радиусе R=" + circle2.getRadius() + " составляет " + circle2.getArea() + " квадратных условных единиц длины");
    }
}
