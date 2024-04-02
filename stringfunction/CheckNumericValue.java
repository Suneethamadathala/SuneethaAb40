package stringfunction;

import java.util.Arrays;

public class CheckNumericValue {

	public static void main(String[] args) 
	{
		String s1 = "Suneetha12";
		char[] a1 = s1.toCharArray();
		//System.out.println(Arrays.toString(a1));//to print characters
		for (int i=0 ; i<s1.length(); i++)
		{
	   boolean b= Character.isDigit(a1[i]);
	    System.out.println(b);
	    if(b==true)
	    {
	    	System.out.println("numeric present index "+i);
	    }
	    
		
		}
	}

}
