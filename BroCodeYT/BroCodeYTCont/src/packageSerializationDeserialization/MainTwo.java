package packageSerializationDeserialization;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainTwo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //               Steps to Deserialize: converting byte stream into an object
        //               1) Declare your object (don't instantiate)
        //               2) Your class should implement Serializable interface
        //               3) Add import java.io.Serializable;
        //               4) FileInputStream fileIn = new FileInputStream(file, path);
        //               5) ObjectInputStream in = new objectInputStream(fileIn);
        //               6) objectNam = (Class) in.readObject();
        //               7) in.close(); fileIn.close();

        //  ________Important Notes__________
        // Important notes        1) children classes of a parent class that implements Serializable will do as well
        //                        2) static fields are not serialized (they belong to the class, not an individual object)
        //                        3) the class's definition ("class file") itself is not recorded, cast it as the object type
        //                        4) Fields declared as "transient" are not serialized; they are ignored
        //                        5) serialVersion UID is a unique version ID

        User user = null;
        FileInputStream fileIn = new FileInputStream("/Users/k-shenoy/Documents/GitHub/BroCodeJava/BroCodeYT/BroCodeYTCont/UserInfo.ser");

        ObjectInputStream in = new ObjectInputStream(fileIn);

        // User data type cast
        user = (User)in.readObject();
        in.close();

        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();


    }
}
