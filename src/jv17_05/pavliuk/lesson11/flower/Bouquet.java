package jv17_05.pavliuk.lesson11.flower;

public class Bouquet {
        private int flowersNumber;
        private Flower[] flowers;

    public Bouquet(int flowersNumber) {
        this.flowersNumber = flowersNumber;
    }

    public Flower[] getFlowers() {
        return flowers;
    }
}
