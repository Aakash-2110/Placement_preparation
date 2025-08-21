import java.util.Scanner;

class Node{
    int data;
    Node prev, next;
    Node(int data){
        this.data = data;
        prev = next = null;
    }
}

class LinkedList{
    Node head = null, tail = null;

    void insertAtEnd(int val){
        Node nn = new Node(val);
        if(head == null){
            head = tail = nn;
        } else {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }
    }

    void insertAtBegin(int val){
        Node nn = new Node(val);
        if(head==null){
            head = tail = nn;
        } else {
            head.prev = nn;
            nn.next = head;
            head = nn;
        }
    }   

    void displayHeadToTail(){
        Node temp = head;
        System.out.print("null <->");
        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void displayTailToHead(){
        Node temp = tail;
        System.out.print("null <->");
        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}


class doublyinsertionatbegin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int val;    
        while(true){
            val = sc.nextInt();
            if(val==-1) break;
            else ll.insertAtBegin(val);
        } 

        ll.displayHeadToTail();
        ll.displayTailToHead();
    }
}