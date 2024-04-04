import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class duplicatechar {
    
    public static void findDuplicateCharacters(String str) {
        // Create a HashMap to store characters and their frequencies
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        
        // Traverse the string and update the character frequencies in the map
        for (char ch : str.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }
        
        // Print characters with frequency greater than 1 (duplicates)
        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        findDuplicateCharacters(inputString);

        scanner.close();
    }
}
