package packageSerializationDeserialization;

import java.io.*;

public class transientMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //  serielVersionUID = serialVersionUID is a unique ID that functions like a version #
        //                     verifies that the sender and receiver of a serialized object,
        //                     have loaded classes for that object that match
        //                     Ensures object will be compatible between machines
        //                     Number must match. otherwise this will cause a InvalidClassException
        //                     A SerialVersionUID will be calculated based on class properties, members, etc
        //                     A serializable class can declare its own serialVersionUID explicitly (recommended)


        //


        User user = new User();
        user.name = "Kunal ";
        user.password = "Password123";

        FileOutputStream fileOut =new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("object info saved!");
        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);


        //user.sayHello();


    }
}
