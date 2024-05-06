class Fahrenheit
{
  public static void main(String[] args)
  { 
     float fahrenheit= Float.parseFloat(args[0]);

     float celsius=((fahrenheit-32)*5)/9;

     System.out.println("Fahrenheit to Celsius is " +(celsius));
  }
}