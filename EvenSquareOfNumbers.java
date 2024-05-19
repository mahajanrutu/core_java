import java.util.Scanner;

class EvenSquare
{
   int n,i;

   public void getNumber()
   {
     Scanner sc =new Scanner(System.in);
  
     System.out.println("Enter a number");
     n = sc.nextInt();
   }
  
   public void getCondition()
   {
        for(i=1; i<=n; i++)
        {
           if(i%2==0)
           {
             System.out.println(i*i + " ");
           }
        }     
   }
}


public class EvenSquareOfNumbers
{
  public static void main(String[] args)
  {
    EvenSquare s= new EvenSquare();
    s.getNumber();
    s.getCondition();
  }
}