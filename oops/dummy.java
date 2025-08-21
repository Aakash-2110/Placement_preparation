import java.util.*;
public class dummy {
    dummy(String name) {
        this.name = name;
    }

    String name;
    void login(){
        System.out.println(name+" Login");
    }
    void logout(){
        System.out.println(name+" Logout");
    }
    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);
            dummy p = new dummy("ashwin");
            dummy s = new dummy("Kishore");
            p.login();
            p.logout();

            s.login();
            s.logout();
            sc.close();  
    }
    
}
