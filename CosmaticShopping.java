class Cosmatics {
	
	private String categories;
	
	
		public Cosmatics(String categories) 
		{
		super();
		this.categories = categories;
	    }


	public void displayInfo()
	{
		System.out.println("Choose a Categories Face / Eye / Lips: " +categories);
	}
}

class Eye extends Cosmatics {
	
	private String productName;
	private String bName;
	
	public Eye(String categories, String productName, String bName)
	{
		super(categories);
		this.productName = productName;
		this.bName = bName;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Choose Your Product:- Eyeliner / Kajal / Mascara / EyeShadow: " +productName);
		System.out.println("Enter a Brand Name MAC / Sugar / Maybeline / LAKME: " +bName);
	}
	
	double price;
	public void calculatePrice()
	{
		if(productName=="Eyeliner")
		{
			price= 260;
		}
		else if(productName=="Kajal")
		{
			price= 290;
		}
		else if(productName=="Mascara")
		{
			price= 375;
		}
		else if(productName=="EyeShadow")
		{
			price= 500;
		}
		
		System.out.println("Your product price excluding brans is: " +price);
		
	}
	
	double total;
	public void totalOfProduct()
	{
		if (bName=="MAC")
		{
			total = 170+price;
		}
		else if (bName=="LAKME")
		{
			total = 90+price;
		}
		else if(bName =="Maybeline")
		{
			total = 150+price;
		}
		else if(bName == "Sugar");
		{
			total = 130+price;
		}
		System.out.println("Your product total including Brand is: " +total);
	}	
	
	

}

class Face extends Cosmatics {

	private String productName;
	private String facetone;
	private String bName;
	
	
	public Face(String categories, String productName, String facetone, String bName)
	{
		super(categories);
		this.productName = productName;
		this.facetone = facetone;
		this.bName = bName;
	}

	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Choose Your Product:- Foundation / Compact / BB&CC Cream / Blush: " +productName);
		System.out.println("Your Face tone is: " +facetone);
		System.out.println("Enter a Brand Name MAC / Sugar / Maybeline / LAKME: " +bName);
	}
	
	double price;
	public void calculatePrice()
	{
		if(productName=="Foundation")
		{
			price= 400;
		}
		else if(productName=="Compact")
		{
			price= 350;
		}
		else if(productName=="BB&CC Cream")
		{
			price= 375;
		}
		else if(productName=="Blush")
		{
			price= 360;
		}
		System.out.println("Your product price excluding brand is: " +price);
		
	}
	double total;
	public void totalOfProduct()
	{
		 if (bName=="MAC")
		{
			total = 500+price;
		}
		else if (bName=="LAkME")
		{
			total = 200+price;
		}
		else if(bName =="Maybeline")
		{
			total = 400+price;
		}
		else if(bName == "Sugar");
		{
			total = 350+price;
		}
		System.out.println("Your Product price including brand is: " +total);
	}	
	
}

class Lips extends Cosmatics {
	
	private String productName;
	private String bName;
	private String lipstickColor;
	
	
	public Lips(String categories, String productName, String bName, String lipstickColor)
	
	{
		super(categories);
		this.productName = productName;
		this.bName = bName;
		this.lipstickColor = lipstickColor;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Choose Your Product:- Lipstick / Craon Lipstick / Liquid Lipstick / Lip Linear : " +productName);
		System.out.println("Your Lipstick Colour is: " +lipstickColor);
		System.out.println("Enter a Brand Name MAC / Sugar / Maybeline / LAKME: " +bName);
	}
	
	double price;
	public void calculatePrice()
	{
		if(productName=="Eyeliner")
		{
			price= 260;
		}
		else if(productName=="Kajal")
		{
			price= 290;
		}
		else if(productName=="Mascara")
		{
			price= 375;
		}
		else if(productName=="EyeShadow")
		{
			price= 500;
		}
		System.out.println("Your product price excluding brans is: " +price);

	}

	double total;
	public void totalOfProduct()
	{
		if (bName=="MAC")
		{
			total = 170+price;
		}
		else if (bName=="LAKME")
		{
			total = 90+price;
		}
		else if(bName =="Maybeline")
		{
			total = 150+price;
		}
		else if(bName == "Sugar");
		{
			total = 130+price;
		}
		System.out.println("Your Product price including brand is: " +total);

	}	
	
	
	

}

public class CosmaticShopping {

	public static void main(String[] args) {

		Face f = new Face("Face", "Foundation", "Fair", "MAC");
		Eye e = new Eye("Eye", "Mascara", "Maybeline");
		Lips l= new Lips("Lips", "Liquid Lipstick", "Sugar", "Red");
		
		f.displayInfo();
		f.calculatePrice();
		f.totalOfProduct();
		System.out.println("********************************************************");
		
		e.displayInfo();
		e.calculatePrice();
		e.totalOfProduct();
		System.out.println("********************************************************");
		
        l.displayInfo();
        l.calculatePrice();
        l.totalOfProduct();
		
	}

}
