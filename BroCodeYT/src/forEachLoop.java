public class forEachLoop {
    public static void main(String[] args) {
        // for-each = traversing technique to iterate through the elements in an array/collection
        //             Advantages include less steps, more readable
        //             Disadvantage include less flexibility

        String[] animals = {"cat", "dog", "rat", "bird"};


        // : = for in
        for (String i : animals){
            System.out.println(i);

        }
    }

}
