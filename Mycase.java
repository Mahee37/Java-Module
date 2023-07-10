//construtors and Methods
class Test
{
 public Test(int a , int b)// Parameterized constructor
{
    System.out.println("ADDITION :"+(a + b)); 
}
public int master(int a  , int b) //Method    
{
    return a +b;
}
public  Test() //NO arg constructor
    {
       System.out.println("No arg Constructor");
    }
}
public class Mycase 
{  
    public static void main(String[] args)
    {
        Test sub = new Test(7,9);
        Test sub1 = new Test();
        System.out.println(sub.master(7,9));
    }
} 
