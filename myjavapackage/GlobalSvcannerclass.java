package myjavapackage;
import java.util.*;
import java.util.Scanner;
public class GlobalSvcannerclass {

	Scanner s1=new Scanner(System.in);
    int a1= s1.nextInt(); 
    int b1= s1.nextInt();
	
	void add()
	{
		int sum=a1+b1;
		System.out.println("sum="+sum);
		
	}
	void sub()
	{
		
		int subtraction=a1-b1;
		System.out.println("sub="+subtraction);
	}
	void multi()
	{
		int multiplication=a1*b1;
		System.out.println("mul="+multiplication);
	}
	void div()
	{
	
		int division=a1/b1;
		System.out.println("div="+division);
	}
	void modulus()
	{
		int mod=a1%b1;
		System.out.println("mod="+mod);
	}

	public static void main(String[] args) 
	{
              GlobalSvcannerclass s2 =new GlobalSvcannerclass();
              s2.add();
              
              s2.sub();
              s2.multi();
              s2.modulus();
              s2.div();
              
	}

}