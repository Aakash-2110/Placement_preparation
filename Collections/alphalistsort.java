import java.util.*;

public class alphalistsort {
    public static void main(String[] args)
    {
        ArrayList<String>str = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
            str.add(sc.next());   
        }
        Collections.sort(str);
        System.out.print(str);
    }
    
}
