package myjavapackage;

public class LogicalOperatorOR {

	public static void main(String[] args) {
		int age =21;
		double salary=1000;
		if ( age<18 || salary==1000)
		{
			System.out.println("condition true");
			
		}
		else if (age>15 || salary==2000)
		{
			System.out.println("condition is false");
		}
		else 
		{
			System.out.println("both fail else condition execute");
		}
	}

}
	


