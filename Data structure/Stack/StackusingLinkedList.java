import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int val){
        this.data = val;
        this.next = null;
    }
}

class Stack{
    Node top = null;

    boolean isEmpty(){
        return top == null;
    }

    void push(int val){
        Node nn = new Node(val);
        if(top == null)
            top = nn;
        else{
            nn.next = top;
            top = nn;
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.print("Stack Underflow ");
            return -1;
        } else {
            int data = top.data;
            top = top.next;
            return data;
        }
    }

    int peek(){
        if(isEmpty()){
            System.out.print("Stack is Empty ");
            return -1;
        } else {
            return top.data;
        }
    }


    void display(){
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class StackusingLinkedList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        while(true){
            System.out.println("1.push\n2.pop\n3.peek\n4.display\n5.exit");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    s.push(sc.nextInt());
                    break;
                case 2:
                    System.out.println(s.pop());
                    break;
                case 3:
                    System.out.println(s.peek());
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Choice");                
            } 
        }
    }
}