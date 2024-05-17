import java.util.Scanner;

class EmployeeSalary
{
   int empId;
   String empName;
   int BasicSalary;
   int Exp;
   int HRA;
   int DA;
   int TA;
   double GrossSalary;

   public void setEmployeeData()
   {
     Scanner sc= new Scanner(System.in);
   
     System.out.println("Enter a Employee Id:");
     empId = sc.nextInt();

     System.out.println("Enter a Employee Name:");
     empName = sc.next();

     System.out.println("Enter your basic salary:");
     BasicSalary = sc.nextInt();    

     System.out.println("Enter your experieanc");
     Exp= sc.nextInt();
    
     System.out.println("House Rent Allowance");
     HRA= sc.nextInt();

      System.out.println("House Rent Dearness Allowance");
     DA= sc.nextInt();
   
      System.out.println("House Rent Travel Allowance");
     TA= sc.nextInt();     

          
   }

   public void salaryHikeBasedOnExperience()
   {
      if(Exp>=3)
      {
          BasicSalary=BasicSalary+2000;
      }
      else if(Exp>=7)
      {
         BasicSalary=BasicSalary+10000;
      }
      else if(Exp>=12)
      {
           BasicSalary=BasicSalary+15000;
      }
      else
      {
          BasicSalary=BasicSalary+20000;
      }
   }

   public void getGross()
  {
    GrossSalary=BasicSalary+HRA+DA+TA;
  }

  public void setSalary()
  {
     System.out.println("id="+empId);
          System.out.println("name="+empName);
          System.out.println("basicsalary="+BasicSalary);
          System.out.println("exp"+Exp);
            System.out.println("HRA:"+HRA);
            System.out.println("DA"+DA);
             System.out.println("TA:"+TA);
            System.out.println("Grosss"+GrossSalary);







  }

   

}



public class EmployeeSalaryDemo
{
   public static void main(String[] args)
   {
      EmployeeSalary e= new EmployeeSalary();

      e.setEmployeeData();
      e.salaryHikeBasedOnExperience();
      e.getGross();
e.setSalary();
   }
}




