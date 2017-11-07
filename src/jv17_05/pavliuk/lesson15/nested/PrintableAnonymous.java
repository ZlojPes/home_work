package jv17_05.pavliuk.lesson15.nested;

import jv17_05.pavliuk.lesson11.printable.Printable;

public class PrintableAnonymous {
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
