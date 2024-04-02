//13. Program to rotate array elements by Kth position left

import java.util.Arrays;
import java.util.Scanner;

public class rotateArrayLeftByK {
    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 
        
        reverse(arr, 0, k - 1); 
        reverse(arr, k, n - 1); 
        reverse(arr, 0, n - 1); 
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" elements");
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Original Array : "+Arrays.toString(a));
        System.out.println("How much positions you want to rotate the array?");
        int k=sc.nextInt();
        rotateLeft(a, k);
        System.out.println("Array after rotating " + k + " positions to the left: " + Arrays.toString(a));
    }
    
    
    
   
}
