import java.util.*;
public class diamond{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<=n-i+1;space++)
            {
                System.out.print(" ");
            }
            for (int val = 1; val <= i; val++) 
            {
                System.out.print("*" + " ");
            }
            System.out.println();  
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int space=1;space<=n-i+1;space++)
            {
                System.out.print(" ");
            }
            for (int val = 1; val <= i; val++) 
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
