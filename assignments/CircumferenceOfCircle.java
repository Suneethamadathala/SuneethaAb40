package assignments;

import java.util.Scanner;

public class CircumferenceOfCircle 
{
    static final double pi =3.14;
    
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		 int r = s1.nextInt();
		 double CC = 2*pi*r;
		 System.out.println("Circumferenceofcircle " +CC);
 s1.close();
	}

}
