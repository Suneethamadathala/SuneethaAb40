package stringfunction;

public class CountofDigits {

	public static void main(String[] args) 
	{
		boolean answer;
		int result =0;
		String s="Suneetha123";
		char[] a1 = s.toCharArray();
		for (int i=0 ;i<s.length();i++)
		{
			answer= Character.isDigit(a1[i]);
			//System.out.println(answer);
			if(answer==true)
			{
				result++;
				
				
			}
			
		}
		System.out.println("print number displayed "+result);
	}

}
