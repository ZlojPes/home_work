package jv17_05.pavliuk.lesson2;

/**
 * Добавление в объектный массив различных примитивных типов
 * с пследующим выводом их в консоли.
 */

public class Literals {
    public static void main(String[] args) {
        Object[] literals = new Object[]{true, "String", 'c', 0b10, 010, 10, 0x10, 3.1415926f, 2.71828182};
        for (Object o : literals) {
            System.out.print(o + "; ");
        }
    }
}
