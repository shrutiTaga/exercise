//15. Program to find string is anagram or not.


import java.util.Arrays;
import java.util.Scanner;

public class checkAnagram {
    public static boolean check(String str1, String str2) {
     
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        if (str1.length() != str2.length()) {
            return false;
        }
       
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter first string");
       String str1=sc.nextLine();
       System.out.println("Enter second string");
       String str2=sc.nextLine();
        
        if (check(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
    
    
}
