import java.util.*;
public class Travelling{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minutes = sc.nextInt();
        int totalhr=23;
        int totalmin=6;
        int remhr = 0;
        int remmin = 0;
        if(minutes == 0)
        {
           // totalhr=totalhr-1;
            remmin = totalmin-minutes;
            remhr = totalhr-hour;
        }
        else
        {
            remmin = totalmin-minutes;
            remhr = totalhr-hour;
        }
        System.out.println(remhr+"::"+remmin);
        sc.close();
    }
}

/*
final int tot = 1440 (total mins in a day)
int hout 
int minutes
if(hour<0 ||hour>23)||min<0||min>59)
{
  System.out.println("invalid");
  return;
}
  int tot_min = (hour*60)+min;
  int rem = tot - tot_min;
  int rem_hour = rem/60;
  int rem_min=rem%60;
  System.out.print(String.format("%02d::%02d",rem))
  sc.close();
 */