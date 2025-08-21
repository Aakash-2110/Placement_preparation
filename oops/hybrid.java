interface i1{ //Hybrid (single n interface) 
    void copy();
}
class parent{
    void display(){
        System.out.println("Program displayed");

    }
}
public class hybrid extends parent implements i1
{
    public void copy()
    {
        System.out.println("copying value");
    }
    void write()
    {
        System.out.println("Writting");
    }
    public static void main(String[] agrs)
    {
        hybrid obj = new hybrid();
        obj.write();
        obj.display();
        obj.copy();
    }
}