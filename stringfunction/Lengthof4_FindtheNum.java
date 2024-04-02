package stringfunction;

public class Lengthof4_FindtheNum {

	public static void main(String[] args) 
	{
 int num[]=new int[4];
 
    num[0]= 50;
	num[1]=30;
	num[2]=65;
	num[3]=67;
	
	int given_number =65;
	
	for(int i=0;i<num.length;i++)
	{
		if(num[i]==given_number)
		{
			System.out.println("number is present index "+given_number);
		}
		else 
		{
		System.out.println("number is not present " +given_number);
		}
	}
	}

}
