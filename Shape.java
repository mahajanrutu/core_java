class Testt
{
   public void area(float s)
   {
	   System.out.println("Area of Cirlce is: " +(s*s));
   }
   
   public void area(float l, float w)
   {
	   System.out.println("Area of Rectriangle is: " +(l*w));
   }
}



public class Shape {

	public static void main(String[] args) 
	{
         Testt t = new Testt();
         
         t.area(5);
         t.area(5, 10);
	}

}
