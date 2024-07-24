package packageAbstract;

public class Main {
    public static void main(String[] args) {
        // abstract = abstract classes cannot be instantiated, but they can have a subclass
        //            abstract methods are declared without an implementation(without a body)
        // ex. go to a dealership being asked what type of car to see. Then say vehicle
        // which is too generic, too abstract
        // abstract keyword adds layer of security to program and can be applied to classes
        // and methods

        //Vehicle vehicle = new Vehicle();

        Car car = new Car();
        car.go();


    }
}
