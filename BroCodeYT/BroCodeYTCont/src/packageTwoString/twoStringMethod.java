package packageTwoString;

public class twoStringMethod {

    public static void main(String[] args) {
        
    

    // toString() = special method that all objects inherit,
    //              that returns a string that "textually represents" an object.
    //              can be used both implicitly & explicitly 
    //              you can override the toString method to return a String representation of all
    //              of the attributes of an object

    /*
    package5.Food food = new package5.Food();
    System.out.println(food);
    package5.Food@7ad041f3 ------ address in memory of the object
     */


    Food food = new Food();

    // food.toString is explicit use of the toString method
    //System.out.println(food.toString());
    // food - implicit use of the toString method when using print or print line statement
    System.out.println(food);

    /*
    System.out.println(food.fruit);
    System.out.println(food.meat);
    System.out.println(food.veg);
    System.out.println(food.priceTotal);
     */



    }
}   
