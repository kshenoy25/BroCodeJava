package packageSerializationDeserialization;

import java.io.Serializable;

public class UserTwo implements Serializable {

    String name;
    //String password;
    transient String password;


    public void sayHello(){
        System.out.println("Hello " + name);
    }
}