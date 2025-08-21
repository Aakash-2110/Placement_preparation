import java.util.*;
public class constr {
    constr(String name) {
        System.out.println(name+"hii");
    }
    String name;
    void login(String name){
        this.name=name;
        System.out.println(name+" Login");
    }
    void logout(){
        System.out.println(name+" Logout");
    }
    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);
            constr p = new constr("ashwin");
            constr s = new constr("Kishore");
            p.login("Aakash");
            p.logout();
            sc.close();
    }
    
}
