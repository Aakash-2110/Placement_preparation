class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}


public class CustomThrowATM {

    static void withdraw(int balance, int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            
            throw new InsufficientBalanceException("Insufficient balance. Cannot withdraw ₹" + amount);
        } else {
            System.out.println("Withdrawal of ₹" + amount + " successful.");
            System.out.println("Remaining Balance: ₹" + (balance - amount));
        }
    }

    public static void main(String[] args) {
        int currentBalance = 3000;

        try {
            System.out.println("Attempting to withdraw ₹5000...");
            withdraw(currentBalance, 5000); 
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }
    }
}