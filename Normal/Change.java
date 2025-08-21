import java.util.*;

public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int replace;
        int[] arr = new int[size+1];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int position = sc.nextInt();
        if(position<size+1)
        {
            replace=sc.nextInt();
            for (int i = size-1;i>=position-1;i--)
            {
                arr[i+1]=arr[i];
            } 
            arr[position-1]=replace;          
        }
        else
        {
            System.out.println("Invalid Input");
        }
        for(int i=0;i<=size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
