import java.util.Scanner;

public class MmPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take size input
        System.out.print("Enter the size of M: ");
        int n = sc.nextInt();

        // Loop through rows
        for (int i = 0; i < n; i++) {
            // Loop through columns
            for (int j = 0; j < n; j++) {
                // Print * at left border, right border, left diagonal, right diagonal
                if (j == 0 || j == n - 1 || (j == i && i <= n / 2) || (j == (n - 1 - i) && i <= n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // double space
                }
            }
            System.out.println();
        }

        sc.close();
    }
}