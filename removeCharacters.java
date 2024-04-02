//11 - String question - Remove all characters from string except alphabets

import java.util.Scanner;

class removeCharacters{
    public static String removeNonAlphabets(String input) {
        String regex = "[^a-zA-Z]";
        
        String result = input.replaceAll(regex, "");
        
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        
        String result = removeNonAlphabets(input);
        
        System.out.println("String after removing non-alphabetic characters: " + result);
        
    }
}