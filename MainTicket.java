class Ticket {
	
	private String eventName;
	private int seatNumber;
	private double price;
	
	public Ticket(String eventName, int seatNumber, double price)
	{
		super();
		this.eventName = eventName;
		this.seatNumber = seatNumber;
		this.price = price;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}

class VIPTicket extends Ticket {
	
	private String specialAccess;

	public VIPTicket(String eventName, int seatNumber, double price, String specialAccess)
	{
		super(eventName, seatNumber, price);
		this.specialAccess = specialAccess;
	}

	public String getSpecialAccess() {
		return specialAccess;
	}

	public void setSpecialAccess(String specialAccess) {
		this.specialAccess = specialAccess;
	}
	
	

}

class StudentTicket extends Ticket {
   
	 private boolean studentDiscount;

	public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount)
	{
		super(eventName, seatNumber, price);
		this.studentDiscount = studentDiscount;
	}

	public boolean isStudentDiscount() {
		return studentDiscount;
	}

	public void setStudentDiscount(boolean studentDiscount) {
		this.studentDiscount = studentDiscount;
	}
	
	
	 
	 
	 
}

public class MainTicket {

	public static void main(String[] args) 
	{

		Ticket t = new Ticket("Concert", 101, 500);
		VIPTicket v = new VIPTicket("Vip Concert", 201, 1000, "Backstage Acsses");
		StudentTicket s = new StudentTicket("Stundet Event", 301, 300, true);
		
	    t.setEventName("Concert");
	    String n = t.getEventName();
	    System.out.println(n);
	    
	    t.setSeatNumber(110);
	    int sn = t.getSeatNumber();
	    System.out.println(sn);
	    
	    t.setPrice(550);
	    double pp = t.getPrice();
	    System.out.println(pp);
	    
	    v.setEventName("VIP concert");
	    String vip = v.getEventName();
	    System.out.println(vip);
	    
	    v.setSeatNumber(210);
	    int vipsn = v.getSeatNumber();
	    System.out.println(vipsn);
	    
	    v.setPrice(1200);
	    double ppp = v.getPrice();
	    System.out.println(ppp);
	    
	    v.setSpecialAccess("Front Seat");
	    String fs = v.getSpecialAccess();
	    System.out.println(fs);
		
	    s.setEventName("Student Event");
	    String se = s.getEventName();
	    System.out.println(se);
	    
	    v.setSeatNumber(260);
	    int sno = s.getSeatNumber();
	    System.out.println(sno);
	    
	    v.setPrice(200);
	    double pppp = s.getPrice();
	    System.out.println(pppp);
	}

}
