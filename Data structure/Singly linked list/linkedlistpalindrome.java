import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList1 {
    Node head = null, tail = null;

    void insert(int val) {
        Node nn = new Node(val);
        if (head == null) {
            head = tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    Node rev(Node n) {
        Node cur = n;
        Node prev = null, next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    void checkPal() {
        if (head == null || head.next == null) {
            System.out.println("Palindrome");
            return;
        }

        // Step 1: Find middle
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node fh = head;
        Node sh = slow.next;
        slow.next = null; // disconnect fh & sh

        // Step 2: Reverse second half
        sh = rev(sh);

        // Step 3: Compare halves
        Node t1 = fh, t2 = sh;
        while (t1 != null && t2 != null) {
            if (t1.data != t2.data) {
                System.out.println("Not a Palindrome");
                return;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        System.out.println("Palindrome");
    }
}

public class linkedlistpalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList1 l1 = new LinkedList1();
        int val;
        while (true) {
            val = in.nextInt();
            if (val == -1) {
                break;
            } else {
                l1.insert(val);
            }
        }
        l1.display();
        l1.checkPal();
    }
}  