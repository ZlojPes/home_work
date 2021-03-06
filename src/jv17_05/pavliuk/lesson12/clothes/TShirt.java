package jv17_05.pavliuk.lesson12.clothes;

public class TShirt extends Clothes implements ManClothes, WomanClothes {
    public TShirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Man is dressing up the T-shirt");
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman is dressing up the T-shirt");
    }

    @Override
    public String toString() {
        return "T-shirt size:" + getSize() + ", color: " + getColor() + ", price: " + getPrice();
    }
}
