package jv17_05.pavliuk.lesson10.fruits;

public class Apricot extends Fruit {
    private static int price = 25;
    private static int totalCost;

    public Apricot(int weight) {
        super(weight, price);
        totalCost += weight * price;
    }

    @Override
    public int getCost() {
        return price * weight;
    }

    public static void setPrice(int price) {
        Apricot.price = price;
    }

    public static int getPrice() {
        return price;
    }

    public static int getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "Apricot{" +
                "weight=" + weight +
                '}';
    }
}
