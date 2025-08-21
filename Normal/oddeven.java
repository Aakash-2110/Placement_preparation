import java.util.*;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1=0;
        int sum2=0;
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                sum1=sum1+arr[i];
            }
            else
            {
                sum2=sum2+arr[i];
            }
        }
        System.out.println("The sum of the even numbers in the array is "+sum1);
        System.out.println("The sum of the odd numbers in the array is "+sum2);
        sc.close();
    }
}