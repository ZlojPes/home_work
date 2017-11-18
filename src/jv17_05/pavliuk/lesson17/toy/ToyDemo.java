package jv17_05.pavliuk.lesson17.toy;

import java.util.*;

public class ToyDemo {
    public static void main(String[] args) {
        Toy toy1 = new Toy("Doll", 34);
        Toy toy2 = new Toy("Car", 45);
        Toy toy3 = new Toy("Box", 56);

        Map<String, Toy> toys = new TreeMap<>();
        toys.put(toy1.getName(), toy1);
        toys.put(toy2.getName(), toy2);
        toys.put(toy3.getName(), toy3);

        iterateEntry(toys);
        iterateKeys(toys);
        iterateValues(toys);
    }

    private static void iterateValues(Map<String, Toy> toys) {
        Collection<Toy> col = toys.values();
        for (Toy toy : col) {
            System.out.println(toy);
        }
    }

    private static void iterateKeys(Map<String, Toy> toys) {
        Set<String> set = toys.keySet();
        for (String key : toys.keySet()) {
            System.out.println("Ключ: " + key + " Значение: " + toys.get(key));
        }
    }

    private static void iterateEntry(Map<String, Toy> toys) {
        Set<Map.Entry<String, Toy>> set = toys.entrySet();
        for (Map.Entry<String, Toy> entry : set) {
            System.out.println("Ключ: " + entry.getKey() + " Значение: " + entry.getValue());
        }
    }
}
