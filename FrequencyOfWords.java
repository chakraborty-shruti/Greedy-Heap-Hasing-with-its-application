//Given a sentence find the frequency of occurence of each word in the sentence 

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Test{

    public static void main(String[] args) {
        String sentence = "How are you today ? Will you join school from today?";

        //Step 1: Remove punctuation and convert to lowercase for case insensitivity
        sentence = sentence.replaceAll("[^a-zA-Z ]", "");

        //Step 2:Split into words
        String[] words = sentence.split("//s+");

        //Step 3: Use HashMap to count frequencies
        Map<String, Integer> wordCount = new HashMap<>();
        for(String word : words){
            if(!word.isEmpty()){
                //Ensure non-empty words
                wordCount.put(word,wordCount.getOrDefault(word,0) + 1);
            }
        }

        //Step 4: Use TreeMap to store words in lexicographical order
        TreeMap<String, Integer> sortedWordCount = new TreeMap<>(wordCount);

        //Step 5: Print the result
        System.out.println("Word Frequency");
        for(Map.Entry<String, Integer> entry : sortedWordCount.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}