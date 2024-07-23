package packageStatic;

public class Main {
    public static void main(String[] args) {
        /// static = modifier. A single copy of a variable/method is created and shared.
        //           The class "owns" the static member
        // It is possible, however not recommended, to access the static var -
        // using the named instance of an object from said class

        Friend friend1 = new Friend("Parker");
        Friend friend2 = new Friend("Lexi");
        Friend friend3 = new Friend("Abby");



        //System.out.println(Friend.numFriends);
        Friend.displayFriends();

    }
}
