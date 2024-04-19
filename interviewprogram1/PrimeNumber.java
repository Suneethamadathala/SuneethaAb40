package interviewprogram1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int num ,i;
		boolean isprime = true;
		Scanner s= new Scanner(System.in);
		num =s.nextInt();
		if(num<=1)
		{
			isprime = false;
		}
		else
		{
		for(i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				isprime =false;
				
				break;
			}}
					}
		if(isprime)
		{
			System.out.println("primenumber" + num);
		}
		else
		{
			System.out.println("non prime number"+ num);
		}

	}

}
