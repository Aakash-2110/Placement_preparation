import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class countunique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < n; i++) 
        {
            a.add(sc.next());
        } 
        HashSet<String>hs = new HashSet<>(a);
        System.out.println("unique element :"+hs.size());

    }
    
}
