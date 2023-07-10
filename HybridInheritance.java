 class mahee //Base class
{
    public void friends()
    {
        System.out.println("Friends");
    }

}
interface Games{ // Interface 
    abstract void plays();
}
public class HybridInheritance extends mahee implements Games //Hybrid Inheritance using both base class and Interface
{
    @Override
    public void friends()
    {
        System.out.println("Mahee Sree Chaithu Tharun");
    }
    public void plays()
    {
        System.out.println("Player Unkown Battle Grounds");
    }
  public static void main(String args[])
  {
    HybridInheritance obj = new HybridInheritance();
    obj.friends();
    obj.plays();

  }
}
