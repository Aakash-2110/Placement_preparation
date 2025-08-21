import java.util.*;
class reverseusingbuilder{
    
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String rev = new StringBuilder(s).reverse().toString();
        if(s.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        sc.close();

    }
}
