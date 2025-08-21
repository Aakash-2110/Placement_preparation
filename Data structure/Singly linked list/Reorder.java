// IP : 7 9 21 32 54 46
// OP : 7 46 9 54 21 32

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
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
    Node rev(Node n){
        Node cur=n;
        Node prev=null,next=null;
        while (cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    void checkReorder(){
        Node dummy=new Node(0);
        Node h=dummy;
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node fh=head;
        Node sh=slow.next;
        slow.next=null; //disconnect the fh&sh
        //step2
        sh=rev(sh);
        //step3
        while (fh!=null && sh!=null){
            dummy.next=fh;
            dummy=dummy.next;
            fh=fh.next;

            dummy.next=sh;
            dummy=dummy.next;
            sh=sh.next;
            if(fh!=null){ // odd no of total element  list
                dummy.next=fh;
            }
        }
        Node temp=h.next;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
public class Reorder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        linkedlist l=new linkedlist();
        int val;
        while (true){
            val=in.nextInt();
            if(val==-1){
                break;
            }
            else {
                l.insert(val);
            }
        }
        l.checkReorder();
    }
}