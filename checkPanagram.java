//16. Program to check string is pangram or not

import java.util.Scanner;

public class checkPanagram {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the string");
       String str=sc.nextLine();
        
        if (isPangram(str)) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }
    
    public static boolean isPangram(String str) {

        boolean[] mark = new boolean[26];
        
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (Character.isLetter(ch)) {
                mark[ch - 'a'] = true;
            }
        }
        for (boolean value : mark) {
            if (!value) {
                return false;
            }
        }
        
        return true;
    }
}
