//9. Write a program to find a missing number in an array.

import java.util.Scanner;

class missingNumber {
    public static int findMissingNumber(int[] a) {
        int actualSum = 0, expectedSum = 0;
        for (int i = 1; i <= a.length + 1; i++) {
            expectedSum += i;
        }
        for (int i = 0; i < a.length; i++) {
            actualSum += a[i];
        }
        return expectedSum - actualSum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The missing number in an array is : " + findMissingNumber(a));
    }
}