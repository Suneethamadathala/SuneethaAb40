package assignments;

public class MethodOverloading {
	void add()
	{
		
		System.out.println("2");
	}
	public void sub(int a,int b)
	{
		System.out.println("1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading m1= new MethodOverloading();
		m1.add();
		m1.sub(10, 20);
				
	}

}
