package workshop.basics.Standardlibs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyUsingBinary {
            public static void main(String[]args){
                try(FileInputStream InputStream=new FileInputStream("shinchan.jpeg");
                FileOutputStream OutputStream=new FileOutputStream("MyLogo.jpeg")){
                    byte[]chunk=new byte[2048];
                    int byteRead;
                    while((byteRead=InputStream.read(chunk))!=-1){
                        OutputStream.write(chunk,0,byteRead);
                    }
                }catch(IOException e){
                    System.out.println("Error in reading or writing the file");
                }
            }
}
