
interface hod{ //Hybrid (multilevel n interface)
    void hodcse();
}
interface placementofficer{
    void ploffcse();
}
class staff {
    void csestaff()
    {
        System.out.println("I am staff");
    }

}
class parent extends staff{
    void parents()
    {
        System.out.println("I am parent");
    }
}
public class student extends parent implements hod,placementofficer{
    public void hodcse()
    {
        System.out.println("I am Hod");
    }
    public void ploffcse()
    {
        System.out.println("I am placement officer");
    }
    
    void stud(){
        System.out.println("I Am student");
    }
    public static void main(String[] agrs)
    {
        student obj = new student();
        obj.stud();
        obj.parents();
        obj.csestaff();
        obj.ploffcse();
        obj.hodcse();

    }
}