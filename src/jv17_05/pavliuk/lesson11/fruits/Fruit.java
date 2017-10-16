package jv17_05.pavliuk.lesson11.fruits;

public abstract class Fruit {
    protected int weight;
    private static int totalCost;

    public Fruit(int weight, int price) {
        this.weight = weight;
        totalCost += weight * price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    public static int getTotalCost() {
        return totalCost;
    }

    public abstract int getCost();
}
