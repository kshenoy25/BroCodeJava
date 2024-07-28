package packageMultiThreading;

public class Main {
    public static void main(String[] args) {
        // Multithreading = process of executing multiple threads simultaneously
        //                  Helps maximum  utilization of CPU
        //                  Threads are independent, they don't affect the execution of other threads
        //                  An exception in one thread will not interrupt other threads
        //                  Useful for multiple clients, multiplayer games, or other mutually independent tasks

        MultiThread thread1 = new MultiThread();

        MyRunnable runnable1 = new MyRunnable();

        Thread thread2 = new Thread(runnable1);
        




    }
}
