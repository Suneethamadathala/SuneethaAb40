package abstractpackage;


abstract class Mathfunction
{
	abstract void add();
	abstract void mul();
	void divide()
	{
		int a=20;
				int b=30;
		int sum = a+b;
		System.out.println(sum);
	}
}
abstract class maths extends Mathfunction
{
	abstract void minus();
	abstract void multiply();
	static void modu()
	{
		int a=30;
		int b=20;
        int modulas = a%b;
       System.out.println(modulas);
	}

}

public class Example_abstarct_concreate_Methods extends maths
{
  void facebook()
  {
	  System.out.println("login facebook");
  }
  void  insta()
  {
	  System.out.println("login insta");
  }
	public static void main(String[] args) 
	{
	
		Example_abstarct_concreate_Methods e1 =new Example_abstarct_concreate_Methods();
		e1.modu();
		e1.divide();
		e1.insta();
		e1.facebook();
		e1.minus();
		e1.mul();
		e1.multiply();
		e1.add();
		
	}
	@Override
	void minus() {
		int a=10;
		int b =5 ;
		int minus = a-b;
		System.out.println(minus);
				
		
	}
	@Override
	void multiply() {
		int a=10;
		int b =5 ;
		int multi = a*b;
		System.out.println(multi);
	}
	@Override
	void add() 
	{
		int a=10;
		int b =5 ;
		int addi = a+b;
		System.out.println(addi);
		
	}
	@Override
	void mul() {
		int a=10;
		int b =5 ;
		int mult = a+b;
		System.out.println(mult);
		
	}

}
