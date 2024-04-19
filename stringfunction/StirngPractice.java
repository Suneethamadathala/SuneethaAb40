package stringfunction;

public class StirngPractice {

	public static void main(String[] args)
	{
		String s= "Rajan mavan";
		
		
		System.out.println(s.length());
		System.out.println(s.charAt(6));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		if(s.equals("raman"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		if(s.equalsIgnoreCase("rajan mavan"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		for(int i=s.length()-1;i>=0;i--)
		{
			char c = s.charAt(i);
			System.out.print(c);
		}
		System.out.println("");
		if(s.contains("ram"))
		
		{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		
		System.out.println(s.substring(4));
		System.out.println(s.substring(4, 7));
		System.out.println(s.concat("suneetha"));
		
	}
	

}
