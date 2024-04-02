
//19. Find the index of two array elements whose sum is equal to the given value
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class findIndex {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices of the two numbers whose sum is equal to the target:");
            System.out.println("Index 1: " + result[0] + ", Index 2: " + result[1]);
        } else {
            System.out.println("No such indices found.");
        }

    }

}
