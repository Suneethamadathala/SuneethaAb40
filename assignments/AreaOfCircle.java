package assignments;

import java.util.Scanner;

public class AreaOfCircle 
{
	static final double pi = 3.14;
	
	public static void main(String[] args) 
	{
	 
      Scanner s1 = new Scanner(System.in);
      System.out.println("type intger value");
      int r = s1.nextInt();
      System.out.println("type double value");
        double r1 =s1.nextDouble();
        s1.close();
         double circle =pi*r*r1;
         System.out.println("type double value"  + circle);
     
   	}

}
