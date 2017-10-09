package jv17_05.pavliuk.lesson10.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryReader implements Composite {
    private String name;
    private int readersTicketNumber;
    private List<Composite> books;
    private static int userCounter;

    public LibraryReader(String name) {
        this.name = name;
        readersTicketNumber = ++userCounter;
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public List<Composite> getChild() {
        return books;
    }

    public static int getCounter() {
        return userCounter;
    }

    @Override
    public String toString() {
        return "Читатель " + name;
    }
}
