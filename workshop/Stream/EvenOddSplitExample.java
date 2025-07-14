package workshop.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddSplitExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,12,15,18,19,109);
        Map<Boolean,List<Integer>> groupedMap = numbers.stream().collect(Collectors.partitioningBy(no -> no%2 ==o));


        System.out.println("Even Number :" + groupedMap.get(true));
         System.out.println("Odd Number : " + groupedMap.get(false));
        
    }
    
}


