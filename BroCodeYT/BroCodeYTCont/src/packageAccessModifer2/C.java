package packageAccessModifer2;
import packageAccessModifier1.*;
    public class C {
// default class without any access modifier is only available to the class itself or in package.
// not outside the scope
    //class C {
    public String publicMessage = "This is public message";
    // protected access modifier = accessible to a different class in a different package
    // as long as class is a sub-class of whatever class contains protected member
    protected String protectedMessage = "This is protected message";
    // only visible to class not even if it is in a package
    private String privateMessage = "This is a private message";
    // default
    String defaultMessage = "This is the default message";
}
