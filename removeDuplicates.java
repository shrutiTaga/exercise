
//14. Program to remove duplicate elements from the array
import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] result = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                result[j++] = arr[i];
            }
        }
        result[j++] = arr[n - 1];
        int[] uniqueArray = Arrays.copyOf(result, j);
        return uniqueArray;
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
        System.out.println("Original Array : " + Arrays.toString(a));
        int[] uniqueArray = removeDuplicates(a);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }

}
