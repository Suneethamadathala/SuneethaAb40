package heraricalinheritance;

public class Testcase2 extends Login
{
   void  serching_adding_towhislist()
   {
	  System.out.println("adding to whislist"); 
   }
	public static void main(String[] args) 
	{
		Testcase2 t2 = new Testcase2();
		  
		t2.Register();
		
		t2.serching_adding_towhislist();
	}

}
