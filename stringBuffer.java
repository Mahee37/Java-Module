public class stringBuffer {
    static String s1 = "Mahee"; //sree
    public static void main(String  args[]){
    
      System.out.println(stringBuffer.s1 ="Sree") ;
        StringBuffer sub = new StringBuffer("Vijay"); //sree--> vijay
        System.out.println(sub);
        System.out.println(sub.capacity());  //sree 
        sub.append("Hanuman");
        System.out.println(sub);
        sub.setLength(30 );
          System.out.println(sub);
        sub.insert(3,"java");
          System.out.println(sub);
        // to convert string buffer to string 
         String str = sub.toString();
          System.out.println(sub);
        // there is another type of stringtypes are there they are string builder
        //mutable string--> string buffer
        //immutable string--> string builder

    }
    
}
