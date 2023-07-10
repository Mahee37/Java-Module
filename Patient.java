import java.util.Scanner;
public class Patient
{
    public static void main(String[] args)
    {
 //Code for A Group 67.1 //Code for A positive 67.10 //Code for A Negative 67.11

 //Code for B Group 67.2  //Code for B positive 67.20 //Code for B Negative 67.21

 //Code for AB Group 67.3  //Code for AB positive 67.30  //Code for AB Negative 67.31 

 //Code for o Group 67.4  //Code for 0 positive 67.40 //Code for 0 Negative 67.41


Scanner sub = new Scanner(System.in);      
System.out.println("Enter Patient age:" );
	int Patientage =sub.nextInt();

System.out.println("Enter weight:" );
	float Weight =sub.nextFloat();
         
System.out.println("Enter Patient Blood Code:" );
	double Code =sub.nextDouble();

	if(Patientage > 18 && Weight > 35.0 && Code == 67.31)

	    //Requirement AB Negative Blood Group code
		System.out.println("You are Eligible to Donate");
    else
	{
	System.out.println("You are Not Eligible to Donate");
	}

}
}
