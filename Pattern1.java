public class Pattern1
{
   static int x = 1 , y =1;  
     public static void main(String[] args)
    {
        for(x = 1;x <= 5;x++)
        {
            for(y =1; y <= 5; y++)
            {
                if(y <= 1)
                {
                    System.out.print("*");
                }
                else
                {
                System.out.println();
                }
            }
        System.out.println("*");
        }
    }
} 