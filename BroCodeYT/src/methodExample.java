public class methodExample {
    public static void main(String[] args) {
        // method = is a block of code that is executed whenever it is called upon

        /*
        String name = "Kunal";
        int age = 26;
        hello(name, age);
         
         */
        // local variables of the main method
         int x = 3;
         int y = 4;
        
         //int z = add(x, y);
         System.out.println(add(x, y));


    }
    /*
         static void hello(String name, int age){
        //System.out.println("Hello " + name + "." + "I am " + age + ".");
        System.out.println("Hello " + name);
        System.out.println("I am " + age);
     }
     */

    static int add(int x, int y){
        // local variables of add method
        int z = x + y;
        return z;
    }

 

}
