class Student 
{
  int studentId = 100;
  String studentName = "Raj";
  
  public void showStudentData()
  {
	  int studentId = 200;
	  String studentName = "Ravi";
	  
	  System.out.println(studentId);
	  System.out.println(studentName);
  }
  
}

public class StudentsDemo
{
	public static void main(String[] args)
	{
		Student s = new Student();
		s.showStudentData();
	}

}