import java.util.Scanner;
class mul
{
 public static void main(String[] args)
 {
   try
   {
    int i,n,n1;
    Scanner s= new Scanner(System.in);
    System.out.print(" Enter the number : ");
    n= s.nextInt();
    System.out.print("Enter which table u want:");
    n1=s.nextInt();
    for(i=1;i<=n;i++)
    {
        System.out.print(i+"x"+n1+"="+i*n1+"\n");
    }
    
    }
    catch(Exception e)
    {
        System.out.print("Enter only numbers:");
    }
  }
}