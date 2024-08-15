import methods.*;

public class Main {
    public static void main(String[] args) {
        // /**
        //  * The first part works with classes StartThread and JoinThread
        //  * 
        //  */

        // StartThread thread = new StartThread();
        // thread.start();

        // JoinThread joinThread = new JoinThread();
        // joinThread.start();

        // try {
        //     joinThread.join();
        // } catch (InterruptedException e) {
        //     System.out.println("Main Thread Interrupted.");
        // }

        // System.out.println("Main thread continues after JoinThread completes.");


        // /**
        //  * This works with InterruptedThread class.
        //  */

        //  InterruptedThread interruptedThread = new InterruptedThread();
        //  interruptedThread.start();

        //  try{
        //     Thread.sleep(5000);
        //  } catch(InterruptedException e) {
        //     System.out.println("Main thread interrupted.");
        //  }

        //  interruptedThread.interrupt();

        //  try{
        //     interruptedThread.join();
        //  } catch(InterruptedException e) {
        //     System.out.println("Main thread interrupted.");
        //  }

        //  System.out.println("Main thread continues after interruptedThread finishes.");

        //  /*
        //   * This works for the class YieldThread
        //   */

        //   YieldThread yieldThread1 = new YieldThread("Thread 1");
        //   YieldThread yieldThread2 = new YieldThread("Thread 2");

        //   yieldThread1.start();
        //   yieldThread2.start();

        //   try{
        //     yieldThread1.join();
        //     yieldThread2.join();
        //   } catch(InterruptedException e) {
        //     System.out.println("Main thread interrupted.");
        //   }

        //   System.out.println("Main thread continues after yield threads finish.");

          /*
           * Works for PriorityThread
           */
          PriorityThread highPriorityThread = new PriorityThread("HighPriorityThread", Thread.MAX_PRIORITY);
          PriorityThread lowPriorityThread = new PriorityThread("lowPriorityThread", Thread.MIN_PRIORITY);

          highPriorityThread.start();
          lowPriorityThread.start();

          try {
              highPriorityThread.join();
              lowPriorityThread.join();
          } catch(InterruptedException e) {
              System.out.println("Main thread interrupted.");
          }

          System.out.println("Main thread continues after priority thread finishes.");
    }
}
