public class PivotIndex
{
    public static void main(String args[])
    {
    PivotIndex h1 = new PivotIndex();
    h1.PivotIndex1(5);
    }
    public int PivotIndex1(int[] nums) {
        int sum = 0,leftsum = 0;
        for(int x : nums) sum +=x;
        for(int i  = 0 ; i < nums.length; i++)
        {
            if(leftsum == sum - leftsum - nums[i] )
            return  i;
            leftsum += nums[i];
        }
        return -1;
    }
}
