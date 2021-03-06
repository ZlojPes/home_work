package jv17_05.pavliuk.lesson12.clothes;

public class Pants extends Clothes implements ManClothes, WomanClothes {
    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Man is dressing up the pants");
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman is dressing up the pants");
    }

    @Override
    public String toString() {
        return "Pants size:" + getSize() + ", color: " + getColor() + ", price: " + getPrice();
    }
}
