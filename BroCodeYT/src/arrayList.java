
import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {
        // ArrayList = a resizeable array.
        //             Elements can be added and removed after compilation phase
        //             store reference data types

        ArrayList <String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("butter chicken");
        food.add("hotdog");


        food.set(0,"sushi");
        food.remove(2);
        food.clear();



        // Arrays use .length()
        // ArrayList uses .size()
        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }




    }
}
