import java.util.*;
class exhandlingfinally
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            System.out.println("Value "+n);

        }
        catch(Exception e)
        {
            System.out.println("Exception handling "+e);
        }
        finally{
            System.out.println("Program completed");
        }
        sc.close();
    }
}