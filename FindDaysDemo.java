class FindDays {
 
	 private int totalDays;
	 	 
	public FindDays(int totalDays) 
	{
		this.totalDays = totalDays;
		//this.years = years;
		//this.remainingDays = remainingDays;
		//this.months = months;
		//this.remaing = remaing;
	}
	
	public void calculateDays()
	{
		int years = totalDays/ 365;
		System.out.println("Years " +(years));
		int remaning = totalDays % 365;
		int months = remaning/ 30;
		System.out.println("Months " +(months));
		int remainingDays = remaning % 30;
		System.out.println("Days " +(remainingDays));
	}
	 
	 
}


public class FindDaysDemo {

	public static void main(String[] args) {

          FindDays f = new FindDays(1234);
          
          f.calculateDays();
	}

}
