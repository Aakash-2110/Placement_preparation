import java.util.*;
public class copyconst{
    String name;
    int id;
    copyconst(String name,int id){
        this.name=name;
        this.id=id;
        System.out.println("Student" + name);
    }
    copyconst(copyconst obj1){
        this.name=obj1.name;
        this.id=obj1.id;
        System.out.println("id "+id);
    }
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        String s_name=sc.nextLine();
        int s_id=sc.nextInt();
        copyconst obj1 = new copyconst(s_name,s_id);
        copyconst obj2 = new copyconst(obj1);
        sc.close();
    }
}