import java.util.Random;

public class DiceRollerDemo {

    // constructor 
    DiceRollerDemo() {
        Random random = new Random();
        int number = 0;
        roll(random, number);
    }
    void roll(Random random, int number){
        number = random.nextInt() + 1;
        System.out.println(number);


    }
    

}
