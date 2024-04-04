package inheritanceexample;


class add1
{
	static int a=23;
	static int b=4;
	
	static void adding()
	{
		int sum =a+b;
		System.out.println(sum);
	}
}

class muliply1 extends add1
{
	static int a=23;
	static int b=4;
	
	static void muliplication()
	{
		int mul = a*b;
		System.out.println(mul);
	}
}
class division1 extends muliply1
{
	static int a=23;
	static int b=4;
	
	static void divide()
	{
		
		int div = a/b;
		System.out.println(div);
	}
}

class modul1 extends division
{
	static int a;
	static int b;
	static void modulation()
	{

        int mod = a%b;
		System.out.println(mod);
	}
}

public class GobalInheritance extends modul1
{
	static int a=10;
	static int b =2;
	static void subtract()
	{
		int sub = a-b;
		System.out.println(sub);
	}
	public static void main(String[] args) 
	{
		subtract();
		modulation();
	}

}

