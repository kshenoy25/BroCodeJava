package packageCopyObjects;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari", "Spider", 2023 );
        //Car car2 = new Car("Nissan", "GTR", 2024 );

        // here we are overloading constructors within Car class
        Car car2 = new Car(car1);

        // copying object
        //car2.copy(car1);

        System.out.println(car1);
        System.out.println(car2);

        // car 1
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        // car 2
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        System.out.println();

    }
}
