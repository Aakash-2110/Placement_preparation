import java.util.*;

public class numpatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int val = 1; val <= i; val++) {
                System.out.print(count++ + " ");
            }

            // Move to next line
            System.out.println();
        }
    }
}
