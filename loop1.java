import java.util.Scanner;
public class loop1 {
    
    public static void main(String[] args)
    {
        Scanner sub =new Scanner(System.in);
        System.out.println("Enter value n : ");
	    int num1 = sub.nextInt(); 
        if(num1 >= 17)

            System.out.println("Number is Greater than 17");
    
        else
        {
            System.out.println("Number is Lesser  than 17");
        }
	
    }
}
