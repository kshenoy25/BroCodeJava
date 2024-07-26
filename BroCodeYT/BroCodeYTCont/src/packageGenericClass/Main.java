package packageGenericClass;

import packageAccessModifer2.C;

public class Main {
    public static void main(String[] args) {
        /*
        myGenericClass<Integer> myInt = new myGenericClass<>(5);
        myGenericClass<Double> myDouble = new myGenericClass<>(3.14);
        myGenericClass<Character> myChar = new myGenericClass<>('@');
        myGenericClass<String> myString = new myGenericClass<>("Hello");

         */

        // two parameter passing generics class is similar to hash map class
        myGenericClass<Integer, Integer> myInt = new myGenericClass<>(5, 4);
        myGenericClass<Double, Double> myDouble = new myGenericClass<>(3.14, 5.32);
        myGenericClass<Character, Character> myChar = new myGenericClass<>('@','!');
        myGenericClass<String, Character> myString = new myGenericClass<>("Hello", 'a');

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

    }
}
