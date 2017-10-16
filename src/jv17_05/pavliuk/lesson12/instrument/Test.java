package jv17_05.pavliuk.lesson12.instrument;

public class Test {
    public static void main(String[] args) {
        Instrument guitar = new Guitar(6);
        Instrument drum = new Drum(80);
        Instrument trumpet = new Trumpet(10);
        Instrument[] array = {trumpet, guitar, drum};
        for (Instrument instrument : array) {
            System.out.print(instrument);
            instrument.play();
        }
    }
}
