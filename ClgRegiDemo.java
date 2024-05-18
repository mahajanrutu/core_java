class ClgRegi
{
   String Name;
   double per;
   double CapId;
   String Dept;
  
   public ClgRegi(String Name, double CapId, String Dept, double per)
   {
      this.Name = Name;
      this.CapId = CapId;
      this.Dept = Dept;
      this.per = per;
   } 

   public void Percentage()
   {
      if(per>=85)
      {
        System.out.println("You are in Section A");
      }
      else if(per>=70)
      {
       System.out.println("You are in Section B");
      }
      else if(per>=60)
      {
       System.out.println("You are in Section C");
      }
      else
      {
       System.out.println("You are in Section D");
      }
   }
 
   public void getDisplay()
   {
      System.out.println("Name="+Name+", Cap Round Id="+CapId+", Your Department="+Dept+", Percentage="+per);
   }
}


public class ClgRegiDemo
{
   public static void main(String[] args)
   {
     ClgRegi cl= new ClgRegi("Rutuja", 123468, "Information Technology", 85);
     cl.getDisplay();
     cl.Percentage();
   }

}








