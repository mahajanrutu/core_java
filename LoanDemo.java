class Loan {
	
	private double principal;
	private double interestRate;
	private int durationMonths;
	
	public Loan(double principal, double interestRate, int durationMonths)
	{
		this.principal = principal;
		this.interestRate = interestRate;
		this.durationMonths = durationMonths;
		
		if(principal==0 || interestRate==0 || durationMonths==0)
		{
			System.out.println("Error");
		}
	}
	
	public double calculateMonthlyPayment()
	{
		double SimpleIntrest= (principal*interestRate*(double)durationMonths)/100;
		double amt=principal+SimpleIntrest;
		return amt/durationMonths;
	}
	
	public double getPrincipal()
	{
		return principal;
	}
	
}

public class LoanDemo
{
public static void main(String[] args) 
      {
          Loan l=new Loan(100000, 15, 12);
	  System.out.printf("%.2f",l.calculateMonthlyPayment());
      }
}

