class Dog
{
   String name = "puppy";
   int age=2;
   double height=152.89;
   
   public void getDogInformation()
   {
      System.out.println("name : "+name+" age : "+age+" height : "+height);
   }
   public void bark()
   {
      System.out.println("the dog is barking!!!");
   }
}//end of blc 

public class DogMain
{
    public static void main(String[] args)
    {
       Dog d = new Dog();
       d.getDogInformation();
       d.bark();
    }
}//end of elc