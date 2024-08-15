package methods;

public class InterruptedThread extends Thread {
    private volatile boolean running = true;
    
    @Override
    public void run() {
        while(running) {
            System.out.println("InterruptedThread is running");

            try{
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("InterruptedThread was interrupted during sleep");
                running = false;
            }
        }
        System.out.println("InterruptedThread has stopped.");
    }
}
