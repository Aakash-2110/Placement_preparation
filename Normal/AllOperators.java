import java.util.*;

public class AllOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        // Arithmetic Operators
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational (Comparison) Operators
        System.out.println("\n--- Relational Operators ---");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Logical Operators
        System.out.println("\n--- Logical Operators ---");
        System.out.println("(a > 0 && b > 0) : " + (a > 0 && b > 0));
        System.out.println("(a > 0 || b > 0) : " + (a > 0 || b > 0));
        System.out.println("!(a > 0) : " + !(a > 0));

        // Bitwise Operators
        System.out.println("\n--- Bitwise Operators ---");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));

        // Assignment Operators
        System.out.println("\n--- Assignment Operators ---");
        int x = a;
        x += b;
        System.out.println("x += b: " + x);
        x -= b;
        System.out.println("x -= b: " + x);
        x *= b;
        System.out.println("x *= b: " + x);
        x /= b;
        System.out.println("x /= b: " + x);
        x %= b;
        System.out.println("x %= b: " + x);

        // Ternary Operator
        System.out.println("\n--- Ternary Operator ---");
        int max = (a > b) ? a : b;
        System.out.println("Greatest number is: " + max);

        sc.close();
    }
}
