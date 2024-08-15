package syncmethods;

public class SyncThread extends Thread {
    private Counter counter;
    private String threadName;

    public SyncThread(Counter counter, String threadName) {
        this.counter = counter;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            counter.increment();
        }

        System.out.println(threadName + " has finished incrementing. Intermediate count: " + counter.getCount());
    }
}
