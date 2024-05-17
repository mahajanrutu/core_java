class Car
{
  String OwnnerName;
  String CarName;
  int ModelYear;
  int CarNumber;
  String CarColor;

 public Car(String OwnnerName,   String CarName,  String CarColor, int ModelYear, int CarNumber)
 {
   this.OwnnerName= OwnnerName;
   this.CarName= CarName;
   this.ModelYear= ModelYear;
   this.CarColor= CarColor;
   this.CarNumber= CarNumber;
 }

 public void ModelYear()
 {
   if(ModelYear>=2019 && ModelYear<=2024)
   {
     System.out.println("The Car Model Is Newest");
   }
   else if(ModelYear>=2010)
   {
     System.out.println("The Car Model is little Oldder");
   }
   else
   {
     System.out.println("The Car Model is Older");
   }
 }

 public void getDisplay()
 {
   System.out.println("Ownner Name="+OwnnerName+", Car Name="+CarName+", Car Colour="+CarColor+" Model Year="+ModelYear+", Car Number="+CarNumber);
 }

}


public class CarDetailsDemo
{
   public static void main(String[] args)
   {
     Car c= new Car("Rutuja","BMW","Black",2016,99);
     
     c.getDisplay();

     c.ModelYear();
   }
}








