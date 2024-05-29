class Test
{
    public void characterone(int n, char c)
    {
    	System.out.println("Int: " +n+ " "+ "Char: " +c);
    }
    
    public void characterone(char c, int n)
    {
    	System.out.print("Char: " +c+ " " +"Int: " +n);
	
    }
}







public class FindingAscii {
	public static void main(String[] args)
	{
         Test t = new Test();
    
         
         t.characterone(66, 'A');
         t.characterone('D', 67);         
	}

}