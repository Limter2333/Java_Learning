import java.util.Stack;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class GuessANumber extends Thread {
    private int number;
    private Stack<Lock> locks;

    public GuessANumber(int number,Stack<Lock> lock) {
        this.number = number;
        this.locks = lock;
    }

    public synchronized void run() {
        int counter = 0;
        int guess = 0;
        while (true) {
            if (locks.isEmpty() || !locks.peek().tryLock()) {
                if (locks.isEmpty())
                    return;
                continue;
            }
            guess = (int) (Math.random() * 100 + 1);
            System.out.println(this.getName() + " guesses " + guess);
            counter++;
            if (guess != number) {
                locks.peek().unlock();
            } else {
                break;
            }
        }
        System.out.println("** Correct!" + this.getName() + "in" + counter + "guesses.**");
        Lock peek = locks.pop();
        peek.unlock();

    }
}

