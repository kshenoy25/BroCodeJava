package packageAnonymousInner;

public class Main {
    /* Anonymous class  = an inner class without a name
                          only a single object is created from one.
                          The object may have "extras" or "changes" and no need to create a separate inner class
                          when needed only once.
                          Helps us to avoid cluttering code with a class name

                          Syntax is similar to a constructor,
                          except that there is also a class definition within a block of code.
                          *Great for action listeners

     */



    public static void main(String[] args) {
        // create instance
        Greeting greeting = new Greeting() {
            @Override
            public void greet(){
                System.out.println("Yo bro!");
            }
        };
        Greeting greeting2 = new Greeting() {
            public void greet(){
                System.out.println("Greetings!");
            }
        };
        greeting.greet();
        greeting2.greet();
    }
}
