class Ticket
{
   String Name;
   double AdharNumber;
   String City;
   String Transaction;
   double Total;

   public Ticket(String Name, double AdharNumber, String City, String Transaction)
   {
     this.Name = Name;
     this.AdharNumber = AdharNumber;
     this.City = City;
     this.Transaction = Transaction;  
     this.Total = Total;   
   }

   public void getCity()
   {
   if(City=="Pune")
   {
     Total=1500;
   }
   else if(City=="Mumbai")
   {
     Total=2000;
   }
   else if(City=="Bangalore")
   {
     Total=4000;
   }
   else if(City=="Hyderabad")
   {
     Total=2500;
   }
   else
   {
     System.out.println("YOu Have TO CHOOSE only FROM PUNE, MUMBAI, BANGALORE AND HYDERABAD");
   }
  }

  public void getTransaction()
  {
    if(Transaction=="UPI")
    {
       System.out.println("ok, You have Choosen UPI,Transfer your money on this-->Railway@123");
    }
    else
    {
       System.out.println("You Choose Cash, Collect your Cash on counter");
    }
  }
  
  public void getTotal()
  {
     System.out.println("Your Total is:" +Total);
  }


  public void getDisplay()
  {
    System.out.println("Your Name="+Name+", Adhar Number="+AdharNumber+", Your City="+City+", Transaction="+Transaction);
  }
}


public class RailwayTicket
{
  public static void main(String[] args)
  {
    Ticket t= new Ticket("Rutuja", 4567323, "Pune", "UPI");

    t.getCity();
    t.getDisplay();
    t.getTransaction();
    t.getTotal();
  }
}













