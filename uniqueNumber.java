// 6.program to print unique number in an array

import java.util.Scanner;

class uniqueNumber {
    public static int findUniqueNumber(int[] a) {
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans = ans ^ a[i];
        }
        return ans;
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
        System.out.println("The unique number in an array is : " + findUniqueNumber(a));
    }
}