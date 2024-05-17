import java.util.Scanner;

class Height
{
  int n;

  public void getNumber()
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your height:");
    n = sc.nextInt();

    if(n>=175)
    {
      System.out.println("The person is taller");
    }
    else if(n>=155)
    {
      System.out.println("The person have Average Height");
    }
    else
    {
      System.out.println("The person is dwraf");

    }
  }
}


public class HeightDemo
{
  public static void main(String[] args)
  {
     Height h= new Height();
     h.getNumber();
  }
}