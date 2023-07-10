class Student 
{
        int id ;
        String Name;
        float Percentage;
}
    public class Studentarray
    {
        public static void main(String args[])
        {
            Student sub = new Student();
            sub.id = 37;
            sub.Name ="Mahee";
            sub.Percentage = 90.0f;

            Student sub1 = new Student();
            sub1.id = 23;
            sub1.Name ="Sree";
            sub1.Percentage = 71.0f;

            Student sub2 = new Student();
            sub2.id = 69;
            sub2.Name ="Chaithanya";
            sub2.Percentage = 73.0f;
            
            Student Students[] = new Student[3];
            Students[0]= sub;
            Students[1]= sub1;
            Students[2]= sub2;

            // for(int i=0;i<Students.length;i++)
            // {
            //     System.out.println(Students[i].Name  + " : "  + Students[i].id + " : " + Students[i].Percentage);
            // }
            for (Student num : Students) //Enhaced forum
            {
                System.out.println(num.Name  + " : "  + num.id);
            }
        }
    }