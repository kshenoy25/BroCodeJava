package packageGenerics;

public class Main {
    public static void main(String[] args) {
        // Generics = enables types (classes and interfaces) to be parameters when defining:
        //            classes, interfaces, and methods
        //            a benefit is to eliminate the need to create multiple versions
        //            of methods or classes for various data types
        //            Use 1 version for all reference data types

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "y", "E"};

        //displayArray(intArray);
        //displayArray(doubleArray);
        //displayArray(charArray);

    }

    public static <Thing>void displayArray(Integer[] array) {
        for (Integer x : array) {
            System.out.print(x + "");

        }
        System.out.println();
    }

    /*
        public static void displayArray(Double[] array) {
        for (Double x : array) {
            System.out.print(x + "");

        }
        System.out.println();
    }

    public static void displayArray(Character[] array) {
        for (Character x : array) {
            System.out.print(x + "");

        }
        System.out.println();
    }

     */

}

