//finding number is Armstrong or not

import java.util.Scanner;

class Armstrong
{
  int n,sum,temp,r,arm;

  public void getArmstrong()
  {
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter a number to check amrstrong or not");
    n = sc.nextInt();

    temp=n;
    
    while(n!=0)
    {
      r=n%10;
      arm= r*r*r;
      sum=sum+arm;
      n=n/10; 
    }
   
    if(temp==sum)
    {
      System.out.println("Number is Armstrong");
    }
    else
    {
      System.out.println("Number is not Armstrong");
    } 
  }
}//end of blc 


public class Armstrongdemo
{
  public static void main(String[] args)
  {
    Armstrong a= new Armstrong();
    a.getArmstrong();
  }
}

















