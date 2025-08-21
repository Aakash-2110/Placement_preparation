import java.util.*;

public class oopsone {
    String names;
    void login(String name){
        this.names=name; //this keyword assisgn the value(aakash) to the global (string name) 
                        //then it is used other method(logout) with out this it o/p as null logout
                        // store the value from parameter to instance variable
        System.out.println(names+" Login");
    }
    void logout(){
        System.out.println(names+" Logout");
    }
    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);
            oopsone p = new oopsone();
            p.login("Aakash");
            p.logout();
            sc.close();
    }
    
}
  