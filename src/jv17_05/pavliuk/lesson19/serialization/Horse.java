package jv17_05.pavliuk.lesson19.serialization;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {
    public Halter halter;

    public Horse(Halter halter) {
        this.halter = halter;
    }
}
