import java.util.*;

public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Spiral traversal
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {
            // Left to right
            for (int i = left; i <= right; i++)
                result.add(matrix[top][i]);
            top++;

            // Top to bottom
            for (int i = top; i <= bottom; i++)
                result.add(matrix[i][right]);
            right--;

            // Right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    result.add(matrix[bottom][i]);
                bottom--;
            }

            // Bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    result.add(matrix[i][left]);
                left++;
            }
        }

        // Print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
