package inheritanceexample;

class city1
{
	void bangalore()
	{
		System.out.println("munnekolala");
	}
}
public class SingleInheritance  extends city1
{
	static void andra()
	{
		System.out.println("gvpeta");
	}

	public static void main(String[] args) 
	{
		andra();
		SingleInheritance s1= new SingleInheritance();
		s1.bangalore();

	}

}
