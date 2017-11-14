package jv17_05.pavliuk.lesson17;

import java.util.*;

public class SetActions {
    public static Set<?> intersect(Set<?> set1, Set<?> set2) {
        Set<Object> out = new HashSet<>(set1);
        out.retainAll(set2);
        return out;
    }

    public static Set<?> union(Set<?> set1, Set<?> set2) {
        Set<Object> out = new HashSet<>();
        out.addAll(set1);
        out.addAll(set2);
        return out;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Set<Integer> set2 = new TreeSet<>();
        set2.addAll(Arrays.asList(5, 6, 7, 8, 9, 10));
        System.out.print("Intersect: ");
        print(intersect(set1, set2));
        System.out.print("Union: ");
        print(union(set1, set2));
    }

    public static void print(Set<?> set) {
        for (Object aSet : set) {
            System.out.print(aSet + ", ");
        }
        System.out.println();
    }
}
