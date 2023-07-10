interface Entry
{
    abstract void Guard1();
}
interface Exit
{
    void Guard2(); // Compiler automatically appends the abstarct void as suffix to void guard2
}
public class Interface1 implements Entry,Exit
{
    @Override
        public void Guard1()
        {
            System.out.println("Allow Entry through Gate");
        }
    
        public void Guard2()
        {
            System.out.println("Allow Exit through Gate");
        }
    public static void main(String args[])
    {
        Interface1 obj = new Interface1();
        obj.Guard1(); // calling guard one to allow thorugh gate
        obj.Guard2(); // Calling gaurd two to allow exi through gate

    }
}
