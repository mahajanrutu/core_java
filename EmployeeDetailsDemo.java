class EmployeeDetails
{
   String firstName;
   String lastName;
   int employeeId;
   double salary;
   int noOfProject;

  public void setEmployeeData(String fname, String lname, int empid, double sal, int pro)
  {
     firstName= fname;
     lastName= lname;
     employeeId=empid;
     salary= sal;
     noOfProject=pro;
  }

 public void calculateSalary()
 {
   if(noOfProject>=5 || noOfProject<=10)
   {
      salary= salary+5000;
   }
   else if(noOfProject>10 || noOfProject<=20)
   {
      salary= salary+10000;
   }
   else
   {
     salary= salary+15000;
   }
 }

 public void displayDetails()
 {
    System.out.println("Employee First Name is:"+firstName);
    System.out.println("Employee Last Name is:"+lastName);
    System.out.println("Employee ID is:"+employeeId);
    System.out.println("Employee Salary is:"+salary);
    System.out.println("Employee No of projects are:"+noOfProject); 


 }
}


public class EmployeeDetailsDemo
{
   public static void main(String[] args)
   {
     EmployeeDetails emp= new EmployeeDetails();
     emp.setEmployeeData("Rutuja", "Mahajan", 102, 70000, 20);
     emp.calculateSalary();
     emp.displayDetails();
   }
}


















