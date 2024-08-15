package methods;

public class YieldThread extends Thread {
    private String threadName;

    public YieldThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is running: " + i);
            Thread.yield();

            try{
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(threadName + "was interrupted.");
            }
        }
    }
}
