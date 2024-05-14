class Customer {
	int customerNumber;
	String customerName;

	public void setCustomerData(int customerNumber, String customerName) {
		this.customerNumber = customerNumber;
		this.customerName = customerName;
	}

	
	public String toString() 
	{
		return "Customer [customerNumber=" + this.customerNumber + ", customerName=" + this.customerName + "]";
	}

}


public class CustomersDemo 
{
	public static void main(String[] args) 
	{
		Customer c1 = new Customer();
		c1.setCustomerData(111, "Rahul");
		System.out.println(c1); //calling toString() of Customer class

	}

}