package workshop.basics;

import java.util.Scanner;

public class NameGenerater{
            public static void main(String[]args){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter your name:");
                String name=Scanner.name();
                System.out.println("Enter your gender");
                String gender=Scanner.next();
                System.out.println("Enter your qualification");
                String qualification=Scanner();
                StringBuilder sb=new StringBuilder();
                if("Female".equalsIgnoreCase(gender)){
                    sb.append("miss").append(gender);
                } 
            }
}
 