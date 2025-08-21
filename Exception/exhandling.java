import java.util.*;
class exhandling
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int n = sc.nextInt();
            System.out.println("value is"+n);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic handled");
        }
        catch(InputMismatchException e)
        {
            System.out.println("InputMismatch handled");
        }
        catch(Exception e)
        {
            System.out.println("Exception handled "+e);
        }
        sc.close();
    }
}