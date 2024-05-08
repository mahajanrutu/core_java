import java.util.Scanner;

class Book
{
   String Name;
   String Author;
   String Lang;
   int PublishedYear;
   int Rating;
   int Chapters;

   public void BookFeatures()
   {
     Scanner sc= new Scanner(System.in);

     System.out.println("Enter a Book Name:");
     Name = sc.next();

     System.out.print("Enter a Book Author Name:");
     Author = sc.next();

     System.out.println("Enter a which language in this book?");
     Lang = sc.next();

     System.out.println("Book Name:"+Name+"\n"+ "BOok Author:"+Author+ "\n"+ "Book Language" +Lang);
   }

  public void BookDetails()
  {
    Scanner sr= new Scanner(System.in);
    
    System.out.println("Enter a Book published Year?");
    PublishedYear = sr.nextInt();

    System.out.println("Enter Book Rating out of 10");
    Rating = sr.nextInt();

    System.out.println("How many chapters book have?");
    Chapters= sr.nextInt();

    System.out.println("Published year:"+PublishedYear+ "\n"+"Rating:" +Rating+ "\n"+"chapters:"+Chapters);
  }
}


public class BookDemo
{
  public static void main(String[] args)
  {
    Book b= new Book();
    b.BookFeatures();
    b.BookDetails();
  }
}








