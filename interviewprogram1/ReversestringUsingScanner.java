package interviewprogram1;

import java.util.Scanner;

public class ReversestringUsingScanner {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter String");
		String input = s.next();
		System.out.println("reversed string");
		for (int i = input.length()-1;i>=0;i--)
		{
		char c=	input.charAt(i);

		System.out.print(c);
		}

	}

}
