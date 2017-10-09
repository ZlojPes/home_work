package jv17_05.pavliuk.lesson10.library;

public class Book implements Printable {
    private String name;
    private static int counter;
    private int inventoryNumber;

    public Book(String name) {
        this.name = name;
        inventoryNumber = ++counter;
    }

    public String getName() {
        return name;
    }

    public static int getCounter() {
        return counter;
    }

    public Printable[] getChild() {
        return null;
    }

    @Override
    public String toString() {
        return "Book #" + inventoryNumber + "\"" + name + "\"";
    }
}
