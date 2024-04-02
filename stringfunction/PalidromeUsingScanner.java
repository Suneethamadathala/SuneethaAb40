package stringfunction;

import java.util.Scanner;

public class PalidromeUsingScanner {

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("enter string ");
		String input= s1.next();
        String output ="";
        for (int i=input.length()-1;i>=0;i--)
        {
        	char rev = input.charAt(i);
        	//System.out.print(rev);
        	output = output+rev;
        	
        }
        
        System.out.println(output);
        System.out.println(input);
        
        if(input.equalsIgnoreCase(output))
        {
        	System.out.println("palidrome "+output);
        }
        
        else
        {
        	System.out.println("Not palidrome "+output);
        }
		
	}

}
