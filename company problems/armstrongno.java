import java.util.*;
public class armstrongno{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int length = 0;
        int sum = 0;
        while(temp!=0)
        {
            length++;
            temp/=10;
        }
        temp = num;
        while(temp!=0) 
        {
            int last = temp%10;
            sum+=Math.pow(last, length);
            temp/=10;
        }
        if(sum==num)
        {
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not armstrong number");
        }
    }
}

