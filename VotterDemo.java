class EligibleToVote
{
   String Name;
   int age;

   public EligibleToVote(String Name, int age)
   {
      this.Name = Name;
      this.age = age;
   }

   public void Condition()
   {
      if(age>=18)
      {
         System.out.println("Eligible to Vote");
      }
      else
      {
        System.out.println("You are Younger");
      }
   }

   public void Display()
   {
      System.out.println("Name= "+Name+", Age="+age);
   }
}


public class VotterDemo
{
  public static void main(String[] args)
  {
    EligibleToVote e= new EligibleToVote("Rutuja", 24);

    e.Display();
    e.Condition();
  }
}