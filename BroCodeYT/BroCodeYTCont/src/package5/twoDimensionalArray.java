package package5;

public class twoDimensionalArray {
    public static void main(String[] args) {
        // 2D array: an array of arrays

        // initalization of object cars with Strind reference data type
        // String[][] cars = new String[3][3];


        String[][] cars = {
            {"Camaro", "Corvette", "Silverado"},
            {"Masarati", "Lotus", "Mercedes"},
            {"Toyota", "Mistabushi", "BMW"} 



        };

        for (int i=0; i<cars.length; i++){
            System.out.println();
            for(int j=0; j<cars[i].length; j++){
                System.out.println(cars[i][j] + " ");
            }
        }
        
    }

}
