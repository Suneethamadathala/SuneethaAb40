package thiscallingstatement;

public class calculator 
{
   calculator()
   {
	   System.out.println("this is calculator of parent constructor");
   }
   calculator(int a)
   {
	   this();
	  System.out.println("this is calculator "); 
   }
   calculator(char c)
   {
	   this(10);
	   System.out.println("this is int calculator "); 
   }
   
	public static void main(String[] args) 
	{
		
		calculator c1= new calculator('r');
	}

}
