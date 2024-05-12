import java.util.Scanner;

class Fibo
{
          int f1=0, f2=1, f3,i=1; 

   public void getFibo()
   {
      Scanner sc= new Scanner(System.in);
       
      System.out.println("Enter a number to print Fibonaccis Series");
      int n= sc.nextInt();
   
      while(i<=n)
     {
        f3=f1;
        System.out.println(" " +f3);
        f3=f1+f2;
        f1=f2;
        f2=f3;
        i++;
     }
     
   }
}


public class FiboDemo
{
    public static void main(String[] args)
   {
   Fibo f= new Fibo();
   f.getFibo();
   }
}