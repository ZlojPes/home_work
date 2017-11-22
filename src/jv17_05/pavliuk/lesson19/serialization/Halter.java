package jv17_05.pavliuk.lesson19.serialization;

import java.io.Serializable;

public class Halter implements Serializable {
    public int size;

    public Halter(int size) {
        this.size = size;
    }
}
