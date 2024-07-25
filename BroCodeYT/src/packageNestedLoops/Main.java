package packageNestedLoops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // nested loops = a loop inside of a loop

        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;
        String symbol = "";

        System.out.println("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        cols = scanner.nextInt();
        System.out.println("Enter the symbol: ");
        symbol = scanner.next();

        for (int i = 0; i <= rows; i++) {
            System.out.println();
            for (int j = 0; j <= cols; j++) {
                // print will just be on the same line itself and not go to the next
                System.out.print(symbol);
            }
        }
    }
}
