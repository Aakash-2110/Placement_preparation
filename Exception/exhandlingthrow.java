import java.util.*;
class exhandlingthrow
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try{
            int age = sc.nextInt();
            if(age<=0)
            {
                throw new InputMismatchException("Age cannot negative or zero");
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception handles "+e);
        }
        finally
        {
            System.out.println("Programs end");
        }
        sc.close();
    }
}