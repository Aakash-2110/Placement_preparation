import java.util.*;
public class Thirty {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int cost30=0;
		int cost60=0;
		int cost120=0;
		int flag=1;
		for(int i=0;i<n;i++)
		{
			if(a[i]==30)
			{
				cost30+=1;
			}
			else if(a[i]==60)
			{
				if(cost30>=1)
				{
					cost30-=1;
					cost60+=1;
				}
				else
				{
					System.out.println("Failed");
					return;
				}
			}
			else if(a[i]==120)
			{
				if(cost60>=1 && cost30>=1)
				{
					cost60-=1;
					cost30-=1;
					cost120+=1;
				}
				else if(cost30>=3)
				{
					cost30-=3;
					cost120+=1;
				}
				else
				{
					System.out.println("Transaction Failed");
					return;
				}
			}
			
			
		}
		System.out.println("Transaction Successful");
	}

}
