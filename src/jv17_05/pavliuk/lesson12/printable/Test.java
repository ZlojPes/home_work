package jv17_05.pavliuk.lesson12.printable;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book();
        Magazine magazine1 = new Magazine();
        Book book2 = new Book();
        Magazine magazine2 = new Magazine();
        Printable[] array = {book1, book2, magazine1, magazine2};
        for (Printable current : array) {
            current.print();
        }
        Book.printBooks(array);
        Magazine.printMagazine(array);
    }
}
