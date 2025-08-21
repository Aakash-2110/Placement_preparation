import java.util.Scanner;

public class stringReverse{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String org = in.next();

        for(int i=org.length()-1; i>=0; i--){
            System.out.print(org.charAt(i));
        }
        System.out.println();
    }   
}
