import java.util.*;
import java.util.regex.*;

public class javreg{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String m_id = sc.nextLine();
        String reg  = "^[a-z0-9-]+@[a-z]+\\.[a-z]{2,}$";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(m_id);
        if(m.matches())
        {
            System.out.println("Matches");
        }
        else
        {
            System.out.println("Not Matches");
        }
        sc.close();
    }
}