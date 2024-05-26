class Movie {

	private String movieName;
	private int releaseDate;
	protected double ticketPrice;
   // double quantity;
	
		
	public Movie(String movieName, int releaseDate, double ticketPrice)
	{
		super();
		this.movieName = movieName;
		this.releaseDate = releaseDate;
		this.ticketPrice = ticketPrice;
		//this.quantity = quantity;
	}

	public void displayInfo()
	{
		System.out.println("Moive Name is: " +movieName);
		System.out.println("Movie Release date: " +releaseDate);
		System.out.println("Ticket Price of movie is: " +ticketPrice);
	}
	
	/*public double calculateTicket(double quantity)
	{
		this.quantity = quantity;
		return (ticketPrice*quantity);*/
	}
	
	


class Seats extends Movie {

	private String phase;
	double price;
	 double quantity;

	public Seats(String movieName, int releaseDate, double ticketPrice, String phase) 
	{
		super(movieName, releaseDate, ticketPrice);
		this.phase = phase;
	}
	public void selectphase()
	{
		super.displayInfo();
		System.out.println("Select your preferance for Setting middle Lower or upper: " +phase);
		
	}
	
	public void conditionPhase()
	{
		if(phase=="Lower")
		{
			price = ticketPrice+100;
			System.out.println("You have choose Lower you have to pay extra 100 each");
		}
		else if(phase=="Middle")
		{
			price = ticketPrice+150;
			System.out.println("You have choose Middle you have to pay extra 150 each");

		}
		else
		{
		    price = ticketPrice+200;
			System.out.println("You have choose Upper you have to pay extra 200 each");

		}
	}
	
	public double calculateTicket(int quantity)
	{
		this.quantity = quantity;
		System.out.println("Quantity of tickets is: " +quantity);
		return (price*quantity);
	}
	
}



class meals extends Movie {
	
	private String mealsCombo;
	double price;
	double quantity;
	

	public meals(String movieName, int releaseDate, double ticketPrice, String mealsCombo)
	{
		super(movieName, releaseDate, ticketPrice);
		this.mealsCombo = mealsCombo;
	}
	
	public void selectCombo()
	{
		super.displayInfo();
		System.out.println("Burger+ColdDrink/ Burger+Fires / Fires+ColDrink / Popcorn / Popcorn+ColdDrink: " +mealsCombo);
	}
	
	public void conditionForMeals()
	{
	   if(mealsCombo=="Burger+ColdDrink")	
	   {
		   price= ticketPrice+350;
	   }
	   else if(mealsCombo=="Burger+Fires")
	   {
		   price=ticketPrice+500;
	   }
	   else if(mealsCombo=="Fires+ColDrink")
	   {
		   price=ticketPrice+250;
	   }
	   else if(mealsCombo=="Popcorn")
	   {
		   price=ticketPrice+200;
	   }
	   else if(mealsCombo=="Popcorn+ColdDrink")
	   {
		   price=ticketPrice+275;
	   }
	   else
	   {
		   System.out.println("Sorry we dont anotheroptions");
	   }
	}
	
	public double calculateMeal(int quantity)
	{
		this.quantity = quantity;
		System.out.println("Quantity of MealCombo is: " +quantity);
		return (price*quantity);
	}	
	

}


public class CalculateMovieTicket {

	public static void main(String[] args)
	{
          
		Seats s = new Seats("RRR", 17, 250, "Middle");
		meals m = new meals("DDlJ", 25, 200, "Burger+ColdDrink");
		
		s.selectphase();
        s.conditionPhase();
        System.out.println("You total is: " +s.calculateTicket(2));
		
		System.out.println("****************************************************************");
        
		m.selectCombo();
		m.conditionForMeals();
		System.out.println("Your total is " +m.calculateMeal(2));
		
	}

}

