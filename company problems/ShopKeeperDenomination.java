import java.util.Scanner;

class ShopKeeperDenomination {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int amt[] = new int[n];

        for(int i=0; i<n; i++){
            amt[i] = sc.nextInt();
        }

		int c30=0, c60=0; //count 120 is not required as it not used anywhere

		for(int i=0; i<n; i++){
			if(amt[i] == 30){
				c30++;
			} else if(amt[i] == 60){
				if(c30 > 0){
					c30--;
					c60++;
				} else {
					System.out.println("Transaction Failed");
					return;
				}
			} else if(amt[i] == 120){
				if(c30 >= 3){
					c30 -= 3;
				} else if(c30 > 0 && c60 > 0){
					c30--;
					c60--;
				} else {
					System.out.println("Transaction Failed");
					return;
				}
			} else {
				System.out.println("False Transaction");
			}
		}
		System.out.println("Transaction Sucessful");
    }
}