// 5. Program to reverse original array.

import java.util.Arrays;
import java.util.Scanner;
class reverseArray{
    public static int[] reverseArray(int[] a)
    {
        int i=0;
        int j=a.length-1;
        while (i<j) {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return a;
    }
    public static void main(String args[])
    {
        
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
        reverseArray(a);
        System.out.println("Reversed Array : "+Arrays.toString(a));
    }
}