package interviewprogram1;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) 
	{
		int temp;
		Scanner s= new Scanner(System.in);
		System.out.println("enter values");
		int x=s.nextInt();
		int y= s.nextInt();
		System.out.println("x = " +x + " y = "+y);
		
		temp = x ;
		x= y ;
		y= temp;
		System.out.println("swappe memmbers");
		System.out.println("x = " +x + " y = "+y);
		

	}

}
