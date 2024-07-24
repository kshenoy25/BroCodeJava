package packageSuper;

public class Main {
    public static void main(String[] args) {
        // super = keyword refers top the superclass (parent) of an object
        //         very similar to the "this" keyword referring to the class
        //         the keyword contains

        Hero hero1 = new Hero("Batman", 42, "$$$");
        Hero hero2 = new Hero("Superman", 38, "Everything");

        System.out.println(hero2.toString());


    }
}
