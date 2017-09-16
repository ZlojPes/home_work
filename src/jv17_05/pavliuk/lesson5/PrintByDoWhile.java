package jv17_05.pavliuk.lesson5;

public class PrintByDoWhile {
    public static void main(String[] args) {
        int counter = 0;
        do {
            counter++;
            if (counter % 5 == 0) {
                System.out.println(counter);
            }
        } while (counter < 100);
    }
}
