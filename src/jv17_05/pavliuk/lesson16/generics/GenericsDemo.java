package jv17_05.pavliuk.lesson16.generics;

import jv17_05.pavliuk.lesson10.animals.Cat;

public class GenericsDemo {
    public static void main(String[] args) {
        Generics<String, Cat, Integer> generics = new Generics<>("String", new Cat("Whiskas", "Tom", 80), 5);
        generics.getVarTypes();
    }
}
