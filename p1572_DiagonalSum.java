import java.util.Scanner;


public class p1572_DiagonalSum {
     static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        int i = 0, j = 0;

        // Sum of primary diagonal
        while (i < n && j < n) {
            sum += mat[i][j];
            i++;
            j++;
        }

        i = 0;
        j = n - 1;

        // Sum of secondary diagonal (excluding already counted elements)
        while (i < n && j >= 0) {
            if (i != j) {
                sum += mat[i][j];
            }
            i++;
            j--;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test Case
        int[][] testMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int result = diagonalSum(testMatrix);
        System.out.println("Test Case Diagonal Sum: " + result);  // Expected Output: 25

        // User Input Test
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int n = scanner.nextInt();
        int[][] mat = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        result = diagonalSum(mat);
        System.out.println("User Input Diagonal Sum: " + result);
    }
}
