package interviewprogram1;

public class ReverseStringUsingArray {

	public static void main(String[] args) 
	{
		String s = "ramireddy";
		
		char[] c = s.toCharArray();//converted to ccharacter array and print reverse
		
		
	for (int i=c.length-1;i>=0;i--)
	{
		System.out.print(c[i]);
	}
		

	}

}
