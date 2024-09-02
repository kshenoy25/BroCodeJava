package packageMultiThreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Multithreading = process of executing multiple threads simultaneously
        //                  Helps maximum  utilization of CPU
        //                  Threads are independent, they don't affect the execution of other threads
        //                  An exception in one thread will not interrupt other threads
        //                  Useful for multiple clients, multiplayer games, or other mutually independent tasks
        //                  Two ways to create thread: extending Thread class or implementing the runnable interface
        //                  Runnable-interface is to be implemented by a class whose instances are intended to be executed
        //                  by a thread

        MultiThread thread1 = new MultiThread();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        // Daemon thread is a low-priority thread running in the background and supports
        // main execution of program without preventing it form exiting
        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        //thread1.join(3000); // calling thread (ex.main) wait until specified thread dies or for x amount of milliseconds
        thread1.join();
        thread2.start();





    }
}
