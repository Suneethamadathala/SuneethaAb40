package accessspecifier;

public class AccessSpe1 
{
	  public static void Ac1()
	     {      
		System.out.println("PublicSpecifier");
	     }
	  protected static void Ac21()
	     {      
		System.out.println("Protecter Specifier");
	     }
	  private void Ac2()
	     {      
		System.out.println("private Specifier");
	     }
	  AccessSpe1()
	     {      
		System.out.println("default/Package  Specifier");
	     }
	public static void main(String[] args) 
	{

		AccessSpe1 c1= new AccessSpe1();
		c1.Ac2();
		Ac1();
		Ac21();
	}
	

}

// Accesspecifier with in the class can access all the specifiers 
