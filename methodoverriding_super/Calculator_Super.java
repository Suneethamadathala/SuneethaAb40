package methodoverriding_super;

class parent 
{
	void add()
	{
		int a =10;
		int b = 20;
		int sum =a+b;
		System.out.println(sum);
	
	}
}


public class Calculator_Super extends parent
{
	void add()
	{
		super.add(); // super key word used to call the suppressed parent class
		System.out.println("child class");
	}

	public static void main(String[] args) 
	{
		Calculator_Super c1= new Calculator_Super();
		c1.add();
		

	}

}
