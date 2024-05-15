import java.util.Scanner;

class Factorial
{
   int fact=1, sum,n;
   public void getNumber()
   {
     Scanner sc= new Scanner(System.in);

     System.out.println("Enter a number to find Factorial");
     n= sc.nextInt();

      for(int i=1; n<=1; i++)
     {
       fact=fact*n;
       sum=sum+n;
     }
     System.out.println("Sum="+sum);

   }

}


public class FactorialDemo
{
   public static void main(String[] args)
   {
      Factorial fac= new Factorial();
      fac.getNumber();
   }
}

















