import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countnumwords {
    
    public static Map<String, Integer> countWords(String str) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        // Split the string into words
        String[] words = str.split("\\s+");
        
        // Count the occurrence of each word
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        return wordCountMap;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        Map<String, Integer> wordCountMap = countWords(inputString);
        
        System.out.println("Word count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}

