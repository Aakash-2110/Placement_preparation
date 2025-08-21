interface i1{  //Abstract class
    void display(); //Abstract method
}
interface i2{   //Abstract class
    void print(); //Abstract method
}
public class child implements i1,i2{
    public void display(){ // abstract method should be in public return type for access inside the child
        System.out.println("Displayed");
    }
    public void print()
    {
        System.out.println("printed");
    }
    public static void main(String[] agrs)
    {
        child obj = new child();
        obj.display();
        obj.print();

    }
}