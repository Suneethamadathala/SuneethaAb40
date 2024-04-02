package stringfunction;

import java.util.Date;

public class Print10daysaheadtime 
{

	public static void main(String[] args) 
	{
		Date d1= new Date();
		long servertime = d1.getTime();
		System.out.println(servertime);
		Date humantime = new Date(d1.getTime());
		System.out.println(humantime);
		 Date d3= new Date(d1.getTime()+(1000*60*60*10)*24*10);
		 System.out.println(d3);
		 
		  String sam=d3.toString();
	      String date =  sam.substring(0, 4);
	      System.out.println(date);
	      String month =  sam.substring(4, 7);
	      System.out.println(month);
 
	}

}
