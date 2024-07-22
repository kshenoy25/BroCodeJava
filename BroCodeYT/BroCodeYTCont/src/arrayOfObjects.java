public class arrayOfObjects {
    public static void main(String[] args) {

        // Array format recap
        /*
        int [] numbers = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[5];
         */

        
        Rock[] rocks = new Rock[3];

        Rock rock1 = new Rock("granite");
        Rock rock2 = new Rock("limestone");
        Rock rock3 = new Rock("obsidian");

        rocks[0] = rock1;
        rocks[1] = rock2;
        rocks[2] = rock3;

        System.out.println(rocks[0].name);




        
    }

}
