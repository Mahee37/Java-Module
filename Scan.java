import java.util.Scanner;
public class Scan {

    public static void main(String[] args){
        Scanner sub = new Scanner(System.in);
        System.out.println("Enter the number: " );
        int num = sub.nextInt();
        System.out.println(++num);

        System.out.println("Enter the Name: " );
        String name = sub.next();
        System.out.println(name);

        System.out.println("Enter the float number: " );
        float f = sub.nextFloat();
        System.out.println(f);

    }
    
}
