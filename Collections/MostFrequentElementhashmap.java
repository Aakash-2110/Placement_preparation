import java.util.*;
public class MostFrequentElementhashmap{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Hashmap");
        int n = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }

        int result = 0;
        int maxcount = - 1;
        boolean res = false;

        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            int key = e.getKey();
            int count = e.getValue();
            if(!res||count>maxcount)
            {
            maxcount= count;
            result=key;
            res = true;
        }
    }

    if(res)
    {
        System.out.println("Most frequent element" +result);
    }
    sc.close();

    }
}