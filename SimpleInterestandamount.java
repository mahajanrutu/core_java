class SimpleInterestandAmount
{
  public static void main(String[] args)
  {
     int pricipal=400;
     int rate=2;
     int time=3;
     int intrest=(pricipal*rate*time)/100;
     int amount=pricipal+intrest;

     System.out.println("Simple Interest and Amount:" +intrest);
     System.out.println("Amount is:" +amount);
  }
}