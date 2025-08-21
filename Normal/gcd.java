import java.util.*;
public class gcd{
public static void main(String[] agrs){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    while(((a%=b)!=0)&&((b%a)!=0))
    System.out.println(a+b);
}
}