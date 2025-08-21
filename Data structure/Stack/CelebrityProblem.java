import java.util.Scanner;
import java.util.Stack;

class CelebrityProblem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Size :");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        Stack <Integer> s = new Stack<>();

        for(int i=0; i<n; i++){
            s.push(i);
        } 

        while(s.size() >=2){
            int a = s.pop();
            int b = s.pop();

            if(arr[a][b] == 1)
                s.push(b);
            else
                s.push(a);
        }


        int pos = s.peek();


        for(int i=0; i<n; i++){
            if(i!=pos){
                if(arr[pos][i] == 1 || arr[i][pos] == 0){
                    System.out.println("NOt a Celebrity");
                    return;
                }
            }
        }

        System.out.println("Celebrity : " + pos);
    }


}