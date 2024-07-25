package packageExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // exception = an event that occurs during the execution of a program that,
        //             disrupts the normal flow of instructions
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("result: " + z);


        }
        catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero dumb fuck ._.");

        }
        catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER A NUMBER IDIOT");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        finally {
            scanner.close();
        }

    }
}
