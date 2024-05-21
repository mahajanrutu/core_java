class Studentinfo {
	
	private String Sname;
	private int Rollnb;
	private double per;

	public Studentinfo(String Sname, int Rollnb, double per)
	{
		this.Sname = Sname;
		this.Rollnb = Rollnb;
		this.per = per;
	}
	
	public String getStudentName()
	{
		return Sname;
	}
	public void setStudentName(String Sname)
	{
		this.Sname = Sname;
	}
	
	public int getRollnb()
	{
		return Rollnb;
	}
	public void setRollnb(int Rollnb)
	{
		this.Rollnb = Rollnb;
	}
	
	public double getpercentage()
	{
		return per;
	}
	
	public void setpercentage(double per)
	{
		this.per = per;
	}	
	
}


public class StudentinfoDemo {

	public static void main(String[] args) 
	{
        Studentinfo s = new Studentinfo("Rutuja", 112, 84.60);
        s.setStudentName("Rushi");
        String n=s.getStudentName();
        System.out.println(n);
        s.setRollnb(116);
        int r=s.getRollnb();
        System.out.println(r);
        s.setpercentage(90.94);
        double p=s.getpercentage();
        System.out.println(p);
	}

}