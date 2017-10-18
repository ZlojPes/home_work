package jv17_05.pavliuk.lesson12.printable;

public class Magazine implements Printable {
    @Override
    public void print() {
        System.out.println("Magazine");
    }

    public static void printMagazine(Printable[] printable){
        for (Printable current:printable){
            if (current instanceof Magazine){
                System.out.println("printing Magazine");
            }
        }
    }
}
