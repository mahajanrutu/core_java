import java.util.Scanner;
class Swap
{
   public static void main (String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter first number");
      int a = sc.nextInt();

      System.out.println("Enter first number");
      int b = sc.nextInt();

      
      int temp = a;
      a = b;
      b = temp;
      

      System.out.println("After Swapping a = " +a);
      System.out.println("After Swapping b = " +temp);

   }
}