package arrays;

import java.util.Arrays;

public class CheckNumericValue_InString {

	public static void main(String[] args) 
	{
       String s= "Su45neetha123";
       // int value[] = new int[10];
        
       for(int i=0 ; i<s.length();i++)
       {
    	  char num =  s.charAt(i);
    	 boolean ans = Character.isDigit(num);
    	   
       if (ans== true)
       {
        System.out.println("numeric value "+i);
       }
	}

	}}
