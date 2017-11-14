package jv17_05.pavliuk.lesson17.treeset;

import java.util.*;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<HeavyBox> boxSet = new TreeSet<>();
        boxSet.add(new HeavyBox(1, 2, 3, 5));
        boxSet.add(new HeavyBox(1, 2, 3, 50));
        boxSet.add(new HeavyBox(1, 2, 3, 25));
        boxSet.add(new HeavyBox(1, 2, 3, 14));
        boxSet.add(new HeavyBox(1, 2, 3, 1));
        for (HeavyBox box : boxSet) {
            System.out.println(box);
        }
    }
}
