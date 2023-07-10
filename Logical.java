class Logical
{
    public static void main(String[] args)
    {
        int x = 1;
        int y = 3;
        int a = 5;
        int b = 7;
        
        boolean  z = x < y && a != b || a > 1;
        boolean s = !z;
        System.out.println(z);
        System.out.println(s);
   }
}