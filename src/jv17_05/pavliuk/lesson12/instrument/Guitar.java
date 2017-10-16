package jv17_05.pavliuk.lesson12.instrument;

public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("Гитара играет ноту " + KEY);
    }
}
