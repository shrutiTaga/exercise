// 8. Write a program to count the number of even and odd integers in a given array of integers.

import java.util.Scanner;

class countEvenOdd {
    public static int countEven(int[] a) {
        int count_even = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count_even++;
            }
        }
        return count_even;
    }

    public static int countOdd(int[] a) {
        int count_odd = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                count_odd++;
            }
        }
        return count_odd;
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
        System.out.println("Count of Even Integers : " + countEven(a));
        System.out.println("Count of Odd Integers : " + countOdd(a));
    }
}