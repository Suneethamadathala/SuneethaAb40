package myjavapackage;
import java.util.Scanner;
public class ScannerClassExample 
{
	public static void main(String[] args) 
	{
Scanner s1=new Scanner(System.in);
System.out.println("Enter the first no->");
	int firstno=		s1.nextInt();
	System.out.println("Enter the second no->");
	int secondno=		s1.nextInt();
	int sum=firstno + secondno;
	System.out.println("The addition of the 2 number is-> "+sum);


	}

}
