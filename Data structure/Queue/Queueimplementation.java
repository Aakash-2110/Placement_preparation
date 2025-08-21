import java.util.*;

class Myqueue {
    int q[];
    int rear,front;

    Myqueue(int n)
    {
        q= new int[n];
        front = 0;
        rear = -1;
        this.n = n;
        
    }
    void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue Underflow");
        }
        else
        {
            System.out.println("Dequeue element"+ q[f++]);
        }
    }
    boolean isEmpty()
    {
        if(f>r)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void enqueue()
    {
        if(isFull())
        {
            System.out.println("Queue Overflow");
        }
        else{
            q[++r] = val;
        }
    }
    boolean isFull()
    {
        return r==n-1;
    }

}

class Queueusingarray {
    Scanner sc = new scanner(System.in);
    System.out.println("Enter queue size:");
    int size = sc.nextInt();
    Myqueue obj = new Myqueue(size); 
    while(true)
    {
        System.out.println("\n--- Stack Menu ---");
        System.out.println("1. Enqueu");
        System.out.println("2. Dequeu");
        System.out.println("3. Peek");
        System.out.println("4. Display");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int ch =sc.nextInt();
        switch(ch)
        {
            case 1:

        }
    }
}