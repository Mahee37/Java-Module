public class Jagged {

    public static void main(String a[])
    {
        int nums[][] = new int[3][]; // Jagged  Array
        nums[0] = new int[] { 1, 2 ,3 };
        nums[1] = new int[] { 4, 5 };
        nums[2] = new int[] { 6, 7, 8, 9 };
    for(int i=0;i<nums.length;i++) 
    { 
         for(int j=0;j<nums[i].length;j++) 
         {
    System.out.print(nums[i][j] + " ");
    }  
     System.out.println(); 
}
    }
 }

