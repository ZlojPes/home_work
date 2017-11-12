package jv17_05.pavliuk.lesson17;

import jv17_05.pavliuk.lesson17.treeset.HeavyBox;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by student on 11/12/2017.
 */
public class HeavyBoxDeque {
    public static void main(String[] args) {
        Deque<HeavyBox> deque = new ArrayDeque<>();
        deque.offer(new HeavyBox(1, 2, 3, 7));
        deque.offer(new HeavyBox(1, 2, 3, 3));
        deque.offer(new HeavyBox(1, 2, 3, 115));
        deque.offer(new HeavyBox(1, 2, 3, 13));
        deque.offer(new HeavyBox(1, 2, 3, 22));
        while (deque.size() > 0) {
            System.out.println(deque.poll());
        }
    }
}
