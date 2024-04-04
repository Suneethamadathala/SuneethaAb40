package assignments;

public class HowToAcessStaticmethod_MainMethod 
{
	
	static void add()
	{
		System.out.println("addition");
	}
	 static void substraction()
	 {
		System.out.println("substraction");
	 }
    static void multiplecation()
    {
    	System.out.println("multiplex");
    }
    
    static void division()
    {
    	System.out.println("division");
    }
	public static void main(String[] args) 
	{
		add();
		division();
		System.out.println("main method");
		substraction();
		multiplecation();
		division();
        add();		
	}

}
