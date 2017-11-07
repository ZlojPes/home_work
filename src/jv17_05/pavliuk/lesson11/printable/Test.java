package jv17_05.pavliuk.lesson11.printable;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("Book1");
        Magazine magazine1 = new Magazine("Magazine1");
        Book book2 = new Book("Book2");
        Magazine magazine2 = new Magazine("Magazine2");
        Printable[] array = {book1, book2, magazine1, magazine2};
        for (Printable current : array) {
            current.print();
        }
        Book.printBooks(array);
        Magazine.printMagazine(array);
    }
}
