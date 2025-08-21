import java.util.*;
public class Secondlargest{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max=0;
        int secondmax=0;
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt(); 
        }
        for(int i = 0;i<n;i++)
        {
            if(arr[i]>max)
            {
                secondmax=max;
                max=arr[i];
            }
            if(arr[i]>secondmax && arr[i]<max)
            {
                secondmax=arr[i];
            }
        }
        System.out.println(secondmax);
    }
}