class Animal {
	private String animalName;
	private int animalAge;
	
	public Animal(String animalName, int animalAge)
	{
		super();
		this.animalName = animalName;
		this.animalAge = animalAge;
	}
	
	public void makesound()
	{
		System.out.println("The animal makes the generic sound");
	}
	
	public void displayInfo()
	{
		System.out.println("Animal Name=" +animalName);
		System.out.println("Animal Age=" +animalAge);
	}



}
class Elephant extends Animal {
	
	private float tuskLength;

	public Elephant(String animalName, int animalAge, float tuskLength)
	{
		super(animalName, animalAge);
		this.tuskLength = tuskLength;
	}
	
	public void makeSound()
	{
		super.displayInfo();
		System.out.println("The elephant trumpets");
	}
	
	public void displayTuskLength()
	{
		System.out.println("Elephants Tusk Length is= " +tuskLength);
	}

}

class Lion extends Animal {
	
	private int maneLength;

	public Lion(String animalName, int animalAge, int maneLength) 
	{
		super(animalName, animalAge);
		this.maneLength = maneLength;
	}
	
	public void makeSound()
	{
		super.displayInfo();
		System.out.println("The lion roars loudly.");
	}
	
	public void displayManeLength()
	{
		System.out.println("Mane Lenght =" +maneLength);
	}

}


public class ZooManagement {

	public static void main(String[] args) {

		Lion l = new Lion("Lion", 32, 176);
		Elephant e = new Elephant("Elephant", 45, 20.75f);
		l.makeSound();
		l.displayManeLength();
		System.out.println("************************");
	    e.makeSound();
		e.displayTuskLength();
	}

}
