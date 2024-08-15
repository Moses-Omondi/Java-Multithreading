package methods;

public class JoinThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread Running : " + i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Thread Interrupted.");
            }
        }
    }
}
