import java.util.Scanner;

class UpperLower
{
  char ch;

 public void getLetter()
 {
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter a Character to checck");
   ch = sc.next().charAt(0);
 }

 public void getCondition()
 {
   if(ch>=65 && ch<=90)
   {
     System.out.println("The Character is in Upper Case");
   }
   else if(ch>=97 && ch<122)
   {
     System.out.println("The Character is in Lower Case");
   }
   else if(ch>=33 && ch<=47 || ch>=58 && ch<=64)
   {
     System.out.println("The Character is Special symbol");
   }
   else
   {
     System.out.println("The Character is Number");
   }
 }
}

public class UpperLowerDemo
{
   public static void main(String[] args)
   {
      UpperLower ul= new UpperLower();
      ul.getLetter();
      ul.getCondition();
   }
}