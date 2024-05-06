//Palindrome program using Scanne class
import java.util.Scanner;
class Palindrome
{
  public static void main(String[] args)
  {
     Scanner sc= new Scanner(System.in);
    
     System.out.println("Enter a number to check palindrome or not");

     int n= sc.nextInt();

     if(n<=0)
     {
       System.out.println("-1 the given number is -ve kindly provide the +ve number only");
     }
     else if(n<=99 || n>=999)
     {
       System.out.println("-2 The given number is not three digit number");
     }
     else
     {
       int temp=n;
       int sum=0;

       while(n>0)
       {
         int r=n%10;
         sum= (sum*10)+r;
         n=n/10;
       }
     
     if(temp==sum)
     {
       System.out.println("1 Number is Palindrome");
     }
     else
     {
       System.out.println("number is not palindrome");
     } 
    }    
  }
}