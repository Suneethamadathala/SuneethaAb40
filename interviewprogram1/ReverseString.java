package interviewprogram1;

public class ReverseString {

	public static void main(String[] args) 
	{
	 String s = "Ramu raj";
	 String output="";
	  
	for (int i=s.length()-1; i>=0; i--)
	  {
	char rev = s.charAt(i); // inbuilt function 
	
        output=output+rev;
	}
	

	System.out.print(output);
	}

}
