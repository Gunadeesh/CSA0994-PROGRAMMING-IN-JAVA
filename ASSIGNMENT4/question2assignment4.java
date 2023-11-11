class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
        }
    }
}

public class question2assignment4 {
    public static void main(String[] args) {
        // Creating three threads
        PriorityThread thread1 = new PriorityThread("Thread 1");
        PriorityThread thread2 = new PriorityThread("Thread 2");
        PriorityThread thread3 = new PriorityThread("Thread 3");

        // Setting priorities for the threads
        thread1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
        thread3.setPriority(Thread.MAX_PRIORITY);  // Priority 10

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
