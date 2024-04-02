// 4. Sorting first half of array in Ascending order and second half in Descending order

import java.util.Arrays;
import java.util.Scanner;

class sortAscDesc{
    public static void sortArray(int[] a)
    {
        int mid=a.length/2;
        for(int i=0;i<mid;i++)
        {
            for(int j=i+1;j<mid;j++)
            {
                if(a[i]>a[j])
                {
                    int swap=a[i];
                    a[i]=a[j];
                    a[j]=swap;
                }
            }
        }
        for(int i=mid;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    int swap=a[i];
                    a[i]=a[j];
                    a[j]=swap;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter "+n+" elements one by one");
for(int i=0;i<n;i++)
{
    a[i]=sc.nextInt();
}
System.out.println("Original Array : "+Arrays.toString(a));
sortArray(a);
System.out.println("Sorted Array : "+Arrays.toString(a));

    }
}