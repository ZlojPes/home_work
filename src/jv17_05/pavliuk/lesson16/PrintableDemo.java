package jv17_05.pavliuk.lesson16;

import jv17_05.pavliuk.lesson12.printable.Printable;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Printing from anonymous class");
            }
        };
        printable.print();
    }
}
