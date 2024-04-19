package stringfunction;

import java.util.Date;

public class futuree {

	public static void main(String[] args) 
	{

       Date d = new Date();
       long b =d.getTime();
       System.out.println(b);
       Date d2 =new Date(d.getTime());
       System.out.println(d2);
       Date d3 = new Date(d.getTime()-(1000*60*60*24));
       System.out.println(d3);
       String s1 = d2.toString();
      String month = s1.substring(8,10);
      System.out.println(month);
      String date = s1.substring(4,8);
      System.out.println(date);
      System.out.println(s1.substring(s1.length()-4));
       
       //System.out.println(s1.concat(date));

	}

}
