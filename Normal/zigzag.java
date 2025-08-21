import java.util.Scanner;

public class zigzag {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int sum = 0;
        if(row!=col)
        {
            System.out.print("Invalid size");
        }
        int[][] arr=new int[row][col];
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i<row; i++) 
        {
            for(int j=0;j<col;j++)
            {
                if(i==0||i==row-1||i+j==row-1)
                {
                    sum+=arr[i][j];
                }
            }
            
        }
        System.out.println(sum);
        sc.close();

    }
}
