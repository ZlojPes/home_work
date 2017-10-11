package jv17_05.pavliuk.lesson10.library;

import java.util.*;

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

    public void takeBook(Book book) {
        books.add(book);
    }

    public void takeBook(Book... books) {
        this.books.addAll(Arrays.asList(books));
    }

    public void returnBook(Book book) {
        books.remove(book);
    }

    public void returnBook(Book... books) {
        this.books.removeAll(Arrays.asList(books));
    }

    public static int getCounter() {
        return userCounter;
    }

    @Override
    public int getInventoryNumber() {
        return -1;
    }

    @Override
    public List<Composite> getChild() {
        return books;
    }

    @Override
    public String toString() {
        return "Читатель " + name + " (читательский билет №" + readersTicketNumber + ")";
    }
}
