import java.util.*;
public class commonelementfromtwohset
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> a = new HashSet<>();
        System.out.println("enter Hashset Size");
        int n = sc.nextInt();
        System.out.println("Element for hashset 1");
        for(int i=0;i<n;i++)
        {
            int v = sc.nextInt(); //a.add(sc.nextInt());
            a.add(v);
        }
        HashSet<Integer>a1 = new HashSet<>();
        System.out.println("Element for hastset 2");
        for(int i=0;i<n;i++)
        {
            int v = sc.nextInt();
            a1.add(v);
        }
        a.retainAll(a1);
        System.out.println("Common element from both hashset");
        for(int print : a)
        {
            System.out.print(print +" ");
        }
    }
}
