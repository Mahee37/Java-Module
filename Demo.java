class Computer 
{
    //Behaviours
    public void playMusic()
    {
        System.out.println("Music playing..");
    }
    public String aPen(int cost)
    {
        if (cost >= 10)
        
        return "Pen";
            else
        return "NOt a Pen";
        
    }
}
public class Demo
{
    public static void main(String[] args) //Main Method
    {   
    Computer obj= new Computer();
      obj.playMusic();
    String r1 = obj.aPen(19);
    System.out.println(r1);
    }
}