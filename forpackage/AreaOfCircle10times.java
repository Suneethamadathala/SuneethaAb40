package forpackage;
import java.util.Scanner;
public class AreaOfCircle10times 
{
     final static double pi=3.14;
     Scanner s1;
     
     void circle()
     {
    	s1 = new Scanner(System.in);
 		System.out.println("enter radious value");
 		int r = s1.nextInt();
 		double sum = pi*r*r;
 		System.out.println(sum);
     }
	public static void main(String[] args) 
	{
		AreaOfCircle10times a1=new AreaOfCircle10times();
	    for(int i=1;i<=10;i++)
		{
	    	a1.circle();
		}
	  
	}

}
