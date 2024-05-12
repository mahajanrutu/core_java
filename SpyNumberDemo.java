//Spy number if the sum of all the digits is equal to the product of all digits.

import java.util.Scanner;

class SpyNumber
{
   int sum=0,mul=1,r,n;

   public void getNumber()
   {
     Scanner sc= new Scanner(System.in);
   
     System.out.println("Enter your number to check it spy number or not");
     n= sc.nextInt();

     while(n!=0)
     {
       r=n%10;
       mul= mul*r;
       sum= sum+r;
       n=n/10;
           }
       System.out.println("Sum of Number is:"+sum);
       System.out.println("Mul of Number is:"+mul);


   }
   
  public void getcondition()
  {
    if(sum==mul)
    {
      System.out.println("Number is Spy Number");
    }
    else
    {
      System.out.println("Number is not Spy Number");
    }
  }
}



public class SpyNumberDemo
{
   public static void main(String[] args)
   {
     SpyNumber s= new SpyNumber();
     s.getNumber();
     s.getcondition();
   }
}













