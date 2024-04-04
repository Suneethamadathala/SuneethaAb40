package interviewprograms;

import java.util.Scanner;

public class ReverseNum {
	

	public static void main(String[] args) 
	{
		int i = 245  ,rev = 0;
		//System.out.println("enter number");
		//Scanner s1=new Scanner (System.in);
		//i= s1.nextInt();
		while( i!=0)
		{
		rev =rev*10;
		rev = rev+i%10;
		i= i/10;
		}
		System.out.println(rev);
	}

}
