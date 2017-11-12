package jv17_05.pavliuk.lesson17;

import jv17_05.pavliuk.lesson17.treeset.HeavyBox;

import java.util.*;

public class SortHeavyBox {
    public static void main(String[] args) {
        Set<HeavyBox> boxSet = new TreeSet<>();
        boxSet.add(new HeavyBox(1, 2, 3, 5));
        boxSet.add(new HeavyBox(1, 2, 3, 50));
        boxSet.add(new HeavyBox(1, 2, 3, 305));
        boxSet.add(new HeavyBox(1, 2, 3, 14));
        boxSet.add(new HeavyBox(1, 2, 3, 1));
        boxSet.add(new HeavyBox(1, 2, 3, 50));
        boxSet.add(new HeavyBox(1, 2, 3, 425));
        boxSet.add(new HeavyBox(1, 2, 3, 14));
        boxSet.add(new HeavyBox(1, 2, 3, 1024));
        System.out.println("More than 300:"+sort(boxSet));
        System.out.println("Less than 300:"+boxSet);
    }

    private static Set<HeavyBox> sort(Set<HeavyBox> boxSet) {
        Set<HeavyBox> out = new TreeSet<>();
        Iterator<HeavyBox> iterator = boxSet.iterator();
        while (iterator.hasNext()) {
            HeavyBox box = iterator.next();
            if (box.getWeight() > 300) {
                out.add(box);
                iterator.remove();
            }
        }
        return out;
    }
}
