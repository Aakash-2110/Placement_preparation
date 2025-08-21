import java.util.*;
public class maxslindingwindow
{
    public static void main(String[] args)
    {
        int [] nums = {1,3,-1,-3,5,3,6,7}
        int [] narr = new narr[n];
        int size = nums.length;
        int j = 0;
        for(int i = 1;i<size;i++)
        {
            narr[j]=Math.max(nums[i],nums[j])
            narr[j]=Math.max(nums[i+1],nums[j])
            j++;
        }
    }
}