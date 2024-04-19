package typecasting;


interface add
{
	
	void sub();
	void mul ();
}
 interface raj extends add
 {
	 void div();
 }

public class UpcasteingProgram implements raj
{
  void mod()
  {
	  System.out.println("money");
  }
  
	public static void main(String[] args) 
	
	{
	 
		//raj u1 = (raj) new UpcasteingProgram ();
		raj l1= new UpcasteingProgram (); //upcasting
		
		UpcasteingProgram u1 = (UpcasteingProgram)l1;
		
		l1.div();
		
		
	}

	@Override
	public void sub() {
		System.out.println("raj");
		
	}

	@Override
	public void mul() {
		System.out.println("rani");
		
	}

	@Override
	public void div() {
		System.out.println("gurun");
		
	}

}
