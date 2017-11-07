package jv17_05.pavliuk.lesson11.instrument;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drum drum = (Drum) o;

        return size == drum.size;
    }

    @Override
    public int hashCode() {
        return size;
    }
}
