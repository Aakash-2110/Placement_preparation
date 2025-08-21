import java.util.*;
public class revarraylist
{
    public static void main(String[] agrs)
    {
        ArrayList<Integer>a = new ArrayList<>();
        a.add(34);
        a.add(23);
        a.add(99);
        a.add(79);
        Collections.sort(a);
        for(int val : a)
        {
             System.out.print(val+" ");
        }
        System.out.println("");
        for (int i = a.size()-1; i >=0; i--) 
        {
             System.out.print(a.get(i)+" ");   
        }
    }
}
