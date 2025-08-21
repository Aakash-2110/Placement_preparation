import java.util.*;
class Generateparanthesis
{
    static ArrayList<String> List = new ArrayList<>();
    static void generate(int n,int op,int cl,String str)
    {
        if(op==n && cl==n)
        {
            List.add(str);
            return;
        }
        if(op<n)
        {
            generate(n, op+1, cl,str+"(");
        }
        if(cl<op)
        {
            generate(n,op,cl+1,str+")");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of parentheses: ");
        int n = sc.nextInt();
        String str = "";
        generate(n,0,0,str);
        for(String s : List)
        {
            System.out.println(s);
        }
    }
}