package stringfunction;

public class Palindrome {

	public static void main(String[] args) {
		
		String input ="radar";
		String output = "";
		
		for (int i=input.length()-1;i>=0;i--) //backward direction using i--
			{
			char  rev = input.charAt(i);   //charcter of index i will give the charAt()function

			//System.out.print(rev);
			  output= output + rev;
			}
		System.out.println(output);
	
		
	if(input.equals(output))
	{
		System.out.println("palindrom");
	}
	else
	{
		System.out.println("not palindrom");
	}

	}}


