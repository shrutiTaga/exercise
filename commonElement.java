// 7. Write a program to find common elements between two arrays

import java.util.ArrayList;
import java.util.Scanner;

class commonElement {
    public static void findCommonElement(int a1[], int a2[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    list.add(a1[i]);
                }
            }
        }
        System.out.println("Common elements between two arrays : " + list);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in first array");
        int n1 = sc.nextInt();
        System.out.println("Enter " + n1 + " elements");
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements in second array");
        int n2 = sc.nextInt();
        System.out.println("Enter " + n2 + " elements");
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        findCommonElement(a1, a2);
    }
}