class Marks
{
    String name;
    int age,m1,m2,m3;
    int max;
    double avg;
    
    public Marks(String name, int age, int m1, int m2, int m3)
    {
    this.name =name;
    this.age = age;
    this.m1 = m1;
    this.m2 = m2;
    this.m3 = m3;
    }
    
    public void getMarks()
    {
        avg = ((m1+m2+m3)/3);
        
        if(m1>m2 && m1>m3)
        {
            
            max=m1;
        }
        else if(m2>m3)
        {
            max=m2;
        }
        else
        {
            max=m3;
        }
        
    }
    
    public void display()
    {
        System.out.println("Name="+name+", Age="+age+", M1="+m1+", M2="+m2+", M3="+m3+", Maximum="+max+", Average="+avg);
    }
    
}   




public class StudentMarks
{
    public static void main(String[] args)
    {
        Marks m= new Marks("Rutuja", 23,98,97,92);
        
       
        m.getMarks();
         m.display();

        
        
    }
}