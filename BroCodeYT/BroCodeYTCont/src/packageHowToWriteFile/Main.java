package packageHowToWriteFile;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // file = an abstract representation of file and directory pathnames
        // if you want to access file in project you follow as shown
        // if file is located in another area on your computer you find it via the pathway
        File file = new File("secret_message.txt");

        if(file.exists()){
            System.out.println("That file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }
        else{
            System.out.println("Oopsie no file exists. Womp Womp.");
        }

    }
}
