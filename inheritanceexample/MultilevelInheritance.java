package inheritanceexample;
class GrandParentClass
{
	static void UN()
	{
		System.out.println("enter Credentilas");
	}
}
class Super_Class extends GrandParentClass
 {
	static void login()
	{
		System.out.println("please login ");
	}
}

public class MultilevelInheritance extends Super_Class
{
    static void Testcase1()
    {
    	System.out.println("execute the testcase ");
    }
	public static void main(String[] args) 
	{
		UN();
		login();
		Testcase1();

	}

}
