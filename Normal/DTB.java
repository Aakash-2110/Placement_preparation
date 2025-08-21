import java.util.*;
public class DTB {
    static void DecimalToBinary(int n){
        if (n==0)
            return;
        DecimalToBinary(n/2);
        System.out.print(n%2);      
    }
    public static void main(String[] args) {
        Scanner  in=new Scanner(System.in);
        int n=in.nextInt();
        if(n==0)
            System.out.println("0");
        else
              DecimalToBinary(n);
        }
} 