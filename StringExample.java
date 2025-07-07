

public class StringExample {
        public static void main(StringExample[]args){
            String sentance = "This program shows how can we spilt a string into multiple string";
            String words[] = sentance.split(" ");
            for(String word : words){
                System.out.println(word);
            }
        }
}


