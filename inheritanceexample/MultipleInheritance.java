package inheritanceexample;

class Teacher
{
	void sunee()
	{
		System.out.println("sunee asked teacher");
	}
}

class Mentor
{
	void chet()
	{
		System.out.println("sunee asked mentor");
	}
}

public class MultipleInheritance extends Mentor , Teacher
{
	void neeraaj()
	{
		System.out.println("child not extended");
	}

	public static void main(String[] args) 
	{
		MultipleInheritance m1 = new MultipleInheritance();
		

	}

}
