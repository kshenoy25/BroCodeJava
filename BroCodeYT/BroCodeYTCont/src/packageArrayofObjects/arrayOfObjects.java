package packageArrayofObjects;

public class arrayOfObjects {
    public static void main(String[] args) {

        // Array format recap
        /*
        int [] numbers = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[5];
         */

        
        //Rock[] rocks = new Rock[3];

        Rock rock1 = new Rock("granite");
        Rock rock2 = new Rock("limestone");
        Rock rock3 = new Rock("obsidian");

        Rock[] rocks = {rock1, rock2, rock3};

        //rocks[0] = rock1;
        //rocks[1] = rock2;
        //rocks[2] = rock3;
        
        // if the print statement only has the object & its index,
        // it will print the memory address
        System.out.println(rocks[0].name);
        System.out.println(rocks[1].name);
        System.out.println(rocks[2].name);
        
    }

}
