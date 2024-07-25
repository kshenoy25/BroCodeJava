package packageConstructorExample;

public class Human {

    String name;
    int age;
    double weight;


    Human(String name, int age, double weight){
        // in 'this' case it refers to human object in our constructor
        this.age = age;
        this.name = name;
        this.weight = weight;



    }
    void eat(){
        System.out.println("This person," + this.name + ",is eating!");
    }
    void drink(){
        System.out.println(this.name + " is drinking....*burp*");
    }





}
