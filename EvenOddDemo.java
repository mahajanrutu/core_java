import java.util.Scanner;

class EvenOdd
{
   public void getEven()
   {
      Scanner sc= new Scanner(System.in);

      System.out.println("Enter a first number");
      int num1= sc.nextInt();


      for(int i=2; i<=num1; i+=2)
      {
         System.out.println(" " +i);
        
      }
   }

   public void getOdd()
   {
      
      Scanner sc= new Scanner(System.in);

      System.out.println("Enter a second number");
      int num2= sc.nextInt();
      
          
      for(int i=1; i<=num2; i+=2)
      {
         System.out.println(" " +i);
      }
   }
}


public class EvenOddDemo
{
   public static void main (String[] args)
   {
      EvenOdd e= new EvenOdd();
      e.getEven();
      e.getOdd();
   }
}
















