package packageStatic;

public class Friend {
    String name;
    static int numFriends = 0;


    Friend(String name){
        this.name = name;
        numFriends++;
    }

    static void displayFriends(){
        System.out.println("You have " + numFriends + " friends");
    }
}
