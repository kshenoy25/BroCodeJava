package packageEncapsulation;

public class Main {
    // Encapsulation = attributes of a class will be hidden or private,
    //                 can be accessed only through methods (getters & setters)
    //                 You should make attributes private if you don't have a reason
    //                 to make them public/protected
    //                 Encapsulation adds a level of security to the program
    public static void main(String[] args) {

        Car car = new Car("Mustang", "GT", 2024);
        // retrieving from setter methods
        car.setYear(2025);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
}
