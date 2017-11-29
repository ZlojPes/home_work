package jv17_05.pavliuk.lesson20;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {
    public Halter halter;

    public Horse(Halter halter) {
        this.halter = halter;
    }
}
