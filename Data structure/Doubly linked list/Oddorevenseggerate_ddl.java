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
    void oddorevenseggerate()
    {
        if (head == null || head.next==null)
        {
            return;
        }
        Node oddhead = null;
        Node evenhead = null;
        Node oddtail = null;
        Node eventail = null;
        Node cur = head;
        while(cur!=null)
        {
            if(cur.data%2==0)
            {
                if(evenhead==null) //1st even value
                {
                    evenhead=eventail=cur;
                }
                else{
                    eventail.next=cur;
                    cur.prev = eventail;
                    eventail=even.next;
                }
            }
            else{
                if(oddhead==null) //1st odd value
                {
                    oddhead=oddtail=cur;
                }
                else{
                    oddtail.next=cur;
                    cur.prev = oddtail;
                    oddtail=odd.next;
                }
            }
            cur=cur.next;
        }
        if(oddhead!=null&&evenhead!=null)
        {
            eventail.next=oddhead;
            oddhead.prev=eventail;
            oddtail.next = null;
            evenhead.prev = null;
            head=evenhead;
            tail=oddtail;
        }
        else if(evenhead==null)
        {
            head=oddhead;
            tail=oddtail;
        }
        else if(oddhead==null)
        {
            head=evenhead;
            tail=eventail;
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
}
public class Oddorevenseggerate_ddl{
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
        obj.oddorevenseggerate();
    }
}