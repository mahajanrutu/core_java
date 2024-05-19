import java.util.Scanner;

class Letter
{

   char ch;

   public void getLetter()
   {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter any Character to check it");
       ch = sc.next().charAt(0);    
   }

   public void checkLetter()
   {
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
      {
        System.out.println("The Charcter is Vowel");
      }
      else if(ch>=33 && ch<=47 || ch>=58 && ch<=64)
      {
        System.out.println("The Character is Special symbol");
      }
      else if(ch>=48 && ch<=57)
      {
        System.out.println("The Entered Character is Number");
      }
      else 
      {
        System.out.println("The character is Consonant");
      }
   }
}


public class LetterDemo
{
  public static void main(String[] args)
  {
    Letter l= new Letter();
    l.getLetter();
    l.checkLetter();
  }
}