import java.util.*;

class Queuestack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void push(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        s1.push(data);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    void pop(){
        if(s1.isEmpty()){
            System.out.println("Underflow");
        } else {
            System.out.println(s1.pop());
        }
    }

    void peek(){
        if(s1.isEmpty()){
            System.out.println("Queue is Empty");
        } else {
            System.out.println(s1.peek());
        }
    }

    void display(){
        if(s1.isEmpty()){
            System.out.println("Queue is Empty");
        } else {
            System.out.println(s1);
        }
    }

}

class QueueUsingTwoStack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queuestack s = new Queuestack();

         while(true){
            System.out.println("1.Enqueue\n2.Dequeue\n3.Peek\n4.Display\n5.Exit");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    s.push(sc.nextInt());
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
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