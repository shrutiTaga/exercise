//12. Program to rotate array elements left by 1 position

import java.util.Arrays;
import java.util.Scanner;

class rotateLeftByOne{
    public static void rotateLeft(int[] arr) {
        if (arr.length <= 1) {
            return; 
        }
        
        int temp = arr[0]; 
      
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
       
        arr[arr.length - 1] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        rotateLeft(a);
        System.out.println("Array after rotating left by 1 position: " + Arrays.toString(a));
    }
}