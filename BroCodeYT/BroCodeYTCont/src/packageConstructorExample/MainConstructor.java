package packageConstructorExample;

public class MainConstructor {

    // Constructor = special method that is called when an object is instantiated (created)
    //               they allow us to construct object that have varying attributes

    public static void main(String[] args) {
        Human human1 = new Human("Kunal", 26, 165.00);
        Human human2 = new Human("Kiran", 53, 173.00);

        //System.out.println(human1.name);
        human1.eat();
        human2.drink();

        
    }
}
