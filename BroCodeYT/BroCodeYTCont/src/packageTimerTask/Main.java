package packageTimerTask;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    // Timer =           A facility for threads to schedule tasks
    //                   for future execution in a background thread

    // TimerTask =       A task that can be scheduled for one-time or repeated execution by a Timer

    public static void main(String[] args) {

        Timer timer = new Timer();

        TimerTask timerTask = new TimerTask() {
            // when time is up, execute run function of our TimerTask instance
            int counter = 10;

            @Override
            public void run() {
                //System.out.println("Task is comeplete :)");
                if(counter > 0){
                    System.out.println(counter + " seconds");
                    counter--;
                }
                else{
                    System.out.println("WOMP WOMP");
                    timer.cancel();
                }


            }
        };

        Calendar date = Calendar.getInstance();
        // using our object date, use to set values using class type
        date.set(Calendar.YEAR, 2024);
        date.set(Calendar.MONTH, Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH, 31);
        date.set(Calendar.HOUR_OF_DAY, 23);
        date.set(Calendar.MINUTE, 59);
        date.set(Calendar.SECOND, 50);
        date.set(Calendar.MILLISECOND, 0);
        //timer.schedule(timerTask, 1);

        // adding task
        //timer.schedule(timerTask, date.getTime());

        // schedule at fixed rate method : repeat a task every so often
        //timer.scheduleAtFixedRate(timerTask, 0, 1000);
        timer.scheduleAtFixedRate(timerTask, date.getTime(), 1000);

    }
}
