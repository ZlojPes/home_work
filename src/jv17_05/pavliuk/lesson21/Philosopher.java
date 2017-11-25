package jv17_05.pavliuk.lesson21;

import java.util.Date;

public class Philosopher extends Thread {
    private String philosopherName;
    private final Fork leftFork, rightFork;
    private long start;

    public Philosopher(String philosopherName, Fork leftFork, Fork rightFork, long start) {
        this.philosopherName = philosopherName;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.start = start;
    }

    public void run() {
        while (new Date().getTime() - start < 30000) {
            if (leftFork.getNumber() < rightFork.getNumber()) {
                synchronized (leftFork) {
                    synchronized (rightFork) {
                        System.out.println(philosopherName + " кушает");
                        try {
                            Thread.sleep((int) (Math.random() * 4000 + 1000));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(philosopherName + " размышляет");
                    }
                }
            } else {
                synchronized (rightFork) {
                    synchronized (leftFork) {
                        System.out.println(philosopherName + " кушает");
                        try {
                            Thread.sleep((int) (Math.random() * 4000 + 1000));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(philosopherName + " размышляет");
                    }
                }
            }
        }
    }
}
