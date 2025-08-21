import java.util.*;

public class Infixtoprefixconversion
{
    void Infixtoprefix(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(') {
                sb.setCharAt(i, ')');
            }
            else if (sb.charAt(i) == ')') {
                sb.setCharAt(i, '(');
            }
        }
        String revStr = sb.toString();

        String temp = "";
        Stack<Character> st = new Stack<>();
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('+',1);
        hm.put('-',1);
        hm.put('*',2);
        hm.put('/',2);
        hm.put('^',3);

        for (int i = 0; i < revStr.length(); i++) {
            char ch = revStr.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                temp += ch;
            }
            else if (ch == '(') {
                st.push(ch);
            }
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    temp += st.pop();
                }
                st.pop();
            }
            else {
                while (!st.isEmpty() && (hm.getOrDefault(ch,0) < hm.getOrDefault(st.peek(),0) 
                       || (hm.getOrDefault(ch,0) == hm.getOrDefault(st.peek(),0) && ch != '^'))) 
                {
                    temp += st.pop();
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            temp += st.pop();
        }

        String prefix = new StringBuilder(temp).reverse().toString();
        System.out.println("Prefix expression: " + prefix);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String str = sc.nextLine();
        Infixtoprefixconversion obj = new Infixtoprefixconversion();
        obj.Infixtoprefix(str);
    }
}
