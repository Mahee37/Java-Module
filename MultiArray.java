public class MultiArray {
        public static void main(String a[])
    {
        int nums[][][]= new int[3][3][3];
        nums[0][0][0] = 1;
        nums[0][0][1]=  2;
        nums[0][0][2] = 3;
        nums[1][1][0] = 4;
        nums[1][1][1] = 5;
        nums[1][1][2]=  6;
        nums[2][2][0] = 7;
        nums[2][2][1] = 8;
        nums[2][2][2]=  9;
    for(int i=0;i<nums.length;i++) // Number of Rows
    {
        for(int j=0;j<nums[i].length;j++) // Number of columns
        {
            {
            for(int k=0;k<nums[i][j].length;k++) // k Represents number of Arrays in Mutli dimensional Array 
            
    System.out.print(nums[i][j][k] + " "); 
        } 
        System.out.println();  
    }
    System.out.println();
    }
 }
}
