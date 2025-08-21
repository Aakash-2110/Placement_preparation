import java.util.*;

class Stackpermutuation{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        Queue<Integer> ip = new LinkedList<>();
        Queue<Integer> op = new LinkedList<>();
        int count = 0;
        for(int i=0;i<n;i++)
        {
            ip.add(sc.nextInt());
        }
        for(int i=0;i<n;i++)
        {
            op.add(sc.nextInt());
        }
        for(int i=0;i<n;i++)
        {
            st.push(ip.peek());
            while(!st.isEmpty() && st.peek() == op.peek())
            {
                op.poll();
                st.pop();
                count++;
            }
            ip.poll();
        }
        if(n==count) System.out.println("yes");
        else System.out.println("No");

    }
}