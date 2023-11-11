public class question1assignment4 {
    public static void main(String args[]) {
        // Get the reference to the current thread (main thread)
        Thread t = Thread.currentThread();

        // Set the name of the current thread
        t.setName("New Thread");

        // Print information about the current thread
        System.out.println(t);
    }
}
