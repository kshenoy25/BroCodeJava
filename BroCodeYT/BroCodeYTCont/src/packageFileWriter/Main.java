package packageFileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue\nHaleys Booty Booty Booty Booty Mmmhmm Booty");
            writer.append("\n(A poem by Haleys bitch)");
            writer.close();

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
