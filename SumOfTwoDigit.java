class SumOfTwoDigit
{
  public static void main(String[] args)
  { 
     int n= Integer.parseInt(args[0]);
     int x=n%10;
     int y=n/10;

     System.out.println("Sum of two digit is:" +(x+y));
  }
}