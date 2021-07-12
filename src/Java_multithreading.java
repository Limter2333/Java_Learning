//import javax.swing.*;
//class RunnableDemo implements Runnable {
class Java_multithreading extends Thread {
    private Thread t;
    private String threadName;

    Java_multithreading(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

class TestThread {
    public static void main(String args[]) {
        Java_multithreading M1 = new Java_multithreading("Thread-1");
        M1.start();

        Java_multithreading M2 = new Java_multithreading("Thread-2");
        M2.start();
    }
}
