package jv17_05.pavliuk.lesson10.fruits;

public class FruitShop {
    public static void main(String[] args) {
        Apple apple1 = new Apple(2);
        Pear pear1 = new Pear(3);
        Apricot apricot1 = new Apricot(4);
        System.out.println(Apple.getTotalCost());
        System.out.println(Pear.getTotalCost());
        System.out.println(Apricot.getTotalCost());
        System.out.println(Fruit.getTotalCost());
    }
}
