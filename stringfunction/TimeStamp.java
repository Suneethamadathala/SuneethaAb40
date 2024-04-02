package stringfunction;

import java.util.Date;

public class TimeStamp {

	public static void main(String[] args) {

Date d1= new Date();
   
   System.out.println(d1.getTime());//mechine time
   Date d2= new Date(d1.getTime());//construstor parametor //humen understand time 
    System.out.println(d2);
    String currenttime = d2.toString();
    System.out.println(currenttime);
    Date d3 = new Date(d1.getTime()+(1000*60*60*24*1)); //1day ahead time 
     System.out.println("future date --" +d3);
    
     Date d4 = new Date(d1.getTime()- (1000*60*60*24*1)); //1day ahead time 
     System.out.println("pastdate  --" +d4);
      
     String futuretime = d3.toString(); //convertime to string to use string functions 
     
     System.out.println(futuretime.substring(2, 5)); 
     System.out.println(futuretime.substring(futuretime.length()-4));
     String  month = futuretime.substring(4, 7);
     System.out.println(month);
     String  date =futuretime.substring(8, 10);
     System.out.println(date);
     String  year =futuretime.substring(24);
     System.out.println(year);
     System.out.println(month.concat(date).concat(year));
      System.out.println(month.concat(" ").concat(date).concat(" ").concat(year));
     
      System.out.println(month.concat(" /").concat(date).concat("/ ").concat(year));
        
     
	}

}
