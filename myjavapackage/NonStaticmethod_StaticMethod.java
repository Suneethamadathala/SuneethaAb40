package myjavapackage;

public class NonStaticmethod_StaticMethod {

	void add()
	{
		int a= 12;
		    a=24;// updating value 
		int b= 24;
		int sum= a+b;
		 System.out.println("adition" + sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticmethod_StaticMethod n1= new NonStaticmethod_StaticMethod();
		n1.add();
	}

}
 