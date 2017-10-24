package jv17_05.pavliuk.lesson13.clothes;

public class Atelier {
    public void dressMan(Clothes[] collection) {
        for (Clothes clothes : collection) {
            try {
                ((ManClothes) clothes).dressMan();
                System.out.println(clothes);
            } catch (ClassCastException e) {
            }
        }
    }

    public void dressWoman(Clothes[] collection) {
        for (Clothes clothes : collection) {
            try {
                ((WomanClothes) clothes).dressWoman();
                System.out.println(clothes);
            } catch (ClassCastException e) {
            }
        }
    }

    public static void main(String[] args) {
        Atelier atelier = new Atelier();
        TShirt tShirt = new TShirt(Size.S, 150, "White");
        Pants pants = new Pants(Size.L, 200, "Blue");
        Skirt skirt = new Skirt(Size.XS, 250, "Yellow");
        Tie tie = new Tie(Size.XXS, 300, "Black");
        Clothes[] collection = {tShirt, pants, skirt, tie};
        atelier.dressMan(collection);
        atelier.dressWoman(collection);
    }
}
