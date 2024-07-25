package packageDynamicPolymorphism;

import java.util.Scanner;

public class Main {
    // polymorphism = many shapes/forms
    // dynamic = after compilation (during runtime)

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal animal;
        //Animal animal = new Animal();
        System.out.println("What animal do you want?");
        System.out.println("(1=cat), (2=dog): ");
        int choice = scanner.nextInt();

        if (choice == 1){
            animal = new Cat();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Dog();
            animal.speak();
        }
        else{
            animal = new Animal();
            System.out.println("Choice was invalid...");
            animal.speak();
        }

    }


}
