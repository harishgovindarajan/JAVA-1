import java.util.*;
class salary
{
    public static void main(String[] args)
    {
         try
         {
         double salary;
         double bonus;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the Grade of an employee: ");
         char g=sc.next().charAt(0);
         System.out.println("Enter the salary of an employee:"); 
         salary=sc.nextDouble();
         
         if(g=='A')
         {
            bonus=0.05;
            salary=salary+salary*bonus;
            System.out.println("The Total salary of a employee is:"+salary);
          
          }
         if(g=='B')
          {
            bonus=0.1;
            salary=salary+salary*bonus;
            System.out.println("The Total salary of a employee is:"+salary); 
           }
         if(salary<=0)
          {
             
            System.out.println("Enter the valid salary of an employee");
          }
         if(g!='A'&&g!='B')
          {
             System.out.println("Enter the correct grade or salary of an employee");
           }
       }
       catch(Exception e)
        {
           System.out.println("Enter the valid salary of an employee");
         }
    }
}