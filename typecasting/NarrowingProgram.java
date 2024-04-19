package typecasting;

public class NarrowingProgram {

	public static void main(String[] args) 
	{
		// convert weight 45.83 into int data type
		
		double b= 45.83;
		int weight= (int)45.83;//Narrowing will be done explicitly
		//int weight =  (int) (b);
		System.out.println(weight);

	}

}
