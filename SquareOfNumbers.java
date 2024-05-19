import java.util.Scanner;

class Square
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
        System.out.println(i*i + " ");
      }
   }
}


public class SquareOfNumbers
{
  public static void main(String[] args)
  {
    Square s= new Square();
    s.getNumber();
    s.getCondition();
  }
}