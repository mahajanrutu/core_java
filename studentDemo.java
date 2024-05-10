class Student
{
   int studentId;
   String studentName;
   int marks;
   char grade;

   public void setStudentData(int id, String name, int mark)
   {
        studentId=id;
        studentName= name;
        marks= mark;   
   }
   
  public void displayDetails()
  {
     System.out.println("Student Id is:"+studentId);
     System.out.println("Student Name is:"+studentName);
     System.out.println("Student Marks is:"+marks);
     System.out.println("Student Grade is:"+grade);
  }
  
  public void calculateGrade()
  {
     if(marks>90)
     {
        grade ='A';
     }
     else if(marks>=81 || marks<=90)
     {
         grade='B';
     }
     else if(marks>=71 || marks<=80)
     {
        grade='C';
     }
     else if(marks>=61 || marks<=70)
     {
       grade='D';
     }  
     else
     {
       grade='E';
     }

  }

}


public class studentDemo
{
   public static void main(String[] args)
   {
      Student s= new Student();
      s.setStudentData(111, "Rutuja", 94);
      s.calculateGrade();
      s.displayDetails();
   }
}


















