package stringfunction;

public class AvgValuePresen {

	public static void main(String[] args) 
	{
		int num[] = new int[5];
		num[0]= 50;
		num[1]=30;
		num[2]=65;
		num[3]=67;
		num[4]=98;
		int sum=0;
		for (int i=0; i<num.length;i++)
		{
			sum=sum+num[i];
		}
		System.out.println(" calculated sum " +sum);
		double db = sum/num.length;
		System.out.println(db);
			
	    
		

	}

}
