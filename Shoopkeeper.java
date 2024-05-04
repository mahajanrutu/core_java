class Shoopkeeper
{
  public static void main(String[] args)
  {
     double Sellingprice= 32500;
     double Profit= 32500*27/100;
     double Vat=32500*(12.7/100);
     double servicecharge=32500*(3.87/100);
     double totalsellingprice=Sellingprice+Profit+Vat+servicecharge;
    
     System.out.println("Profit is" +profit);
     System.out.println("Vat is:" +Vat);
     System.out.println("Service Of Charge is:" +servicecharge);
     System.out.println("Total Selling Price is:"+totalsellingprice);
  }
}