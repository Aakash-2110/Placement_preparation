import java.util.*;

class StackQueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int data){
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }

        q1.add(data);

        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
    }

    void pop(){
        if(q1.isEmpty()){
            System.out.println("Underflow");
        } else {
            System.out.println(q1.poll());
        }
    }

    void peek(){
        if(q1.isEmpty()){
            System.out.println("Stack is Empty");
        } else {
            System.out.println(q1.peek());
        }
    }

    void display(){
        if(q1.isEmpty()){
            System.out.println("Stack is Empty");
        } else {
            System.out.println(q1);
        }
    }

}

class StackUsingTwoQueue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StackQueue s = new StackQueue();

         while(true){
            System.out.println("1.push\n2.pop\n3.peek\n4.display\n5.exit");
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