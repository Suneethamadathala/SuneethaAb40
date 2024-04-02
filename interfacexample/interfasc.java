package interfacexample;


	interface maths
	
	{
		 void add();
		 int sub();
	}
	interface functions
	{
		void mul();
		int divide();
	}
	
	abstract class google
	{
		abstract void login();
	}
	public class interfasc extends google implements functions,maths
	{
		void fb()
		{
		System.out.println("print fb");	
		}
	
	public static void main(String[] args)
	{
		interfasc i1= new interfasc();
		i1.add();
		i1.divide();
		i1.mul();
		i1.login();
		i1.sub();
		i1.login();

	}

	@Override
	public void add() 
	{
		System.out.println("print add");	
		
	}

	@Override
	public int sub() 
	{
		System.out.println("print sub");
		return 0;
	}

	@Override
	public void mul() 
	{
		System.out.println("print mul");
		
	}

	@Override
	public int divide()
	{
		System.out.println("print divide");
		return 0;
	}

	@Override
	void login() 
	{
		System.out.println("print divide");
		
	}

}
