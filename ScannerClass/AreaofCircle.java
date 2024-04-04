package ScannerClass;

import java.util.Scanner;

public class AreaofCircle 
{
  final static double pi=3.14;
  
	public static void main(String[] args) 
	{

      Scanner s1 =new Scanner (System.in);
      System.out.println("enter radious value ");
      int r =s1.nextInt();
      double circle= pi*r*r;
      System.out.println("result" +circle);
      s1.close();

	}

}
