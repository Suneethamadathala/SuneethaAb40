package inheritanceexample;

class add
{
	static void adding()
	{
		int a=10;
		int b=20;
		int sum =a+b;
		System.out.println(sum);
	}
}

class muliply extends add
{
	static void muliplication()
	{
		int a = 10;
		int b=3;
		int mul = a*b;
		System.out.println(mul);
	}
}
class division extends muliply
{
	static void divide()
	{
		int a = 10;
		int b=3;
		int div = a/b;
		System.out.println(div);
	}
}

class modul extends division
{
	static void modulation()
	{
		int a = 10;
		int b=3;
		int mod = a%b;
		System.out.println(mod);
	}
}

public class Multilevelwith_5classes extends modul
{
	static void subtract()
	{
		int a = 10;
		int b=3;
		int sub = a-b;
		System.out.println(sub);
	}
	public static void main(String[] args) {
		subtract();
		adding();
		modulation();
		muliplication();
		divide();
	}

}
