package packageGarbageCollection;

import packageDynamicPolymorphism.Cat;

public class Main {

    // garabage collection = automatically manages memory allocation and de-allocation for objects
    //                       young generation heap - holds all new objects ----> moves to old generation heap
    //                       old generation = long-lived objects
    //                       garbage collection - marks, sweeps, and compacts any unused objects
    public static void main(String[] args) {
        doCatStuff();
        // cannot do this as it is outside of scope
        //kitty.meow();
        System.out.println("I'm done doing cat stuff");

    }
    private static void doCatStuff() {
        Kitty kitty = new Kitty();
        kitty.meow();

        // new reference for kitty object
        //kitty = new Kitty();
        kitty = null;

    }
}
