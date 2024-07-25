package package5;

public class arrayExample {
    public static void main(String[] args) {
    // array = used to store multiple values in a single variable

    String[] carsGiven = new String[3];
    carsGiven[0] = "Camaro";
    carsGiven[1] = "Toyota";
    carsGiven[2] = "Ferrari";

    for (int i = 0; i < carsGiven.length; i++){
        System.out.println(carsGiven[i]);
    }
    }



}
