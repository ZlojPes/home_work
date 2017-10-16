package jv17_05.pavliuk.lesson12.instrument;

public class Test {
    public static void main(String[] args) {
        Instrument guitar = new Guitar();
        Instrument drum = new Drum();
        Instrument trumpet = new Trumpet();
        Instrument[] array = {trumpet, guitar, drum};
        for (Instrument instrument : array) {
            instrument.play();
        }
    }
}
