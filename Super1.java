 class Panda
 {
    String me1 = "Mahee";
    public void eat()
    {
        System.out.println("Eating");
    }
}
public class Super1 extends Panda
{
    String me1 = "tharun";
    public void dance(String x)
    {   
        System.out.println("Dancing");
        System.out.println(this.me1);
        super.eat();
    }
public static void main(String args[])
    {
        Super1 obj = new Super1();
        obj.dance("mahee");

    }
}
