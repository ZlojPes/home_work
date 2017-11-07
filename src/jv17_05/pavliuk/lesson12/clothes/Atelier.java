package jv17_05.pavliuk.lesson12.clothes;

public class Atelier {
    public void dressMan(Clothes[] collection) {
        for (Clothes clothes : collection) {
            if (clothes instanceof ManClothes) {
                ((ManClothes) clothes).dressMan();
                System.out.println(clothes);
            }
        }
    }

    public void dressWoman(Clothes[] collection) {
        for (Clothes clothes : collection) {
            if (clothes instanceof WomanClothes) {
                ((WomanClothes) clothes).dressWoman();
                System.out.println(clothes);
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
