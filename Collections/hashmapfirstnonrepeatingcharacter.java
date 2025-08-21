
import java.util.*;

public class hashmapfirstnonrepeatingcharacter {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Character,Integer>lhm = new LinkedHashMap<>();
        String str = sc.nextLine();
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++)
        {
            char ch = a[i];
            lhm.put(ch,lhm.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character,Integer>ent:lhm.entrySet())
        {
            if(ent.getValue()==1)
            System.out.println(ent.getKey());
            return;
        }
    System.out.println("Null");
    }
    
}
