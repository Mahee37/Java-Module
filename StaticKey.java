class StaticKey1{
    String brand;
    int price;      //instance Varaibles
    static String name; // if we put static keyword change in that varaible changes the value all over the code
    public void show()
    {
        System.out.println(brand +":" +price+":" +name);
    }
}
    public class StaticKey
    {
    public static void main(String args[])
    {
        StaticKey1 sub = new StaticKey1();
        sub.brand = "Apple";
        sub.price = 30000;
        sub.name = "xr";
        StaticKey1 sub1= new StaticKey1();
         sub1.brand = "Samsung";
        sub1.price = 17000;
        StaticKey1.name = "M30";
        sub.show();
        sub1.show();
        //Actually static varaibles are called using class name not object name
    
    }
}
