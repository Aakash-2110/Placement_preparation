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
            tail.next = nn;
            tail = nn;
        }
    }
    void merge(Node l1, Node l2)
    {
        Node dummy = new Node(0);
        Node h = dummy;
        while(l1!=null&&l2!=null){

            if(l1.data>l2.data){ //l2 hold smallest element
                dummy.next = l2;
                dummy = dummy.next;
                l2=l2.next;
            }
            else{ // l1 hold smallest element 
                dummy.next = l1;
                dummy = dummy.next;
                l1=l1.next;
            }
        }
            if(l1!=null)
            {
                dummy.next=l1;
            }
            if(l2!=null)
            {
                dummy.next=l2;
            }
            Node temp = h.next;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print("null");
    }
}
public class Mergetwosorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedlist list1 = new linkedlist();
        linkedlist list2 = new linkedlist();
        int val;
        while (true) {
            val = sc.nextInt(); 
            if(val==-1)
            {
                break;
            } 
            else{
                list1.insert(val);
            } 
        }
        int val1;
        while (true) {
            val1 = sc.nextInt(); 
            if(val1==-1)
            {
                break;
            } 
            else{
                list2.insert(val1);
            } 
        }
        list1.merge(list1.head,list2.head);
        sc.close();
    }
}