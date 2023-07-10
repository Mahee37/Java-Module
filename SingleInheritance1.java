class man 
    {
       public void code()
        {
            System.out.println("Coding");
        }
    }
    class compiler extends man
    {
        public void compile()
        {
             System.out.println("Compiling");
        }
    }
     class hacker extends compiler
    {
        public void hack()
        {
             System.out.println("Hacking");
        }
    }
    public class SingleInheritance1
{
    public static void main(String args[])
    {
        hacker b = new hacker();
        b.compile();
        b.code();
        b.hack();
    }
}