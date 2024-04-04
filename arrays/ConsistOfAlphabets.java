package arrays;

import java.util.Arrays;

public class ConsistOfAlphabets {

	public static void main(String[] args) 
	{
		boolean answer;
		int count_of_alpha = 0;
		String s = "Suneetha";
	  char[] alpha = s.toCharArray();
	  
	  for(int i =0;i<alpha.length;i++)
	  {
		  answer =Character.isAlphabetic(alpha[i]);
	  if(answer==true)
	  {
		  count_of_alpha++;
	  }
	  }
	  
	  if (alpha.length==count_of_alpha )
	  {
		 
	 System.out.println(" Consists of alphabets ");
	 
	  }
	  else 
	  {
		  System.out.println(" Not Consists of alphabets ");
	  } 
	  }
	}


