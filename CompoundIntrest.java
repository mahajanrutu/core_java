class CompoundIntrest
{
  public static void main(String[] args)
  {
     double principle= Double.parseDouble(args[0]);

     double rate=Double.parseDouble(args[1]);

     double amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));

     double Compoundi=amount-principle;

     System.out.println("Compound intrest for 3 Years:" +Compoundi);
  }

}