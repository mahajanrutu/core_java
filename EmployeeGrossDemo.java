class Employee {
     
	int employeeId;
	String EmployeeName;
	double basicSalary;
	double HRA;
	double DA;
	double grossSal;
	
	public Employee(int employeeId, String EmployeeName, double basicSalary, double HRA, double DA)
	{
		this.employeeId = employeeId;
		this.EmployeeName = EmployeeName;
		this.basicSalary = basicSalary;
		this.HRA = HRA;
		this.DA = DA;
	}
	
	public double calculateGrossSalary()
	{
		grossSal=basicSalary+(basicSalary*HRA)/100+(basicSalary*DA)/100;
		return grossSal;
	}
}

class Manager
{
   int managerId;
   String managerName;
   double basicSalary;
   double HRA;
   double DA;
   double projectAllowance;
   double grossSal;
   
   public Manager(int managerId, String managerName, double basicSalary, double HRA, double DA, double projectAllowance)
   {
	   this.managerId = managerId;
	   this.managerName = managerName;
	   this.basicSalary = basicSalary;
	   this.HRA = HRA;
	   this.DA = DA;
	   this.projectAllowance = projectAllowance;
   }
   
   public double calculateGrossSalary()
   {
	   grossSal= basicSalary+HRA+DA+projectAllowance;
	   return grossSal;
   }
}

class Trainer
{
   int trainerId;
   String trainerName;
   double basicSalary;
   double HRA;
   double DA;
   int batchCount;
   double perkperBatch;
   double grossSal;
   
   public Trainer(int trainerId, String trainerName, double basicSalary, double HRA, double DA, int batchCount, double perkperBatch)
   {
	   this.trainerId =trainerId;
	   this.trainerName = trainerName;
	   this.basicSalary = basicSalary;
	   this.HRA = HRA;
	   this.DA = DA;
	   this.batchCount =batchCount;
	   this.perkperBatch =perkperBatch;
   }
   
   public double calculateGrossSalary()
   {
	   grossSal=basicSalary+HRA+DA+(batchCount+perkperBatch);
	   return grossSal;
   }
}

class Sourcing
{
   int sourceId;
   String sourceName;
   double basicSalary;
   double HRA;
   double DA;
   int enrollmentTarget;
   int enrollmentReached;
   double perkperEnrollment;
   double grossSal;
   
   public Sourcing(int sourceId, String sourceName, double basicSalary, double HRA, double DA, int enrollmentTarget, int enrollmentReached,double perkperEnrollment)
   {
	   this.sourceId =sourceId;
	   this.sourceName = sourceName;
	   this.basicSalary = basicSalary;
	   this.HRA=HRA;
	   this.DA = DA;
	   this.enrollmentTarget =enrollmentTarget;
	   this.perkperEnrollment =perkperEnrollment;
	   this.enrollmentReached = enrollmentReached;
   }
   
   public double calculateGrossSalary()
   {
	   grossSal= basicSalary+HRA+DA+(((enrollmentReached/enrollmentTarget)*100)*perkperEnrollment);
	   return grossSal;
   }
}

class TaxUtil
{
   	public double calculateTax(Employee e)
   	{
   		if(e.calculateGrossSalary()>50000)
   		{
   			double tax=(e.calculateGrossSalary()*(20.0/100));
   			return tax;
   		}
   		else
   		{
   			double tax=(e.calculateGrossSalary()*(5.0/100));
   			return tax;
   		}
   	}
   		
   		public double calculateTax(Manager m)
   	   	{
   	   		if(m.calculateGrossSalary()>50000)
   	   		{
   	   			double tax=m.calculateGrossSalary()*(20.0/100);
   	   			return tax;
   	   		}
   	   		else
   	   		{
   	   			double tax=m.calculateGrossSalary()*(5.0/100);
   	   			return tax;
   	   		}
   	   	}
   		
   	   	public double calculateTax(Trainer t)
   	   	{
   	   		if(t.calculateGrossSalary()>50000)
   	   		{
   	   			double tax=t.calculateGrossSalary()*(20.0/100);
   	   			return tax;
   	   		}
   	   		else
   	   		{
   	   	
		double tax=t.calculateGrossSalary()*(5.0/100);
   	   			return tax;
   	   		}
   	   	}
   	   	
   	 public double calculateTax(Sourcing s)
	   	{
	   		if(s.calculateGrossSalary()>50000)
	   		{
	   			double tax=s.calculateGrossSalary()*(20.0/100);
	   			return tax;
	   		}
	   		else
	   		{
	   			double tax=s.calculateGrossSalary()*(5.0/100);
	   			return tax;
	   		}
	   	}    	
}



public class EmployeeGrossDemo
{
   public static void main(String[] args)
   {
	   Employee e = new Employee(101, "Rutuja", 70000, 1000, 700);
	   System.out.println(e.calculateGrossSalary());
	   Manager m = new Manager(110, "Raj", 120000, 2500, 1500, 50000);
	   System.out.println(m.calculateGrossSalary());
	   Trainer t = new Trainer(201, "Anshul", 40000, 700,500, 50, 2000);
	   System.out.println(t.calculateGrossSalary());
	   Sourcing s = new Sourcing(230, "Sandra", 90000, 2000,1500, 100, 20000, 50);
	   System.out.println(s.calculateGrossSalary());
	   
	   TaxUtil taxx = new TaxUtil();
       double emptax= taxx.calculateTax(e);
       System.out.println("Employee Tax is:" +emptax);
       
       double mangertax = taxx.calculateTax(m);
       System.out.println("Manager Tax is:" +mangertax);
       
       double trainertax = taxx.calculateTax(t);
       System.out.println("Triner Tax is:" +trainertax);
       
       double sourcetax = taxx.calculateTax(s);
       System.out.println("Sourcing Tax is:" +sourcetax);
	   
   }
}


















