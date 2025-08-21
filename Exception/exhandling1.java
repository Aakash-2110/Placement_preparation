import java.util.*;
class exhandling1
{
    public static void main(String[] args)
    {
        int c = 0;
        Scanner sc = new Scanner(System.in);
        try
        {
            int a[] = new int[5];
            c = sc.nextInt();
            a[5]=c; //Last array index is 4
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