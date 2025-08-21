import java.util.Scanner;

public class DecryptNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Count digits and store in an array
        int temp = num;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = num;

        // Store digits in reverse order (least significant first)
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Swap digits in pairs
        for (int i = 0; i < count - 1; i += 2) {
            int t = digits[i];
            digits[i] = digits[i + 1];
            digits[i + 1] = t;
        }

        // Reconstruct the number
        int decrypted = 0;
        for (int i = 0; i < count; i++) {
            decrypted = decrypted * 10 + digits[i];
        }

        System.out.println("Decrypted number: " + decrypted);
        sc.close();
    }
}