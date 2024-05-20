class Employee {
	
	private int empnb;
	private String empName;
	private double empSalary;
	
	public Employee(int empnb, String empName, double empSalary)
	{
		this.empnb = empnb;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public int getNumber()
	{
		return empnb;
	}
	
	public String getName()
	{
		return empName;
	}
	
	public double getsalary()
	{
		return empSalary;
	}

}


public class EmployeeSalary {

	public static void main(String[] args) {
		
		Employee emp = new Employee(12, "Rutuja", 100000);
       double sal= emp.getsalary();
       int id = emp.getNumber();
       String name= emp.getName();
        System.out.println(id);
       System.out.println(name);
        
        if(sal>=90000)
        {
        	System.out.println("You are a developer");
        }
        else if(sal>=60000)
        {
        	System.out.println("You are a designer");
        }
        else
        {
        	System.out.println("You are a tester");
        }
	}

}
