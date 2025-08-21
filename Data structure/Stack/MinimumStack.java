import java.util.*;
import java.util.Stack;

class minStack{
	Stack <Integer> s=new Stack<>();
	Stack <Integer> a=new Stack<>();
	void push(int val)
	{
		if(s.isEmpty())
		{
			s.push(val);
			a.push(val);
		}
		else
		{
			s.push(val);
			if(!a.isEmpty() && a.peek()>=val)
			{
				a.push(val);
			}
		}
	}
	void pop()
	{
		if(s.isEmpty())
		{
			return;
		}
		else
		{
			int popped=s.pop();
			if(!a.isEmpty() && a.peek()==popped)
			{
				a.pop();
			}
		}
	}
	int getMin()
	{
		if(a.isEmpty())
		{
			return -1;
		}
		else
		{
			return a.peek();
		}
	}
}
public class MinimumStack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        minStack obj = new minStack();
        while(true)
        {
            System.out.println("1.Push\n2.Push\n3.GetMin\n4.Exit");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    obj.push(val);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    int res = obj.getMin();
                    System.out.println(res);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}