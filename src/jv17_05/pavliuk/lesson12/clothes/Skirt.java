package jv17_05.pavliuk.lesson12.clothes;

public class Skirt extends Clothes implements WomanClothes {
    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman is dressing up the skirt");
    }

    @Override
    public String toString() {
        return "Skirt size:" + getSize() + ", color: " + getColor() + ", price: " + getPrice();
    }
}
