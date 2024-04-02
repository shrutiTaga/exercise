//17. Program to check number Armstrong or not

import java.util.Scanner;

public class checkArmstrong {
    public static boolean check(int number) {
        int originalNumber, digitCount = 0, result = 0;
        originalNumber = number;
        
        while (originalNumber != 0) {
            originalNumber /= 10;
            digitCount++;
        }
        
        originalNumber = number; 
        
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            result += Math.pow(digit, digitCount);
            originalNumber /= 10;
        }
        
        return result == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (check(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}

