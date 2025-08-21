import java.util.*;

public class Infixtopostfixconversion
{
    void Infixtopostfix(String str)
    {
        String res= "";
        Stack<Character>st = new Stack<>();
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('+',1);
        hm.put('-',1);
        hm.put('*',2);
        hm.put('/',2);
        hm.put('^',3);
        for(int i =0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                res+=ch;
            }
            else if(ch=='(')
            {
                st.push(ch);
            }
            else if(ch==')')
            {
                while(!st.isEmpty() && st.peek()!='(')
                {
                    res+=st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty()&&(hm.getOrDefault(ch,0))<=(hm.getOrDefault(st.peek(),0)))
                {
                    res+=st.pop();
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty())
        {
            res+=st.pop();
        }
        System.out.println("Postfix expression:" +res);
        
}
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String str = sc.nextLine();
        Infixtopostfixconversion obj = new Infixtopostfixconversion();
        obj.Infixtopostfix(str);
    }
}