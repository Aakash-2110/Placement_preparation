import java.util.*;

class Mazeproblem
{
boolean maze(int[][] mat, int n, int r, int c)
{
    // Check if current cell is out of bounds or blocked
    if (r < 0 || c < 0 || r >= n || c >= n || mat[r][c] != 1)
        return false;

    // If destination is reached
    if (r == n - 1 && c == n - 1)
    {
        mat[r][c] = 2;
        return true;
    }

    // Mark current cell as part of the path
    mat[r][c] = 2;

    // Move Downcler
    if (maze(mat, n, r + 1, c))
        return true;
    // Move Right
    if (maze(mat, n, r, c + 1))
        return true;
    // Move Up
    if (maze(mat, n, r - 1, c))
        return true;
    // Move Left
    if (maze(mat, n, r, c - 1))
        return true;

    // Backtrack: Unmark current cell
    mat[r][c] = 1;
    return false;
}
public static void main (String[] args)
{
    Scanner sc = new Scanner(System.in);
    Mazeproblem obj = new Mazeproblem();
    System.out.println("Enter the size of array: ");
    int n = sc.nextInt();
    int mat[][] = new int[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            mat[i][j]=sc.nextInt();
        }
    }
    boolean ans = obj.maze(mat,n,0,0);
    if(ans==true) 
    {
        for (int i = 0; i < n; i++) // To make path as 1 remaining as 0
        {
            for (int j = 0; j < n; j++)
            {
                if(mat[i][j]==2)
                {
                    mat[i][j]=1;
                }
                else
                {
                    mat[i][j]=0;
                }
            }
                
        }
        for(int i =0;i<n;i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");
        }
            
    }
}
}
