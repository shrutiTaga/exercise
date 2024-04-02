import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maxRepeatedLettersInWord {
    public static String find(String input) {
        String[] words = input.split(" ");
        String maxWord = "";
        int maxCount = 0;

        for (String word : words) {
            Map<Character, Integer> charCount = new HashMap<>();
            int count = 0;
            for (char ch : word.toCharArray()) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
                count = Math.max(count, charCount.get(ch));
            }
            if (count > 1 && count > maxCount) {
                maxWord = word;
                maxCount = count;
            }
        }

        return maxCount > 1 ? maxWord : "-1";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        System.out.println("Result: " + find(input));
    
    }

   
}
