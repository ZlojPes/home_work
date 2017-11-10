package jv17_05.pavliuk.lesson17.set_actions;

import java.util.*;

public class SetDemo {
    public static Set<?> intersect(Set<?> set1, Set<?> set2) {
        Iterator<?> iterator = set1.iterator();
        Set<Object> out = new HashSet<>();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (!set2.contains(o)) {
                iterator.remove();
            }
        }
        return set1;
    }

    public static Set<?> union(Set<?> set1, Set<?> set2) {
        Iterator<?> iterator = set1.iterator();
        Iterator<?> iterator2 = set2.iterator();
        Set<Object> out = new HashSet<>();
        while (iterator.hasNext()) {
            out.add(iterator.next());
        }
        while (iterator2.hasNext()) {
            out.add(iterator2.next());
        }
        return out;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Set<Integer> set2 = new TreeSet<>();
        set2.addAll(Arrays.asList(5, 6, 7, 8, 9, 10));
        Set<?> out1 = intersect(set1, set2);
        Set<?> out2 = union(set1, set2);
        print(out1);
        print(out2);
    }

    public static void print(Set<?> set) {
        for (Object aSet : set) {
            System.out.print(aSet+", ");
        }
        System.out.println();
    }
}
