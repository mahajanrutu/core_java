import java.util.Scanner;

class PerfectNumber
{
  int i=1,num,sum=0;
 
  public void getNumber()
  {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number");
    num= sc.nextInt();  

    while(i<num)
   {
      if(num%i==0)
      sum=sum+i;
      i++;
    }
     if(sum==num)
{
  System.out.println("Perfect Number");
}
else
{
  System.out.println("Not Perfect Number");
}
  }

}

public class PerfectNumberDemo
{
   public static void main(String[] args)
{
   PerfectNumber p= new PerfectNumber();
   p.getNumber();
}
}