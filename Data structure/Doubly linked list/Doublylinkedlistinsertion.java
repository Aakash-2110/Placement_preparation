import java.util.*;

class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data=data;
        next = null;
        prev = null;
    }
} 
class linkedlist{
    Node head = null, tail = null;
    void insert(int val)
    {
        Node nn = new Node(val);
        if(head==null)
        {
            head = tail = nn;
        }
        else{
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }
    }
    void display()
        {
            Node temp = head;
            System.out.print("null <=>");
            while(temp!=null)
            {
                System.out.print(temp.data + "<=>");
                temp = temp.next;
            }
            System.out.println("null");
        }
    void displayrev()
        {
            Node temp = tail;
            System.out.print("null <->");
            while(temp!=null)
            {
                System.out.print(temp.data + "<=>");
                temp = temp.prev;
            }
            System.out.println("null");
        }
    }
public class Doublylinkedlistinsertion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedlist obj = new linkedlist();
        int val;
        while (true) {
            val = sc.nextInt(); 
            if(val==-1)
            {
                break;
            } 
            else{
                obj.insert(val);
            } 
        }
        obj.display();
        obj.displayrev();
        sc.close();
    }
}