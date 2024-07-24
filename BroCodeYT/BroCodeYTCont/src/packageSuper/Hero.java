package packageSuper;

public class Hero extends Person{
    String power;

    Hero(String name, int age, String power) {
        super(name, age);
        // do not have to use "this" when referring to parent class
        //this.name = name;
        //this.age = age;
        this.power = power;

    }
    public String toString(){
        return super.toString() + "\nPower: " + power;
    }
}
