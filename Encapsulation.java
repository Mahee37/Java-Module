 class Employee
{
    private int id;
    private String name ;
    private long Account;
    private double Salary; //
    public void setDetails(int id, String name,long Account,double Salary)
    {
        this.id = id; //Altered id
        this .name= name; //Altered name
        this.Account =Account; // Altered Account number
        this.Salary = Salary; //Altered Salary
    }
    public void   getDetails()
    {
        System.out.println("Employee id:" +id);
         System.out.println("Employee name:" +name);
          System.out.println("Employee Account Number:" +Account);
           System.out.println("Employee Salary:" +Salary);
    }
}

public class Solution {
    public static void main(String args[])
    {
        Employee obj = new Employee();
        obj.setDetails(373,"Mahee", 987654321, 700000.37);
        obj.getDetails();

    }
}
