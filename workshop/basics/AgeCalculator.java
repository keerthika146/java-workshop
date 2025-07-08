package workshop.basics;
import java.util.Scanner;
public class AgeCalculator {
            public static void main(String[]args){
                System.out.println("Enter you Date of Birth (yyy-mm-od):");
                String dateofBirth = inputScanner.nextline();
                Localdate birthDate = LocalDate.Parse(dateofBirth);
                int yearofBirth = birthDate.getYear();
                int currentYear = LocalDate.now().grtYear();
            }
}
