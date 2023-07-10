public class Compare
{
    public static void main(String [] args)
    {
        int x = 8;
        int y = 7;
        int z = 9;

        if ( x>y && x>z) // if false
        System.out.println(x);
        else if(y>x && y>z) //save without comparing with x when we know x is small save time
        System.out.println(y);
        else
            System.out.println(z);
    }
}