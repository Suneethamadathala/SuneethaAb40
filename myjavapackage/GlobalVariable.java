package myjavapackage;

public class GlobalVariable 
{

	int z =100; //Global variable 
	static double Pi =3.14;//Global variable //can be utilize in with the class and any method 
	static char gender;
	static int name;
	static boolean b;
	static String s;
	void add()
	{
		int a =10;//local variable 
	}
	static void mul()
	{
		System.out.println(Pi);
	}
	public static void main(String[] args) 
	{
	
        System.out.println(Pi);
        System.out.println(name);
        System.out.println(gender);
        System.out.println(b);
        System.out.println(s);
	}

}
