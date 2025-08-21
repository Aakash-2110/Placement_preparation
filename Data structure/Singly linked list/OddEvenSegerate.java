import java.util.*;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		next=null;
	}
}
class OddEvenSeggregate{
	Node head=null;
	Node tail=null;
	void insert(int val)
	{
		Node newnode=new Node(val);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		}
		else
		{
			tail.next=newnode;
			tail=newnode;
		}
	}
	void oddeven()
	{
		if(head==null || head.next==null)
		{
			System.out.print(head);
		}
		else
		{
		Node odd=new Node(0);
		Node even=new Node(0);
		Node oddtail=odd;
		Node eventail=even;
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data%2!=0)
			{
				oddtail.next=temp;
				oddtail=oddtail.next;
				
			}
			else
			{
				eventail.next=temp;
				eventail=eventail.next;
				
			}
			temp=temp.next;	
		}
		eventail.next=null;
		oddtail.next=even.next;
	    temp=odd.next;
	    while(temp!=null)
	    {
	    	System.out.print(temp.data+" -> ");
	    	temp=temp.next;
	    }
	    System.out.print("null");	
	}
}
}
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		OddEvenSeggregate obj=new OddEvenSeggregate();
		int val;
		while(true)
		{
			val=sc.nextInt();
			if(val!=-1)
			{
				obj.insert(val);
				
			}
			else
			{
				break;
			}
		}
		obj.oddeven();
			
		}

	}