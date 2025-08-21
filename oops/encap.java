import java.util.*;
public class encap{
    private String name;
    private int age;
    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        if(age>0)
        {
            this.age=age;
        }
        else
        {
            System.out.println("Age must be +ve");
        }
    }
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        encap obj = new encap();
        obj.setname(name);
        obj.setage(age);
        System.out.println(obj.getname());
        System.out.println(obj.getage()); //System.out.println(obj.age);
        sc.close();

    }
}
  