import java.util.*;
public class starodd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<=n-i;space++)
            {
                System.out.print(" ");
            }
            for (int val = 1; val <= 2*i-1; val++) 
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
