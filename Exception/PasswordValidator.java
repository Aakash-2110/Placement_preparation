import java.util.Scanner;

class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

public class PasswordValidator {

    static void validatePassword(String password) throws WeakPasswordException {
        if (password.length() < 8 || !password.matches(".[A-Z].") || !password.matches(".\\d.")) {
            throw new WeakPasswordException("Password must be at least 8 characters long, contain a number, and an uppercase letter.");
        } else {
            System.out.println("Password is strong.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your password: ");
            String password = sc.nextLine();
            validatePassword(password); 
        } catch (WeakPasswordException e) {
            System.out.println(" Weak Password: " + e.getMessage());
        } finally {
            System.out.println("Password check complete.");
            sc.close();
        }
    }
}