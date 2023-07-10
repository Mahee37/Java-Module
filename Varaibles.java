public class Varaibles
 {
    int x = 4; //Declaration of instance varaible
    int  y = 7; //Declaration of static varaiable
    public void  subject()
    {
        int  z = 9;//Declaration of local varaible
        System.out.println("Addition:" +(x+y+z));//Addition
        System.out.println("Multiplication:" +(x*y*z));//Multiplication  
    }   

    public static void main(String[] args)
    {
      Varaibles M =  new Varaibles();
       M.subject();
    }   
}