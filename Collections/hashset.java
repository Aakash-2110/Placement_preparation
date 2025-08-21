import java.util.*;
class hashset{
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
    }
}