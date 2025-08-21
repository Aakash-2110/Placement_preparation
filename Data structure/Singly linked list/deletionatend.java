import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
}

class linkedlist {
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

    void deleteend() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = tail = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class deletionatend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedlist obj = new linkedlist();
        int val;
        while (true) {
            val = sc.nextInt();
            if (val == -1) {
                break;
            } else {
                obj.insert(val);
            }
        }
        obj.display();
        obj.deleteend();
        obj.display();
        sc.close();
    }
}
