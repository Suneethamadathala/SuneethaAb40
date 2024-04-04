package heraricalinheritance;

public class Testcase1 extends Login
{
	static void adding_cart()
	{
		System.out.println("adding cart");
	}

	public static void main(String[] args) 
	{
		Testcase1 t1 = new Testcase1();
		t1.Register();
		adding_cart();
	}

}
