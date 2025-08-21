import java.util.HashSet;
import java.util.Scanner;

public class removedupinhset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) 
        {
            int val = sc.nextInt();
            if(hs.contains(val))
            {
                System.out.println("Duplicate found");
                return;
            }
            hs.add(val);
        }
        System.out.print("No duplicate");
    }
}



