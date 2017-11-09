package jv17_05.pavliuk.lesson15;

import jv17_05.pavliuk.lesson9.Circle;

import java.util.Arrays;

public class ReflectionInfo {
    public static void getInfo(Class c) {
        System.out.println("Информация о классе " + c.getSimpleName() + ":");
        System.out.println("Путь в пакете: " + c.getName());
        System.out.println("Является массивом: " + c.isArray());
        System.out.println("Является интерфейсом: " + c.isInterface());
        System.out.println("Является примитивом: " + c.isPrimitive());
        System.out.println("Конструкторы: " + Arrays.toString(c.getConstructors()));
        System.out.println("Объявленные методы: " + Arrays.toString(c.getDeclaredMethods()));
        System.out.println("Поля: " + Arrays.toString(c.getFields()));
    }

    public static void getInfo(Object o) {
        getInfo(o.getClass());
    }

    public static void main(String[] args) {
        getInfo(new Circle(15));
    }
}
