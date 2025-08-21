import java.util.Scanner;

class Stack {
    int s[];
    int top, n;

    Stack(int n) {
        s = new int[n];
        top = -1;
        this.n = n;
    }

    void push(int val) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            s[++top] = val;
            System.out.println(val + " pushed to stack");
        }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
        } else {
            System.out.println("Popped: " + s[top--]);
        }
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
        } else {
            System.out.println("Peek: " + s[top]);
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == n - 1;
    }

    void size() {
        System.out.println("Size is " + (top + 1));
    }
}

public class Stackusingarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        Stack st = new Stack(size);

        while (true) {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Size");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    st.push(val);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    st.size();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
