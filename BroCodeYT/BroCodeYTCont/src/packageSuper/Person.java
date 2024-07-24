package packageSuper;

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    // display name and age variables
    public String toString(){
        return this.name + "\n" + age + "\n";
    }
}
