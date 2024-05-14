class Customer 
{
  int customerId;
  String customerName;
  
  public void setCustomerData(int customerId, String customerName)
  {
	  customerId = customerId;
	  customerName = customerName;
	 
  }
  
  public void getCustomerData()
  {
	  System.out.println("Customer Id is :"+customerId);
	  System.out.println("Customer Name is :"+customerName);
  }
  
}


public class CustomerDemo 
{

	public static void main(String[] args) 
	{
		Customer c1 = new Customer();
		c1.setCustomerData(111, "John");
		c1.getCustomerData();

	}

}
