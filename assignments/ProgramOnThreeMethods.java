package assignments;

public class ProgramOnThreeMethods 
{
	ProgramOnThreeMethods()//constructor has same has classname
	{
		int a =34;
		int b=45;
		int sum= a+b;
		System.out.println("addition " +sum);
	}
   void multi() //Non static method 
   {
	   int a =20;
	   int b=10;
	   int mul =a*b;
	   
	System.out.println("Multiplication " +mul);
   }
   
   private static void divi()
   {
	   int a =20;
	   int b=10;
	   int div =a/b; 
	   System.out.println("division " +div);
   }
  
	public static void main(String[] args) 
	{
		ProgramOnThreeMethods p1 = new ProgramOnThreeMethods();//Calling Constructor
		p1.multi(); // Calling Non static method 
		divi(); // Calling static method 

	}

}
