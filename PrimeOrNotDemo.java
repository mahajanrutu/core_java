import java.util.Scanner;

class PrimeOrNot
{
  int i,n;

  public void getNumber()
  {
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Enter a Number");
    n = sc.nextInt();

    for(i=2; i<=n; i++)
     {
       if(n%2==0)
       {
         break;
       }
     }
     if(i==n)
     {
        System.out.println("Number is Prime");
      }
     else
     {
       System.out.println("Number is not Prime");
     }
  }
}


public class PrimeOrNotDemo
{
  public static void main(String[] args)
  {
    PrimeOrNot p= new PrimeOrNot();
    p.getNumber();
  }
}














