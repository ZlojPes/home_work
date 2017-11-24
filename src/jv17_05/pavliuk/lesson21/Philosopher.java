package jv17_05.pavliuk.lesson21;

public class Philosopher extends Thread {
    private String philosopherName;
    private final Fork leftFork, rightFork;

    public Philosopher(String philosopherName, Fork leftFork, Fork rightFork) {
        this.philosopherName = philosopherName;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void run() {
        while (true) {
            if(leftFork.getNumber()<rightFork.getNumber()){
                synchronized (leftFork){
                    synchronized (rightFork){
                        System.out.println(philosopherName+" кушает");
                        try {
                            Thread.sleep((int)(Math.random()*4000+1000));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(philosopherName+" размышляет");
                    }
                }
            }else{
                synchronized (rightFork){
                    synchronized (leftFork){
                        System.out.println(philosopherName+" кушает");
                        try {
                            Thread.sleep((int)(Math.random()*4000+1000));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(philosopherName+" размышляет");
                    }
                }
            }
        }
    }
}
