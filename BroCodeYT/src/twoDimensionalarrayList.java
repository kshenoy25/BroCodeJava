import java.util.*;
public class twoDimensionalarrayList {
    public static void main(String[] args) {
        // 2D ArrayList = a dynamic list of lists
        // You can change the size of these lists during run time
        

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");



        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("bell peppers");
        produceList.add("coffee");
        produceList.add("Chicken breast");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("pasta");
        drinkList.add("garlic bread");
        drinkList.add("donuts");

        groceryList.add(bakeryList);
        groceryList.add(drinkList);
        groceryList.add(produceList);

        //System.out.println(drinkList.get(2));
        //System.out.println(groceryList);
        //System.out.println(groceryList.get(1));
        // to get an item within the list you code the following down below
        System.out.println(groceryList.get(0).get(2));

    }

}
