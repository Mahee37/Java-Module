public class SingleArray {
    

    public static void main(String a[])
    {
        int nums[] = new int[6]; // WE can also instantaize like nums = { 1,2,3, 4, 5 ,6,};
        nums[0] = 1;
        nums[1]=  2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
    for(int i=0;i<nums.length;i++) // i = 6-1; 5>=0;5-- // 5 = 6-1
    {
    System.out.print(nums[i] + " "); 
    }   
    System.out.println();
    }
 }


