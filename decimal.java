import java.util.*;
public class decimal
{
 public static void main(String args[]) 
{
try
{
 Scanner sc = new Scanner(System.in);
 double num,cube;
 System.out.print("Enter the number: ");
 num = sc.nextDouble();
 System.out.println("Square of " + num + " is: " + Math.pow(num, 2));
 cube=num*num*num;
 System.out.println("Cube of "+num+" is: "+cube);
 }
catch(Exception e)
{
System.out.println("Enter valid number");
}
}
}