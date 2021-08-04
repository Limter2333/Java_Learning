import java.util.Stack;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DisplayMessage implements Runnable {
    private String message;
    private Stack<Lock> locks;

    public DisplayMessage(String message, Stack<Lock> locks) {
        this.message = message;
        this.locks = locks;
    }

    public  void run() {
        while (true) {
            int i = 0;

            if (locks.isEmpty() || !locks.peek().tryLock()) {
                if (locks.isEmpty())
                    return;
                continue;
            }
            System.out.println(message);

            locks.peek().unlock();
        }
    }
}
