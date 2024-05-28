import java.util.Scanner;

class QuotientandRemainder
{
   public static void main (String[] args)
  {
      Scanner sc = new Scanner(System.in);
   
      System.out.println("Enter a number to find the result");
      int a = sc.nextInt();

      int r = a%10;
      int n = a/10;
  
      System.out.println("Quotient :" +r);
      System.out.println("Remainder:" +n);
    }
}

class Cylinder extends Class {
	
	double height;

	public Cylinder()
	{
		super();
		this.height = 0.0;
	}
	
	
	public double getVolume(double radius, double height)
	{
	
		if(height<=0)
		{
			return (-1);
		}
		this.height = height;
		return (3.14*radius*radius*height);
	}
	

}

public class FindAreaOfCircle {

	public static void main(String[] args) {

		Class c = new Class();
		Cylinder cl = new Cylinder();
		
		System.out.println("Area of circle is: " +c.getArea(56));
		System.out.println("Area of Cylinder id: " +cl.getVolume(5, 10));
		
	}

}



