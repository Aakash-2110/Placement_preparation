import java.util.*;
public class commonfortwoarrayslist
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Size of array list");
        int n = sc.nextInt();
        System.out.println("Element for Array1");
        for(int i=0;i<n;i++)
        {
            int v = sc.nextInt(); //a.add(sc.nextInt());
            a.add(v);
        }
        ArrayList<Integer>a1 = new ArrayList<>();
        System.out.println("Element for Array2");
        for(int i=0;i<n;i++)
        {
            int v = sc.nextInt();
            a1.add(v);
        }
        a.retainAll(a1);
        System.out.println("Common element from both list");
        for(int print : a)
        {
            System.out.print(print +" ");
        }
    }
}
