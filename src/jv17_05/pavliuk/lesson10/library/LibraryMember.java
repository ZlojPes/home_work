package jv17_05.pavliuk.lesson10.library;

public class LibraryMember implements Printable {
    private String name;
    private int readersTicketNumber;
    private Book[] books;
    private static int userCounter;

    public LibraryMember(String name) {
        this.name = name;
        readersTicketNumber = ++userCounter;
    }

    public Printable[] getChild() {
        return books;
    }

    public static int getCounter() {
        return userCounter;
    }

    public String toString() {
        return "Читатель " + name;
    }
}
