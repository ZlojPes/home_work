package jv17_05.pavliuk.lesson12.printable;

public class Book implements Printable {
    @Override
    public void print() {
        System.out.println("Book");
    }

    public static void printBooks(Printable[] printable) {
        for (Printable current : printable) {
            if (current instanceof Book) {
                System.out.println("printing Book");
            }
        }
    }
}
