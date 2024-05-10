class Employee 
{
  int employeeNumber;
  String employeeName;
  double employeeSalary;
  char employeeGrade;
  
  public void setEmployee(int id, String name, double salary)
  {
	  employeeNumber = id;
	  employeeName = name;
	  employeeSalary = salary;
  }
  
   public void getEmployee()
   {
	   System.out.println("Employee id is :"+employeeNumber);
	   System.out.println("Employee name is :"+employeeName);
	   System.out.println("Employee salary is :"+employeeSalary);
	   System.out.println("Employee grade is :"+employeeGrade);
   }

   public void calculateEmployeeGrade()
   {
	   if(employeeSalary > 100000)
	   {
		   employeeGrade = 'A';
	   }
	   else if(employeeSalary > 75000)
	   {
		   employeeGrade = 'B';
	   }
	   else if(employeeSalary > 50000)
	   {
		  employeeGrade = 'C';   
	   }
	   else
	   {
		   employeeGrade = 'D';
	   }
   }

}


public class EmployeeDemo 
{       
        
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.setEmployee(111, "Smith", 45000);
		e1.calculateEmployeeGrade();
		e1.getEmployee();

	}

}









