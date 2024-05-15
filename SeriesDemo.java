/* printing the given series 1+11+111+1111*/

import java.util.Scanner;

class Series
{
   int sum=0,n,i,s;

   public void getNumber()
   {
     Scanner sc= new Scanner(System.in);
 
     System.out.println("Enter a number");
     n = sc.nextInt();

     for(i=1; i<=n; i++)
     {
       s=s*10+1;
       sum=sum+s;
       System.out.println(s);
     }
     System.out.println("Sum of digit is:" +sum);
   }
}


public class SeriesDemo
{
   public static void main(String[] args)
   {
     Series s= new Series();
     s.getNumber();
   }
}







