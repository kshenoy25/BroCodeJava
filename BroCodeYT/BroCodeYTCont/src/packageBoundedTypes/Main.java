package packageBoundedTypes;

import packageGenericClass.myGenericClass;

public class Main {
    public static void main(String[] args) {

        // bonded types  = you can create the objects of a generic class to have
        //                 data of specific derived types x.Number

        myGenericClassTwo<Integer, Integer> myInt = new myGenericClassTwo<>(5, 4);
        myGenericClassTwo<Double, Double> myDouble = new myGenericClassTwo<>(3.14, 5.32);

        /*
        myGenericClassTwo<Character, Character> myChar = new myGenericClassTwo<>('@','!');
        myGenericClassTwo<String, Character> myString = new myGenericClassTwo<>("Hello", 'a');

         */


        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        //System.out.println(myChar.getValue());
        //System.out.println(myString.getValue());


        }
}

