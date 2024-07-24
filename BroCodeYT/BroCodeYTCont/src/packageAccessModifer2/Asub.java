package packageAccessModifer2;
import packageAccessModifier1.*;
// extending a class gives code reusability & efficiency
public class Asub extends A {
    public static void main(String[] args) {
        /*
        original example for default & public access modifiers
        C c = new C();
        System.out.println(c.publicMessage);

         */


        // protected
        Asub a = new Asub();
        // can access this protected due to Asub extending A class where protected variable is declared
        System.out.println(a.protectedMessage);



    }

}
