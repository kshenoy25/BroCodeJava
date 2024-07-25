package packagePolynorhpism;

public class Main {
    public static void main(String[] args) {
        // Polymorphism = greek word for poly - "many", morph - "form"
        //                the ability of an object to identify as more than one data type

        // our car, bicycle, boat identifies as itself but also identifies as vehicle
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};

        for(Vehicle v : racers){
            v.go();

        }
    }
}
