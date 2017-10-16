package jv17_05.pavliuk.lesson11.fruits;

public class Pear extends Fruit {
    private static int price = 20;
    private static int totalCost;

    public Pear(int weight) {
        super(weight, price);
        totalCost += weight * price;
    }

    @Override
    public int getCost() {
        return price * weight;
    }

    public static void setPrice(int price) {
        Pear.price = price;
    }

    public static int getPrice() {
        return price;
    }

    public static int getTotalCost() {
        return totalCost;
    }
}
