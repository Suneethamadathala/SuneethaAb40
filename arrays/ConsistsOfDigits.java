package arrays;

import java.util.Arrays;

public class ConsistsOfDigits {

	public static void main(String[] args) 
	
	{
		boolean ans;
		int consists_of_digits =0;
      String s= "446545657";
       char[] digits = s.toCharArray();
       for(int i=0 ;i< digits.length;i++)
       {
    	 ans=  Character.isDigit(digits[i]);
       
    	 if(ans==true)
    		 
    	 {
    		 consists_of_digits++; 
    	 
       }
       }
        if (digits.length==consists_of_digits)
        {
        	System.out.println("consists of digits");
        }
        else
        {
        	System.out.println("not consists of digits");
        }
       
       
	}
	
	
}
