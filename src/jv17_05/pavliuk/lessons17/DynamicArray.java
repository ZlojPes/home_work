package jv17_05.pavliuk.lessons17;

import jv17_05.pavliuk.lesson9.Circle;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {
        List<Circle> list = new ArrayList<>();
        list.add(new Circle(12));
        list.add(new Circle(16));
        list.add(new Circle(1));
        list.add(new Circle(16));
        list.add(new Circle(19));
        list.add(new Circle(10));
        for (Circle c : list) {
            System.out.println(c);
        }
    }
}
