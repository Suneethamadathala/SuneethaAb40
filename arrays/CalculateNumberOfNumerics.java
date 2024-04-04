package arrays;

public class CalculateNumberOfNumerics {

	public static void main(String[] args)
	{
		String name ="suneetha123";
		boolean ans;
		int count = 0;
		 char[] name1= name.toCharArray();
		  for(int i=0 ;i<name.length();i++)
		  {
			ans = Character.isDigit(name1[i]);
			if (ans==true)
			{
				count++;
			}
			
		  }
			System.out.println(" dispaly the count of numeric values in the string "+count);
		 
		  
	}

}
