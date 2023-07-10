class b {
    public void m1(int i  )
    {
        if(i==10)
        {
            int j = 20;
        }
    }
}
class h1{
    public static void main(String args[])
    {
       b help = new b();
       {
        help.m1(10);
        System.out.println(help.i);
        System.out.println(help.j);
       } 
    }
}






