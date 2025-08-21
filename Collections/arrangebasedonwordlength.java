import java.util.*;
public class arrangebasedonwordlength
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        HashMap<Integer,List<String>hm = new HashMap<>();
        for(String word : str)
        {
              int len = word.length();
              hm.putIfAbsent(len,ArrayList<>());
              hm.get(len).add(word);
        }
        System.out.println(hm);
    }
}