import java.util.Scanner;

public class loop3 {
    
     public static void main(String[] args)
    {
        Scanner sub =new Scanner(System.in);
        System.out.println("Enter value num1 : ");
	    int num1 = sub.nextInt(); 
         System.out.println("Enter value temp : ");
        int temp = sub.nextInt();
        if(temp != num1)
        { //Matching numbers
            System.out.println("Numbers are not Matched");
        }
            else
            {
                    System.out.println("Numbers  are Matched");
        
            }
        }   
        
}
         
