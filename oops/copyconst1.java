public class copyconst1{
    String name;
    int id;
    copyconst1(String name,int id){
        this.name=name;
        this.id=id;
        System.out.println("Student" + name);
    }
    public static void main(String[] agrs)
    {
       // Scanner sc = new Scanner(System.in);
        copyconst1 obj1 = new copyconst1("Aakash",20);
        copyconst1 obj2 = new copyconst1("Aswin",21);
        System.out.println(obj2.id);
        obj2.id=obj1.id;
        System.out.println(obj2.id);
       // sc.close();
    }
}