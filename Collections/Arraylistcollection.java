import java.util.*;
public class Arraylistcollection
{
    public static void main(String[] agrs)
    {
        ArrayList<Integer>a = new ArrayList<>();
        a.add(11);
        a.add(22);
        a.add(33);
        a.add(44);
        System.out.println(a);
        for(int i = 0;i<a.size();i++)
        {
            System.out.print(a.get(i)+" ");
        }
        System.out.println();
        a.set(0,99);
        System.out.println("Value "+a.get(0));
        for(int val:a)
        {
            System.out.print(val+" ");
        }
    }
}

