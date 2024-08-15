import syncmethods.*;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        SyncThread thread1 = new SyncThread(counter, "threadOne");
        SyncThread thread2 = new SyncThread(counter, "threadTwo");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Final count : " + counter.getCount());
    }
}
