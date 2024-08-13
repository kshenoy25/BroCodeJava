package packageTernaryOp;

public class Conditional {
    public static void main(String[] args) {
        // is 7 greater than 3 ?
        // if true, store 7 into a.
        // if false, store 3 into a.
        // int a = (7 > 3) ? 7 : 3;
        //

        /*
        int a;

        if(7 > 3){
            a = 7;
        }
        else {
            a = 3;
        }
        System.out.println(a);

         */
        String a = "howdy";

        // data type has to match conditional value
        double result = a.equals("hello") ? 0.5 : 0.25;
        System.out.println(result);

    }
}
