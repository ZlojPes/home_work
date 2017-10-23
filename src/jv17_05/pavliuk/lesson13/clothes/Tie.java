package jv17_05.pavliuk.lesson13.clothes;

public class Tie extends Clothes implements ManClothes {
    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Man is dressing up the tie");
    }

    @Override
    public String toString() {
        return "Tie size:" + size + ", color: " + getColor() + ", price: " + getPrice();
    }
}
