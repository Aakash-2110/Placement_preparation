import java.util.*;

// Encapsulated ATM class
class ATM {
    private String name;
    private double bal;

    // Setter for name
    public void setname(String name) {
        this.name = name;
    }

    // Setter for balance
    public void setbal(double bal) {
        if (bal < 0) {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.bal = 0.0;
        } else {
            this.bal = bal;
        }
    }

    // Deposit money
    public void deposit(double amt) {
        if (amt > 0) {
            bal += amt;
            System.out.println("Deposited Rs." + amt + " successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public void withdrawl(double amt) {
        if (amt > 0 && amt <= bal) {
            bal -= amt;
            System.out.println("Withdrawn Rs." + amt + " successfully.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    // Getter for balance
    public double getbal() {
        return bal;
    }

    // Optional: Getter for name
    public String getname() {
        return name;
    }
}

// Mainss class
public class Atmpgm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ATM obj = new ATM();

        // User input for name and initial balance
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter initial balance: ");
        double bal = in.nextDouble();

        obj.setname(name);
        obj.setbal(bal);

        int choice;
        double amt;

        // Menu loop
        do {
            System.out.println("\nWelcome, " + obj.getname());
            System.out.println("Enter your choice:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    amt = in.nextDouble();
                    obj.deposit(amt);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amt = in.nextDouble();
                    obj.withdrawl(amt);
                    break;
                case 3:
                    System.out.println("Your current balance is: Rs." + obj.getbal());
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        in.close();
    }
}
