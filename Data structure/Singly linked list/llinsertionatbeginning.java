import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next = null;
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
            nn.next = head;
            head = nn;
        }
    }
    void display()
        {
            Node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
public class llinsertionatbeginning{
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
        sc.close();
    }
}