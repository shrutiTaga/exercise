//10 - 2D matrix question - Find row with maximum no. of 1’s
import java.util.Scanner;
class rowWithMaxOne {
    public static int findMaxOnesRow(int[][] matrix) {
        int row = -1;
        int maxOnesCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            int onesCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount > maxOnesCount) {
                maxOnesCount = onesCount;
                row = i;
            }
        }

        return row;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix:");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int row = findMaxOnesRow(matrix);

        System.out.println("Row with maximum number of 1's: " + row);
    }
}