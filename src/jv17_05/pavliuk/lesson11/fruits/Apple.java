package jv17_05.pavliuk.lesson11.fruits;

public class Apple extends Fruit {
    private static int price = 15;

    private static int totalCost;

    public Apple(int weight) {
        super(weight, price);
        totalCost += weight * price;
    }

    @Override
    public int getCost() {
        return price * weight;
    }

    public static void setPrice(int price) {
        Apple.price = price;
    }

    public static int getPrice() {
        return price;
    }

    public static int getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }
}
