package interviewprograms;

public class Leapyear {

	public static void main(String[] args) 
	{
		int i=2023;
		boolean leapyear =false;
		
		 if(i%400==0)
		 {
			 leapyear=true;
		 }
		 else if(i%100==0) 
		 {
			 leapyear =false;

	     }
		 else if (i%4==0)
		 {
			 leapyear= true;
			 
		 }
		 else
		 {
			 leapyear =false;
			
		 }
		 if(leapyear)
		 {
			 System.out.println("leapyear" +i);
		 }
	
	else
	{
		System.out.println("not leapyear" +i);
	}

}
}