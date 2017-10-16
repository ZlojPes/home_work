package jv17_05.pavliuk.lesson12.instrument;

public class Drum implements Instrument {
    @Override
    public void play() {
        System.out.println("Барабан играет ноту " + KEY);
    }
}
