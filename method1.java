public class method1 {

    public int sub(int a ,int b)
    {
        return a +b;
    }
     public String sub(String a)
    {
        return "Hanuman";
    }
     public int sub(int a)
    {
        return (a);
    }
     public char sub(char a)
    {
        return 'J';
    }
     public String sub(String a ,String b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        method1 obj = new method1();
        System.out.println(obj.sub(7,5));
        System.out.println(obj.sub("jai"));
        System.out.println(obj.sub(37));
        System.out.println(obj.sub('J'));
        System.out.println(obj.sub("Mahee","Batman"));

    }
}
