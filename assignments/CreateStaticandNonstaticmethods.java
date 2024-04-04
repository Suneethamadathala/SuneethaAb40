package assignments;

public class CreateStaticandNonstaticmethods 
{
	public static void add()
	{
		int a=23;
		int b= 39;
		int sum = a+b;
		System.out.println("Addition "+sum);
	}
	private static void multi()
	{
		int a=23;
		int b= 39;
		int mul = a*b;
		System.out.println("Multiplication "+mul);
	}
	protected static void divis()
	{
		int a=20;
		int b= 10;
		int div = a/b;
		System.out.println("division "+div);
	}
	 static void per()
	{
		int a=20;
		int b= 10;
		int perc = a%b;
		System.out.println("percen "+perc);
	}
	 static void Minus()
		{
			int a=20;
			int b= 10;
			int min = a-b;
			System.out.println("minus "+min);
		}

	 public  void nadd()
		{
			int a=23;
			int b= 39;
			int sum = a+b;
			System.out.println("Addition "+sum);
		}
		private  void nmulti()
		{
			int a=23;
			int b= 39;
			int mul = a*b;
			System.out.println("multiplecation "+mul);
		}
		protected  void ndivis()
		{
			int a=20;
			int b= 10;
			int div = a/b;
			System.out.println("division "+div);
		}
		  void nper()
		{
			int a=20;
			int b= 10;
			int perc = a%b;
			System.out.println("percen "+perc);
		}
		 protected void nMinus()
			{
				int a=20;
				int b= 10;
				int min = a-b;
				System.out.println("minus "+min);
			}

	public static void main(String[] args) 
	{
		System.out.println("Statsic Methods");
		add();
		Minus();
		per();
		divis();
		multi();
		System.out.println("Non Statsic Methods");
		CreateStaticandNonstaticmethods  c1 =new CreateStaticandNonstaticmethods();
		c1.nadd();
		c1.nMinus();
		c1.ndivis();
		c1.nper();
		new CreateStaticandNonstaticmethods().nmulti();// another way of calling nonstaticmethod
		
		

	}

}
