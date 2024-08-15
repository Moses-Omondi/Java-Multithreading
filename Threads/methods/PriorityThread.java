package methods;

public class PriorityThread extends Thread {
    private String threadName;

    public PriorityThread(String name, int priority) {
        this.threadName = name;
        setPriority(priority);
    }

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(threadName + " with priority " + getPriority() + " is running: " + i);

            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
    }
}
