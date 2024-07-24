package packageMethodOverriding;

public class Dog extends Animal {

    // this method is considered overriding
    // if you have the below block of code is annotated, in main
    // when dog.speak(); is called, it will return content from Animal parent class

    @Override
    void speak(){
        System.out.println("The dog goes *bark*");
    }

}

