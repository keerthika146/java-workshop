package workshop.collection;
import java.util.ArrayList;
import java.util.List;
public class ListMarks {
    public static void main(String[]args){
        List<Integer>marks=new ArrayList();
           marks.add(99);
           marks.add(78);
           marks.add(60);
           marks.add(90);
           Collection.sort(marks);
           System.out.println("Sorted List of Mark in ascending:"+marks);
           System.out.println(marks);
           System.out.println("Sorted List of marks in descending :"+marks); 
    }

}
