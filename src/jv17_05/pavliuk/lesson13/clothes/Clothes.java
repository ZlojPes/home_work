package jv17_05.pavliuk.lesson13.clothes;

public abstract class Clothes {
    public Size size;
    private int price;
    private String color;

    public Clothes(Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
