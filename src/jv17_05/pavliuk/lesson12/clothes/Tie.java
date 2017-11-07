package jv17_05.pavliuk.lesson12.clothes;

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
        return "Tie size:" + getSize() + ", color: " + getColor() + ", price: " + getPrice();
    }
}
