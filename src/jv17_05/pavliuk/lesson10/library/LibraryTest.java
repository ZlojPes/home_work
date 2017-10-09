package jv17_05.pavliuk.lesson10.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

    public static void main(String[] args) {

        Library library = new Library();
        Book b1 = new Book("\"Thinking in Java\", Bruce Eckel");
        Book b2 = new Book("\"Head First Java\", K.Sierra, B.Bates");
        Book b3 = new Book("\"Head First Design Patterns\", E.Freeman, E.Robson");
        Book b4 = new Book("\"Java Concepts\", C. Horstmann");
        Book b5 = new Book("\"Head First Java\", K.Sierra, B.Bates");
        Book b6 = new Book("\"Java. The complete reference\", H.Schildt");

        LibraryReader r1 = new LibraryReader("Александр Павлюк");
        LibraryReader r2 = new LibraryReader("Дарья Старкова");
        LibraryReader r3 = new LibraryReader("Алексей Цуканов");

        r1.addBook(b1);
        r1.addBook(b2);
        r1.addBook(b3);
        r2.addBook(b4);
        r2.addBook(b5);
        r3.addBook(b6);

        library.addReader(r1);
        library.addReader(r2);
        library.addReader(r3);

        List<Composite> libList = new ArrayList<Composite>();
        libList.add(library);

        new LibraryTest().print(libList);
    }

    public void print(List<Composite> list) {
        if (list != null) {
            for (Composite element : list) {
                System.out.println(element);
                print(element.getChild());
            }
            System.out.println();
        }
    }
}
