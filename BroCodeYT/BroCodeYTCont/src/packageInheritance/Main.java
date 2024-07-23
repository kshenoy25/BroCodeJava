package packageInheritance;

public class Main {
    // inheritance = the process where one class acquires,
    //               the attributes and methods of another
    public static void main(String[] args) {

        Car car = new Car();
        //car.go();

        Bicycle bicycle = new Bicycle();
        //bicycle.stop();

        //System.out.println(car.speed);
        //System.out.println(bicycle.speed);

        System.out.println(car.doors);
        System.out.println(bicycle.pedals);


    }
}
