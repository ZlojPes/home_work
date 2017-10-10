package jv17_05.pavliuk.lesson10.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

    boolean searchSuccess;

    public static void main(String[] args) {

        Library library = new Library();
        Book b1 = new Book("\"Thinking in Java\", Bruce Eckel");
        Book b2 = new Book("\"Head First Java\", K.Sierra, B.Bates");
        Book b3 = new Book("\"Head First Design Patterns\", E.Freeman, E.Robson");
        Book b4 = new Book("\"Java Concepts\", C. Horstmann");
        Book b5 = new Book("\"Head First Java\", K.Sierra, B.Bates");
        Book b6 = new Book("\"Java. The complete reference\", H.Schildt");

        LibraryReader alex = new LibraryReader("Александр Павлюк");
        LibraryReader dasha = new LibraryReader("Дарья Старкова");
        LibraryReader lesha = new LibraryReader("Алексей Цуканов");

        alex.takeBook(b1);
        alex.takeBook(b2);
        alex.takeBook(b3);
        dasha.takeBook(b4);
        dasha.takeBook(b5);
        lesha.takeBook(b6);

        library.addReader(alex);
        library.addReader(dasha);
        library.addReader(lesha);

        List<Composite> libList = new ArrayList<Composite>();
        libList.add(library);

        LibraryTest test = new LibraryTest();
        test.print(libList);
        test.search(library, 6);
    }

    public void search(Composite element, int bookNumber) {
        this.searchSuccess = false;
        System.out.print("Держатель книги №" + bookNumber + ": ");
        searchEngine(element, bookNumber);
        if (!this.searchSuccess) {
            System.out.println("не найден!");
        }
    }

    public void searchEngine(Composite element, int bookNumber) {
        List<Composite> list = element.getChild();
        if (list != null) {
            for (Composite el : list) {
                if (el.getInventoryNumber() == -1) {
                    searchEngine(el, bookNumber);
                }
                if (el.getInventoryNumber() == bookNumber) {
                    System.out.println(element);
                    searchSuccess = true;
                }
            }
        }
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
