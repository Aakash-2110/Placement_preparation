import java.util.*;

public class Arraysize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        int[] arr1=new int[size1];
        int[] arr2=new int[size2];
        int sum1=0;
        int sum2=0;
        if(arr1.length!=arr2.length)
        {
            System.out.print("Not same");
        }
        else{
            for(int i = 0;i<size1;i++)
            {
                arr1[i]=sc.nextInt();
            }
            for(int i = 0;i<size2;i++)
            {
                arr2[i]=sc.nextInt();
            }
        }
        for(int i = 0;i<size1;i++)
        {
            arr1[i]=sum1+arr1[i];
            sum1=arr1[i];
        }
        for(int i = 0;i<size2;i++)
        {
            arr2[i]=sum2+arr2[i];
            sum2=arr2[i];
        }

        if(sum1==sum2)
        {
            System.out.println("same");
        }
        else{
            System.out.println("Not same");
        }

            sc.close();
    }
}