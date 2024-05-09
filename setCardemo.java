import java.util.Scanner;

class car
{
   String carname;
   int modelyear;
   String modelname;
   int seater;

   public void getCardata()
   {
     Scanner sc= new Scanner(System.in);

     System.out.println("Enter a Car Name:");
     carname = sc.next();

     System.out.println("Enter Car model year:");
     modelyear = sc.nextInt();

     System.out.println("Enter Model Name:");
     modelname = sc.next();

     System.out.println("How many Seater it is:");
     seater = sc.nextInt(); 

     System.out.println("Car Name:"+carname+ "Car model year:" +modelyear+ "Car model name:" +modelname+ "Seater:" +seater);    
   } 
}

public class setCardemo
{
   public static void main(String[] args)
   {
     car c= new car();
     c.getCardata();
   }
}