package assignments;

public class ConstructorOverloading 
{
	ConstructorOverloading(int a)
	{
		System.out.println(a);
	}
	ConstructorOverloading(boolean b, char c)
	{
		System.out.println(c);
		System.out.println(b);
	}
	ConstructorOverloading (String s)
	{
		System.out.println(s);
	}
	ConstructorOverloading( int a,boolean b,char c)
	{
		System.out.println("3");
	}
    void add(int a)
    {
    	System.out.println(a);
    }
    static void sub(int a,int b)
    {
    	System.out.println(a+b);
    }
   
	public static void main(String[] args) 
	{
	
		ConstructorOverloading c1 = new ConstructorOverloading(10);
		c1.add(20);
		new ConstructorOverloading(false,'v');
		
	    new ConstructorOverloading("suneetha");
	    sub(30,20);
	    new ConstructorOverloading(10,true,'I');
	    
	}

}
