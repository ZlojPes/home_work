package jv17_05.pavliuk.lesson17.pet;

import java.util.*;

public class PetShop {
    public static void main(String[] args) {
        Map<String, Pet> map = new LinkedHashMap<>();
        map.put("Tomas", new Cat());
        map.put("Chacky", new Dog());
        map.put("Kesha", new Parrot());
        printKeys(map);
        printAll(map);
    }

    private static void printKeys(Map<String, Pet> map) {
        System.out.println(map.keySet());
    }

    private static void printAll(Map<String, Pet> map) {
        for (String name : map.keySet()) {
            System.out.println("" + name + " is " + map.get(name).getType());
        }
    }
}
