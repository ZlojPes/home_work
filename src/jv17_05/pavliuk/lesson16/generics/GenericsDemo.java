package jv17_05.pavliuk.lesson16.generics;

import jv17_05.pavliuk.lesson11.animals.Cat;

/**
 * Created by student on 11/5/2017.
 */
public class GenericsDemo {
    public static void main(String[] args) {
        Generics<String, Cat, Integer> generics = new Generics<>("String", new Cat("KitiCat", "Tom", 80), 5);
        generics.getVarTypes();
    }
}
