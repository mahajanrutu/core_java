import java.util.Scanner;

class Fan
{
  String Name;
  String Coil;
  int Wings;

  public void switchOn()  
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a Fan Name:");
   Name= sc.next();

   System.out.println("Enter a Coil name:");
   Coil= sc.next();

   System.out.println("How many wings:");
   Wings= sc.nextInt();

   System.out.println("Name of Fan:"+Name+"\n"+"Name of a Coil:"+Coil+"\n"+"Wings fan have are:"+Wings);
  }

  public void switchOff()
  {
   System.out.println("Currently the fan is OFF");
  }
} //end of blc


public class FanMain
{
  public static void main(String[] args)
  {
    Fan f= new Fan();
    f.switchOn();
    f.switchOff();
  }
} //end of elc












