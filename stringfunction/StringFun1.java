package stringfunction;

import java.util.Arrays;

public class StringFun1 {

	public static void main(String[] args) 
	{
	  String s1 = "suneetha  Reddy 12 r ";
	  String output="";
	  
	  System.out.println(s1.replace('s', 'n'));
	  System.out.println(s1.replaceAll("[A-Z]",""));
	  System.out.println(s1.replaceAll("[a-z]",""));
	  System.out.println(s1.replaceAll("[0-9]",""));
	  System.out.println(s1.replaceAll("[A-Z]", "MANISH"));
	  System.out.println(s1.isEmpty());
	  System.out.println(s1.lastIndexOf('r'));
	  System.out.println(s1.repeat(2));
	  
	  
	  for(int i =s1.length()-1;i>=0;i--)
	  {
		  char [] c = s1.toCharArray();

		  System.out.print(c[i]);
		  //System.out.println(Arrays.toString(c));
	  }
	  System.out.println(" ");
		  for(int i1 =s1.length()-1;i1>=0;i1--)
		  {
			char c1  =s1.charAt(i1);
			
			System.out.print(c1);
		  }
		  
	  }
	  

	}


