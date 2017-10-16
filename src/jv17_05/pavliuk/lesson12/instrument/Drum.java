package jv17_05.pavliuk.lesson12.instrument;

public class Drum implements Instrument {
    private int size;

    public Drum(int diameter) {
        this.size = diameter;
    }

    @Override
    public void play() {
        System.out.println(" барабанит ноту " + KEY);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "барабан размером " + size + " cm";
    }
}
