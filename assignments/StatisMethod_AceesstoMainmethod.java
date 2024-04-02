package assignments;

public class StatisMethod_AceesstoMainmethod {
	
	static void add()
	{
		int a=20;
		int b=30;
		int sum =a+b;
		System.out.println("addition " +sum);	
	}
	public static void sub()
	{
		int a=50;
		int b=30;
		int minus =a-b;
		System.out.println("Substarction " +minus);	
	}

   private  static void mul()
   {
	int a=50;
	int b=30;
	int multi = a*b;
	System.out.println("multiplication " +multi);
	
}
    static void div()
    {
 	int a=50;
 	int b=5;
 	int divis = a/b;
 	System.out.println("division " +divis);
 	
 }
	public static void main(String[] args) {
		
		add();
		sub();
		mul();
		div();
		add();
	}

}
