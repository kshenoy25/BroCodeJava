package packageThreads;

public class mainThread {
    // "main" is a thread
    public static void main(String[] args) throws InterruptedException {
        //System.out.println(Thread.activeCount());
        //Thread.currentThread().setName("BUNDA");
        //System.out.println(Thread.currentThread().getName());

        //Thread.currentThread().setPriority(1);
        //System.out.println(Thread.currentThread().getPriority());

        //System.out.println(Thread.currentThread().isAlive());

        /*


        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("You are done");

         */
        myThread thread2 = new myThread();
        //thread2.setDaemon(true);
        thread2.setDaemon(false);

        System.out.println(thread2.isDaemon());
        thread2.start();
        // print a new thread you need to start it
        //thread2.start();
        //System.out.println(thread2.isAlive());

        //thread2.setName("HungusChungus");
        //System.out.println(thread2.getName());
        //System.out.println(thread2.getPriority());
        //thread2.setPriority(2);
        //System.out.println(thread2.getPriority());

        System.out.println(Thread.activeCount());

    }


}
