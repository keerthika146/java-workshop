package workshop.collection.NameStart;
import java.util.ArrayList<>;
public class NameStartsWithSCount {
    List<String> names = new ArrayList<>();
                public static void main(String[]args){
                    names.add("keethi");
                    names.add("mathi");
                    names.add("nithu");
                    names.add("sabi");
                    names.add("viveka");
                    names.add("sathya varsha");
                    long nameCount = names.stream()
                    .filter(name->name.startsWith("S")).count();
                    System.out.println(nameCount);
                }
}
