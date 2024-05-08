import java.util.Scanner;

class Laptop
{
   String Name;
   Double ModelNb;
   String Color;
   String Processor;
   int Windows;

   public void LaptopFeatures()
   {
     Scanner sc = new Scanner(System.in);

    // System.out.println("Laptop Brand: "+name);
     
     System.out.println("Enter a Laptop Brand name:");
     Name = sc.next();

     System.out.println("Enter a Laptop model number");
     ModelNb = sc.nextDouble();

     System.out.println("Enter a Laptop colour:");
     Color = sc.next();

     System.out.println("Laptop Name:"+Name+"\n"+ "Model Number:" +ModelNb+"\n"+ "Colour:" +Color);
   } 
   
   public void LaptopConfig()
   {
    Scanner sr = new Scanner(System.in);

     System.out.println("Enter a Processor name:")     Processor = sr.next();

     System.out.println("Enter a which windows you are using:");
     Windows = sr.nextInt();

     System.out.println("Prcessor Name:"+Processor+"\n"+ "Windows Type:"+Windows);
   }
}//end of blc



public class LaptopDemo
{
  public static void main(String[] args)
  {
    Laptop Lp= new Laptop();
    Lp.LaptopFeatures();
    Lp.LaptopConfig();
  }
}//End of elc 
