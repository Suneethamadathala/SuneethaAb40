package arrays;

public class TryCatch_Handling {

	public static void main(String[] args) 
	{
		String s= "Suneetha123";
		int[] value = new int[3];
		
		
		try
		{
			value[0]= 11;
			value[1]=28;
			value[2]=34;
			System.out.println("Execute try block");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Youdeclared array than you initilized");
		}
		
		finally 
		{
			System.out.println("always execute whether try or catch executes");
		}

	}

}
