package workshop.beans.string;

public class StringEx {
    public static void main(String[] args) {
         String sentance = "This program shows how can we spilt a string into multiple string.we need to find" 
                            "sentence," + "word and letter count";
            String words[] = sentance.split(" ");
            for(String word : words){
                System.out.println(word);
    }

}
}
