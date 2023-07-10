class parent
{
    int a = 10;int b = 6;
    public void sub1(int a , int b)
    {
        this.a =a; this.b = b; // we can use this to fetch the instance varaible values
        System.out.println(a*b);

    }
      public void sub2(int a , int b)
    {
        this.a = a; this.b = b;
        System.out.println(a*b);

    }
    public parent(int b)
    {
        
        System.out.println(a - b);
    }
}
public class node extends parent
{
    int c = 7 ; int  d = 9;
    public void parent()
    {
        System.out.println(+super.a+ "," +super.b);
        super.sub1(7,3);
        System.out.println("sub" +(this.c - this.d)); ///by using super we can change the values of varaible we can use argument values rather than instanc values which are fetche dby this
    }
    public node(int a)
    {
        super(3); //  we use super to call the varaibles/method/consturctor using paramtertes form any othe class(different class)
    }
    public void name(node temp)
    {
        temp.sub2(1, 1);
    }
    public static void main(String args[])
    {
         node temp = new node(7);
         temp.parent();
    }
}
