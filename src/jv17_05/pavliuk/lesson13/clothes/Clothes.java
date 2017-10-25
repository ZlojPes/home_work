package jv17_05.pavliuk.lesson13.clothes;

public abstract class Clothes {
    private Size size;
    private int price;
    private String color;

    public Clothes(Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clothes clothes = (Clothes) o;

        if (price != clothes.price) return false;
        if (size != clothes.size) return false;
        return color != null ? color.equals(clothes.color) : clothes.color == null;
    }

    @Override
    public int hashCode() {
        int result = size != null ? size.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
