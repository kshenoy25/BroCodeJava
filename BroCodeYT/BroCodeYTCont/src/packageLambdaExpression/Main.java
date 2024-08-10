package packageLambdaExpression;

public class Main {
    /*   Lambda expression = feature for Java 8 and above, also known as an anonymous method.
                             A shorter way to write anonymous classes with only one method.
                             To use Lambda, we need to use a functional interface or pre-defined functional interface.
                             They contain only one abstract method. (Ex. ActionListener, Runnable, (user-defined))

                             A Lambda expression can be used in any place where a functional interface is required
                             How to use a Lambda expression:
                             (arguments) -> {statement/s}
     */
    public static void main(String[] args) {


        //MyInterface myInterface = () -> System.out.println("Hello World");
        String name = "Kunal";
        char symbol = '!';
        MyInterface myInterface = (n, c) -> {

            System.out.println("Hello World");
            System.out.println("I am a butt head " + n + c);
        };
        MyInterface myInterface2 = (n, c) -> {
            System.out.println("How is it going " + n + c);
        };
       //myInterface.message(name, symbol);
        myInterface2.message(name,symbol);


    }
}
