package jv17_05.pavliuk.lesson19.serialization;

import java.io.Serializable;

public class Halter implements Serializable {
    private int size;

    public Halter(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
