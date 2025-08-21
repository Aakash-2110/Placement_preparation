import java.util.*;
public class GCDrecursive {
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
          return gcd(b,a%b);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int result=gcd(a,b);
        System.out.println("GCD of "+a+ " and "+b+ " is " +result);
    }
}