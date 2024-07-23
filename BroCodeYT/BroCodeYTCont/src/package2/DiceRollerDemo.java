package package2;

import java.util.Random;

public class DiceRollerDemo {
    // global variables : outsid of the method
    Random random;
    int number = 0;

    // constructor 
    DiceRollerDemo() {
        //Random random = new Random();
        random = new Random();
        //int number = 0;
        // declared variables as local
        roll(random, number);
    }
    void roll(Random random, int number){
        number = random.nextInt(6) + 1;
        System.out.println(number);


    }
    

}
