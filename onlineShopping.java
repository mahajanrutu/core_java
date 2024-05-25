class Product {
	
	protected String productName;
	protected int productPrice;
	int quantity;
	
	public Product(String productName, int productPrice) 
	{
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public void displayInfo()
	{
		System.out.println("Product Name is = " +productName);
		System.out.println("Product Price is = " +productPrice);
	}
	
	public int calculateTotalCost(int quantity)
	{
		this.quantity = quantity;
		return (productPrice*quantity);
	}

}


class Electronics extends Product {
	
	private String productBrand;

	public Electronics(String productName, int productPrice, String productBrand) 
	{
		super(productName, productPrice);
		this.productBrand = productBrand;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Product Brand Name is = " +productBrand);
	}
	
	

}


class Clothing extends Product 
{
	
	private String clothSize;

	public Clothing(String productName, int productPrice, String clothSize)
	{
		super(productName, productPrice);
		this.clothSize = clothSize;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Cloth size is = " +clothSize);
	}
	
	

}


public class onlineShopping {

	public static void main(String[] args) {

		Electronics e = new Electronics("T.V", 50000, "SONY");
		Clothing c = new Clothing("Tshirt", 600, "Medium");
		e.displayInfo();
		System.out.println("Total Cost of Electronics is = " +e.calculateTotalCost(4));
        System.out.println("****************************************");
		c.displayInfo();
		System.out.println("Total cost of Cloths = " +c.calculateTotalCost(10));
		System.out.println("****************************************");
		
	}

}

