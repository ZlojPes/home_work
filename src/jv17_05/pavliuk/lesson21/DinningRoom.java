package jv17_05.pavliuk.lesson21;

import java.util.*;

public class DinningRoom {
    public static long start = new Date().getTime();

    public static void main(String[] args) {
        DinningRoom dinningRoom = new DinningRoom();
        Philosopher[] philosophers = new Philosopher[5];

        List<Fork> forks = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            forks.add(new Fork(i));
        }
        for (int i = 0; i < 5; i++) {
            philosophers[i] = new Philosopher(i + 1 + "-й философ", forks.get(0), forks.get(1), start);
            Collections.rotate(forks, 1);
            philosophers[i].start();
        }
        for (int i = 0; i < 5; i++) {
            try {
                philosophers[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
