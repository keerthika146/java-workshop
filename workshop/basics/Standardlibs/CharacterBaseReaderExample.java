package workshop.basics.Standardlibs;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class CharacterBaseReaderExample {
            public static void main(String[]agrs){
                try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))){
                    String line;
                    while((line=reader.readLine()) != null){
                        System.out.println(line);
                    }
                }catch(IOException e){
                    System.out.println("Error Reading file..");
                    e.printStackTrace();
                }
            }
}
