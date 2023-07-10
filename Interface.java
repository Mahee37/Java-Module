interface m1
{
    void sample();
}
interface m2
{
    void sample2();
}
public class Interface implements m1,m2 
{
    @Override
        public void sample()
        {
            System.out.println("Its In Interface m1");
        }
    
        public void sample2()
        {
            System.out.println("Its In Interface m2");
        }
    public static void main(String args[])
    {
        Interface obj = new Interface();
        obj.sample();
        obj.sample2();

    }
}
