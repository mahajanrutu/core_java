import java.util.Scanner;

class SumOfNumbers
{

   int sum=0,r;
   public void getNumbers()
   {
     Scanner sc= new Scanner(System.in);

     System.out.println("Enter A number");
     int n= sc.nextInt();

     while(n!=0)
     {
         r=n%10;
         sum=sum+r;
         n=n/10;
     }
     System.out.println("Sum of number is:" +sum);
   }
}


public class SumOfNumbersDemo
{
   public static void main(String[] args)
   {
      SumOfNumbers s= new SumOfNumbers();
      s.getNumbers();
   }
}