package interviewprogram1;

import java.util.Random;

public class GenerateRandomNumbers 
{
	public static void main(String[] args)
	{
		//for(int i=0 ;i<10;i++)
		//{
		//System.out.println(Math.random());
		//}
		Random r = new Random();
		for(int i=0;i<10;i++)
		{
		int b =r.nextInt(100);
		System.out.println(b);
		double d= r.nextDouble(20);
		System.out.println(d);
	}}

}
