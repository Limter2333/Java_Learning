import java.util.Stack;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadClassDemo {

    /**
     * In the original program, the threads were controlled by their lifecycle, and the
     * daemon was operated by JVM, so those thread didn't stop until the JVM notice them.
     * Although the that sound reasonable, the system keep outputting 'Hello' or 'Goodbye'
     * after the numbers are given. In order to solve this program, two locks are involved
     * to share the state of the system.All the threads must seize one lock to process,
     * once one number has been guessed, one lock is removed.All threads stop running when
     * no lock are left. The program stop immediately after all numbers have been guessed.
     * So you will see 'Correct!***' as the last output of console.
     */

    public static void main(String[] args) {
        Stack<Lock> locks = new Stack<>();
        Lock myLovelyLock1 = new ReentrantLock();
        Lock myLovelyLock2 = new ReentrantLock();

        locks.push(myLovelyLock1);
        locks.push(myLovelyLock2);

        Runnable hello = new DisplayMessage("Hello",locks);
        Thread thread1 = new Thread(hello);
        // 守护线程
        thread1.setDaemon(true);
        thread1.setName("hello");
        System.out.println("Starting hello thread...");
        thread1.start();

        Runnable bye = new DisplayMessage("Goodbye",locks);
        Thread thread2 = new Thread(bye);
        // 线程优先级
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.setDaemon(true);
        System.out.println("Starting goodbye thread...");
        thread2.start();

        System.out.println("Starting thread3...");
        Thread thread3 = new GuessANumber(12,locks);
        thread3.start();

        System.out.println("Starting thread4...");
        Thread thread4 = new GuessANumber(17,locks);
        thread4.start();

        System.out.println("main() is ending...");
    }
}
