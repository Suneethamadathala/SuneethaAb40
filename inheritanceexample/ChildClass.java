package inheritanceexample;
class ParentClass
{
	static void add()
	{
		System.out.println("adding ");
	}
	void division()
	{
		System.out.println("division");
	}
	
}

public class ChildClass extends ParentClass
{
	static void multiple()
	{
		System.out.println("multiply");
	}

	public static void main(String[] args)
	{
		ChildClass c1= new ChildClass();
		c1.division();
        multiple();
        add();
        System.out.println("mainmethod");

	}

}
