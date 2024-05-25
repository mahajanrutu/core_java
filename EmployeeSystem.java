class Employee {
 
	private int empId;
	private String empName;
	private String department;
	
	public Employee(int empId, String empName, String department)
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}
	
	public void displayInfo()
	{
		System.out.println("Employee Id is:" +empId);
		System.out.println("Employee Name is:" +empName);
		System.out.println("Employee Deparment is:" +department);
	}
}

class Infotechnology extends Employee {
	
	private double basicSalary;
    double allowance;
    
	public Infotechnology(int empId, String empName, String department, double basicSalary)
	{
		super(empId, empName, department);
		this.basicSalary = basicSalary;
	}
	
	public void displayinfo()
	{
		super.displayInfo();
		System.out.println("Your basic Salary is:" +basicSalary);
	}
	
	public double calculateSalary(double allowance)
	{
		this.allowance = allowance;
		return (basicSalary+allowance);
	}
	
	

}

class HRdept extends Employee {
	
	private double basicSalary;
	double allowance;

	public HRdept(int empId, String empName, String department, double basicSalary) 
	{
		super(empId, empName, department);
		this.basicSalary = basicSalary;
	}
	
	public void displayinfo()
	{
		super.displayInfo();
	   System.out.println("Your basic salary is:" +basicSalary);	
	}
	public double calculateSalary(double allowance)
	{
		this.allowance = allowance;
		return (basicSalary+allowance);
	}
	
	

}

public class EmployeeSystem {

	public static void main(String[] args) {

		Infotechnology i = new Infotechnology(101, "Rachin", "IT", 60000);
	    HRdept h = new HRdept(201, "Apurva", "HR", 50000);
	    
	    i.displayinfo();
	    System.out.println("Your total salary of this month is: " +i.calculateSalary(10000));
	    System.out.println("***********************************************");
	    h.displayinfo();
	    System.out.println("Your total Salary of this month is: " +h.calculateSalary(5000));
		
	}

}
