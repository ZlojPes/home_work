package jv17_05.pavliuk.lesson11.flower;

public final class Bouquet {

    private Bouquet() {
    }

    public static Flower[] getBouquet(int flowersNumber) {
        Flower[] bouquet = new Flower[flowersNumber];
        for (int i = 0; i < flowersNumber; i++) {
            switch ((int) (Math.random() * 5)) {
                case (0):
                    bouquet[i] = new Carnation("Ukraine");
                    break;
                case (1):
                    bouquet[i] = new Chamomile("Russia");
                    break;
                case (2):
                    bouquet[i] = new Chrysanthemum("Belarus");
                    break;
                case (3):
                    bouquet[i] = new Rose("Ukraine");
                    break;
                default:
                    bouquet[i] = new Tulip("Netherlands");
            }
        }
        return bouquet;
    }
}
