
import java.util.Scanner;

class Shopping{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int flipprice=sc.nextInt();
        int flipdis=sc.nextInt();
        int flippack=sc.nextInt();
        int snapprice=sc.nextInt();
        int snapdis=sc.nextInt();
        int snappack=sc.nextInt();
        int amazonprice=sc.nextInt();
        int amazondis=sc.nextInt();
        int amazonpack=sc.nextInt();
        int amtflip=(int)(flipprice-(flipprice*flipdis*0.01)+flippack);
        int amtsnap=(int)(snapprice-(snapprice*snapdis*0.01)+snappack);
        int amtamazon=(int)(amazonprice-(amazonprice*amazondis*0.01)+amazonpack);
        System.out.println(" flipkart: "+amtflip);
        System.out.println("Snapdeal: "+amtsnap);
        System.out.println("Amazon: "+amtamazon);
        if(amtflip<=amtsnap&&amtflip<=amtamazon)
        {
            System.out.println("Choose flipkart");
        }
        else if (amtsnap<amtflip&&amtsnap<=amtamazon)
        {
            System.out.println("Choose amazon");
        }
        else{
            System.out.println("Choose amazon");
        }

        sc.close();
    }
}