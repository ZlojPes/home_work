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
        int leftForkNum = leftFork.getNumber(), rightForkNum = rightFork.getNumber();
        while (new Date().getTime() - start < 30000) {
            if (leftForkNum < rightForkNum) {
                System.out.println(philosopherName + " хочет взять " + leftForkNum + "-ю вилку");
                synchronized (leftFork) {
                    System.out.println(philosopherName + " взял " + leftForkNum + "-ю вилку и хочет взять " + rightForkNum + "-ю вилку");
                    synchronized (rightFork) {
                        System.out.println(philosopherName + " взял " + rightForkNum + "-ю вилку и кушает");
                        try {
                            Thread.sleep((int) (Math.random() * 4000 + 1000));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(philosopherName + " положил " + rightForkNum + "-ю вилку и размышляет");
                    }
                    System.out.println(philosopherName + " положил " + leftForkNum + "-ю вилку");
                }
            } else {
                System.out.println(philosopherName + " хочет взять " + rightForkNum + "-ю вилку");
                synchronized (rightFork) {
                    System.out.println(philosopherName + " взял " + rightForkNum + "-ю вилку и хочет взять " + leftForkNum + "-ю вилку");
                    synchronized (leftFork) {
                        System.out.println(philosopherName + " взял " + leftForkNum + "-ю вилку и кушает");
                        try {
                            Thread.sleep((int) (Math.random() * 4000 + 1000));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(philosopherName + " положил " + leftForkNum + "-ю вилку и размышляет");
                    }
                    System.out.println(philosopherName + " положил " + rightForkNum + "-ю вилку");
                }
            }
        }
    }
}
