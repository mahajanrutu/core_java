public class SumOfDigit
{
  public static void main(String[] args);
  {
    int a= Integer.parseInt(args[0]);
    
    if(a>=10 && a<=99)
    {
      int sum=(n%10 + n/10);
     
      System.out.println("Sum of Digits:" +sum);
    }
    else if(a<0)
    {
      System.out.println("-3");
    }
    else if(a>99)
    {
      System.out.println("-2");
    }
    else if(a>0 || a<9)
    {
      System.out.println("-1");
    }
  }
}