package packageThreads;

public class myThread extends Thread {
    @Override
    public void run() {
        if (this.isDaemon()) {

            //System.out.println("This thread is running ^0^");
            System.out.println("This is a DAEOMONNNN thread");
        }
        else {
            System.out.println("This user is running");
        }
    }
}



