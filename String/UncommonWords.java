import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWords {
    public String[] uncommonFromSentences(String s1, String s2) {
        String s3 = s1 + ' '+ s2;  // not using concat because it won't add space between two strings

        Map<String, Integer> map = new HashMap<>(); //creating a new hashmap

        String[] words = s3.split("\\s+");   //regex is of space

        for(String word : words){
            map.put(word,map.getOrDefault(word,0) + 1);  //adding words and there occurance in hashmap
        }

        List<String> uncommonWords = new ArrayList<>();  //new arraylist for the words which are having only one occurance

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                uncommonWords.add(entry.getKey());   //adding the single occurance word in list
            }
        }

        return uncommonWords.toArray(new String[0]);  //converting list of string to array of string and returning it.
    }

    public static void main(String args[]){
        UncommonWords obj = new UncommonWords();

        String str1 = "this apple is sweet";

        String str2 = "this apple is sour";

        String[] words = obj.uncommonFromSentences(str1, str2);

        for(String word : words){
            System.out.println(word);
        }
    }
}

