package jv17_05.pavliuk.lesson10.flower;

public class FlowerShop {
    public static void main(String[] args) {
        Flower[] bouquet1 = Bouquet.getBouquet(5);
        Flower[] bouquet2 = Bouquet.getBouquet(7);
        Flower[] bouquet3 = Bouquet.getBouquet(9);

        System.out.println("Состав букета №1:");
        print(bouquet1);
        System.out.println("Состав букета №2:");
        print(bouquet2);
        System.out.println("Состав букета №3:");
        print(bouquet3);

        System.out.println("Цена букета №1: " + getBouquetCost(bouquet1));
        System.out.println("Цена букета №2: " + getBouquetCost(bouquet2));
        System.out.println("Цена букета №3: " + getBouquetCost(bouquet3));

        System.out.println("\nВсего продано гвоздик:" + Carnation.getCarnationCounter() + "; ромашек " + Chamomile.getChamomileCounter()
                + "; хризантем " + Chrysanthemum.getChrysanthemumCounter() + "; роз " + Rose.getRoseCounter() + "; тюльпанов " +
                Tulip.getTulipCounter());
        System.out.println("Всего продано: " + Flower.getOverallCounter() + " цветков.");

    }

    public static int getBouquetCost(Flower[] bouquet) {
        int cost = 0;
        for (Flower flower : bouquet) {
            cost += flower.getCost();
        }
        return cost;
    }

    public static void print(Flower[] bouquet) {
        for (Flower flower : bouquet) {
            System.out.println(flower);
        }
        System.out.println();
    }
}
