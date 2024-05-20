class Movie {
       private String title;
       private int relaseYear;
       private String genre;
       
       public Movie(String title, int relaseYear, String genre)
       {
    	  this.title = title;
    	  this.relaseYear = relaseYear;
    	  this.genre = genre;
       }
       
       public String getTitle()
       {
    	   return title;
       }
       
       public void setTitle(String title)
       {
    	   this.title = title;
       }
       
       public int getrelasaYear()
       {
    	   return relaseYear;
       }
       
       public void setrelaseYear(int relaseYear)
       {
    	   this.relaseYear = relaseYear;
       }
       
       public String getgenre()
       {
    	   return genre;
       }
       
       public void setgenre(String genre)
       {
    	   this.genre = genre;
       }
       
       
}


public class MovieDemo
 {

	public static void main(String[] args)
 {
         Movie m = new Movie("ABCD", 2012, "Dance");
         m.setTitle("ABCD Returns");
         String s=m.getTitle();
         System.out.println(s);
         m.setrelaseYear(2015);
         int r = m.getrelasaYear();
         System.out.println(r);
         
	}

}
