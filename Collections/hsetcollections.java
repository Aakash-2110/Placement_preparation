import java.util.*;
public class hsetcollections {
    public static void main(String[] agrs){
        HashSet<Integer>hs=new HashSet<>();
        hs.add(13);
        hs.add(33);
        hs.add(50);
        hs.add(45);
        System.out.println(hs);
        for(int val : hs)
        {
            System.out.print(val+" ");
        }
        Iterator<Integer>it=hs.iterator();
        System.out.println();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
}  