class human
{ 
    int a = 47; int b = 167;
    public  void age(int a)
    { 
        a= this.a ;
        if( a > 45)
        
            System.out.println("Elder");
        
        else
        {
            System.out.println("Younger");
        }
    }
    public void height( int b)
    {
        this.b= b;
        if ( b > 161)
            System.out.println("Taller");

        else
    {
        System.out.println("Shorter");
    }
    }
    public  void subject()
    {
        System.out.println("Male");
    }
}
    public class supernode extends human
    {
    public void action()
    {
        System.out.println("Details");
        super.age(43);
        super.height(167);
    }
    public static void main(String args[])
    {
        supernode temp1 = new supernode();
        temp1.action();
        temp1.subject();
    }
    }

