package switchcase;

import java.util.Scanner;

public class Switch_Example 
{
	static Scanner s1 =new Scanner(System.in);
	static int b= s1.nextInt();
	static int a= s1.nextInt();

	public static void main(String[] args) 
	{
		switch(2)
		{
		case 1:
			int sum =a+b;
			System.out.println("addition "+sum);
			break;
		case 2 :
			int sub =a-b;
			System.out.println("addition "+sub);
			break;
		case 3:
			int mul =a*b;
			System.out.println("addition "+mul);
			break;
			default : 
			System.out.println("cases are wrong then execute");
			
			
		}

	}

}
