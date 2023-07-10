 class Calculator
{
    public int add(int n1, int n2, int n3) // For three integer values
    {
        return n1 + n2 + n3;
    }
    public int add(int n1 , int n2)//for two integer values
    {
        return n1  + n2;
    }
    public double add(double n1 , double n2) //Using double values
    {
        return n1 + n2;
    }
    public float add(float n1,float n2)  //Using float Values  
    {
        return n1 * n2;
    }
    public String add(String n1,String n2) //Using String values
    {
        return n1 + n2; // String Concatenation
    }
}
 class Method //Multiple classes
{
       public int sub(int a , int b)
       {
        return a+b;
       }
    }
 public class Mahee
 {
    public static void main(String[] args)
    {
        int x  = 4;
        int y = 7;
     System.out.println(x*y);
    Method obj =new Method();
    Calculator obj1 = new Calculator();
    System.out.println(obj.sub(7,9));
    System.out.println(obj1.add(7,7,7));
 }
}
