import java.util.*;
class exhandling3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try 
        {
            int n = sc.nextInt();
            try
            {
                int arr[] = new int [n]; // whole inner try block(try and catch like if else) become
                int val = sc.nextInt();  // error and throw it outer catch block
                arr[7]=val;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid input "+e);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception "+e);
        }
        sc.close();
    }
}