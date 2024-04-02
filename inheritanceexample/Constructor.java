package inheritanceexample;


class City
{
	City( int a)// constructor should be same class name 
	{
		System.out.println(a);
		System.out.println("3");
	}
}

class Bangalore extends City
{  
	Bangalore()
	{
	super(10);
		System.out.println("2");
	}
}

public class Constructor 
{
	// if the class does not relation ship with another class
	//object should be of relation classes
	public static void main(String[] args) 
	{
		Bangalore c1 = new Bangalore();

	}

}
