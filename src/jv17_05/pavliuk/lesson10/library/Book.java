package jv17_05.pavliuk.lesson10.library;

import java.util.List;

public class Book implements Composite {
    private String name;
    private static int counter;
    private int inventoryNumber;

    public Book(String name) {
        this.name = name;
        inventoryNumber = ++counter;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public int getInventoryNumber() {
        return inventoryNumber;
    }

    @Override
    public List<Composite> getChild() {
        return null;
    }

    @Override
    public String toString() {
        return "Книга #" + inventoryNumber + " " + name;
    }
}
