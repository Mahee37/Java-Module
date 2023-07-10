public class Switch
{
    public static void main(String[] args)
    {
        int n =1;
        int a = 5;
        int b = 7;
        switch(n)
        {
            case 1:
                System.out.println("Addition : " +(a +b));
                //  break;
              case 2:
                 System.out.println("Subtraction: " + (a - b));
                //break;       
            case 3:
                System.out.println("Multiplication:" + (a *b));
                //break;                
            case 4:
                System.out.println("Division:" + (a /b));
                //break;         
            case 5:
                System.out.println("Modular Division:" + (a %b)); 
                break;
            default:
                System.out.print("NO Operation");             
        }                
    }
    }