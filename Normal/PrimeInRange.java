import java.util.*;
public class PrimeInRange {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int start=in.nextInt();
        int end=in.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + " are: ");
        for(int i=start;i<=end;i++)
            if(isPrime(i))
                System.out.print(i +" ");
            }
        }
