abstract class Mahee
{
    public abstract void menu();
    
}
class Men1 extends Mahee
{  @Override
    public void menu()
    {
        System.out.println("B Positive");

    }
}
class Name extends Men1
{
  @Override
    public void menu()
    {
        System.out.println("Mahii");
    }
}
    class Human extends Name
{
  @Override
    public void menu()
    {
        System.out.println("mahee");
    }
}
public class Abstract {
    public static void main(String args[])
    {
        Name h1 = new Name();
        h1.menu();
        Men1 m=new Men1();
        m.menu();
        Men1 h2 = (Men1) new Name();// Upcasting from child node to parent node
        Name h3 = (Name) new Human();//Upcasting form child node t parent node
        h2.menu();
        h3.menu();
        
    }
}
