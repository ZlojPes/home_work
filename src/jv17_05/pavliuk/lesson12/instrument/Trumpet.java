package jv17_05.pavliuk.lesson12.instrument;

public class Trumpet implements Instrument {
    @Override
    public void play() {
        System.out.println("Труба играет ноту " + KEY);
    }
}
