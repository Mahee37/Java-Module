 public class Varaibles1
 {
    int x = 4; //Declartion of instance varaible
   static int  y = 7; //Declaration of static varaiable
    public void sub1() //method1
    {
        int  z = 9;//Declaration of local varaible
        System.out.println(z+z);
    }   
    public void sub2() //method1
    {
        int  z = 9;//Declaration of local varaible
        System.out.println(z*z);
    }
    public static void main(String[] args) 
    {
        Varaibles1 Mahee = new Varaibles1();//Creating object
        System.out.println(Mahee.x);//Calling instance
        System.out.println(y);//Calling Static
        Mahee.sub1();//calling Local 
        Mahee.sub2();

        
    }
 }