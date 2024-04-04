package assignments;

public class ThreeMethods 
{
	
	public static void add()
	{
		int a;
		a=20;
		int b=10;
		System.out.println(a+b);
	}
     void sub()
     {
    	 int a;
 		a=20;
 		int b=10;
 		System.out.println(a-b); 
     }
     ThreeMethods()
     {
    	 int a;
 		a=20;
 		int b=10;
 		System.out.println(a*b); 
     }
	public static void main(String[] args)     
	{
		
		ThreeMethods t1 = new ThreeMethods();
		t1.sub();
		add();
		
		
		
		

	}

}
